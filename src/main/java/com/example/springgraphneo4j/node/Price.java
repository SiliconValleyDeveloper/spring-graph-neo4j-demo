package com.example.springgraphneo4j.node;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;



@Node
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Price {

    @Id
    private int id;
    private int month;

    private double price;



}
