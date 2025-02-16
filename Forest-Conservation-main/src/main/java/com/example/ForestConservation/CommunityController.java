package com.example.ForestConservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/Forest")
public class CommunityController {

    @Autowired
    private CommunityService communityService;

    @PostMapping("/community/addQuery")
    public ResponseEntity<Community> addQuery(@RequestBody Map<String, String> payload) {
        String name = payload.get("name");
        String query = payload.get("query");
        Community community = communityService.addQuery(name, query);
        return ResponseEntity.ok(community);
    }

    @PostMapping("/community/addReply")
    public ResponseEntity<Community> addReply(@RequestBody Map<String, String> payload) {
        String name = payload.get("name");
        String query = payload.get("query");
        String replierName = payload.get("replierName");
        String reply = payload.get("reply");
        Community community = communityService.addReply(name, query, replierName, reply);
        if (community != null) {
            return ResponseEntity.ok(community);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
