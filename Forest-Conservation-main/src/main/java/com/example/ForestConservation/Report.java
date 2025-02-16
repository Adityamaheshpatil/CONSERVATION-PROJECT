package com.example.ForestConservation;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "Report")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Report {
    // Getters and Setters
    @Id
    private ObjectId id;
    private String name;
    private String date;
    private String typeOfComplaint;
    private String description;

    // Constructors
    public Report(String name, String date, String typeOfComplaint, String description) {
        this.name = name;
        this.date = date;
        this.typeOfComplaint = typeOfComplaint;
        this.description = description;
    }

}
