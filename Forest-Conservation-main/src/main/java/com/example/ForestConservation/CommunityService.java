package com.example.ForestConservation;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommunityService {

    @Autowired
    private CommunityRepository communityRepository;

    public Community addQuery(String name, String queryText) {
        Community community = communityRepository.findByName(name);
        if (community == null) {
            community = new Community();
            community.setName(name);
        }
        Community.Query query = new Community.Query();
        query.setQuery(queryText);
        community.getQueries().add(query);
        return communityRepository.save(community);
    }

    public Community addReply(String name, String queryText, String replierName, String replyText) {
        Community community = communityRepository.findByName(name);
        if (community != null) {
            for (Community.Query query : community.getQueries()) {
                if (query.getQuery().equals(queryText)) {
                    Community.Reply reply = new Community.Reply(replierName, replyText);
                    query.getReplies().add(reply);
                    return communityRepository.save(community);
                }
            }
        }
        return null;
    }
}
