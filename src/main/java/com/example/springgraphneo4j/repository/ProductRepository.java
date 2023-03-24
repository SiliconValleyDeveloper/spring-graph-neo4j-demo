package com.example.springgraphneo4j.repository;

import com.example.springgraphneo4j.node.Product;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface ProductRepository extends Neo4jRepository<Product, Integer> {

}
