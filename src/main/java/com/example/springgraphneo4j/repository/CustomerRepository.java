package com.example.springgraphneo4j.repository;

import com.example.springgraphneo4j.node.Customer;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface CustomerRepository extends Neo4jRepository<Customer, Integer> {
    Customer findByName(String name);
}
