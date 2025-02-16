package com.example.ForestConservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService {

    @Autowired
    private ReportRepository reportRepository;
//
//    public Report addReport(Report report) {
//        return reportRepository.save(report);
//    }
//private String name;
//    private String date;
//    private String typeOfComplaint;
//    private String description;
    public Report addReport(String name, String date, String typeOfComplaint, String description) {
    Report report = new Report(name, date, typeOfComplaint,description);
    return reportRepository.save(report);
}

    public List<Report> getReportsByName(String name) {
        return reportRepository.findByName(name);
    }

    public List<Report> getReportsByDatePeriod(String startDate, String endDate) {
        return reportRepository.findByDateBetween(startDate, endDate);
    }

    public List<Report> getReportsByTypeOfComplaint(String type) {
        return reportRepository.findByTypeOfComplaint(type);
    }
}
