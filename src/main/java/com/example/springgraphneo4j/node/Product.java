package com.example.springgraphneo4j.node;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Node
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    @Id
    private int id;

    private String name;

    private String namePass;

    private String createdTime;

    private List<Courses> coursesListId ;

    private List<Price> prices;

    @Relationship(type = "Enroll")
    private List<StudentEnroll> studentEnrollList;



}

