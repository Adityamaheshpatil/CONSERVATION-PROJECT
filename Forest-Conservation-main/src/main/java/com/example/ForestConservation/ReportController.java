package com.example.ForestConservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/Forest")
public class ReportController {

    @Autowired
    private ReportService reportService;



    @PostMapping("/report")
    public ResponseEntity<Report> addReport(@RequestBody Map<String, String> payload) {
        Report addedReport = reportService.addReport(
                payload.get("name"),
                payload.get("date"),
                payload.get("typeOfComplaint"),
                payload.get("description")
        );
        return ResponseEntity.ok(addedReport);
    }

    @GetMapping("/report/name/{name}")
    public ResponseEntity<List<Report>> getReportsByName(@PathVariable String name) {
        List<Report> reports = reportService.getReportsByName(name);
        return ResponseEntity.ok(reports);
    }

    @GetMapping("/report/date/{startDate}/{endDate}")
    public ResponseEntity<List<Report>> getReportsByDatePeriod(@PathVariable String startDate, @PathVariable String endDate) {
        List<Report> reports = reportService.getReportsByDatePeriod(startDate, endDate);
        return ResponseEntity.ok(reports);
    }

    @GetMapping("/report/type/{type}")
    public ResponseEntity<List<Report>> getReportsByTypeOfComplaint(@PathVariable String type) {
        List<Report> reports = reportService.getReportsByTypeOfComplaint(type);
        return ResponseEntity.ok(reports);
    }
}
