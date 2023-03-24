package com.example.springgraphneo4j.node;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentEnroll {

    @Id
    private String id;

    private String name;

    private String StudentId;
    private String purchaseDate;
    private String passType;

    private String endDate;




}
