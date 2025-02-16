package com.example.ForestConservation;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReportRepository extends MongoRepository<Report, ObjectId> {
    List<Report> findByName(String name);

    List<Report> findByDateBetween(String startDate, String endDate);

    List<Report> findByTypeOfComplaint(String type);
}
