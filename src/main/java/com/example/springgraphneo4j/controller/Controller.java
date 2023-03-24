package com.example.springgraphneo4j.controller;

import com.example.springgraphneo4j.node.*;
import com.example.springgraphneo4j.repository.CustomerRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {
    private CustomerRepository repository;

    public Controller(CustomerRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    public void purchaseOrder(){
        List<Product> products = new ArrayList<>();
        List<Courses> courseIListId = new ArrayList<>();
        List<Price> pricesList = new ArrayList<>();
        List<StudentEnroll> studentEnrollList = new ArrayList<>();



        courseIListId.add(new Courses(4,"", "Naman UPSC"));
        courseIListId.add(new Courses(5,"", "Sharad UPSC"));

        pricesList.add(new Price(2, 2, 12.0));
        pricesList.add(new Price(3, 7, 18.05));

        studentEnrollList.add(new StudentEnroll("1","Shahid","12d8212","12-09-22","2","12-09-24"));
        studentEnrollList.add(new StudentEnroll("2","Sapna","128sd22312","12-09-22","3","12-09-25"));

        studentEnrollList.add(new StudentEnroll("3","Sharad","12238212","12-09-22","4","12-09-26"));

        studentEnrollList.add(new StudentEnroll("4","Ravi","12823sdd212","12-09-22","1","12-09-23"));


        products.add(new Product(2,"Pass 2","PASS 2", "12-12-12",courseIListId, pricesList, studentEnrollList ));
        Customer customer = new Customer();
        customer.setCid(1);
        customer.setName("Subscription");
        customer.setAddress(new String[] {"Agra", "Panchvati"} );
        customer.setProducts(products);
        repository.save(customer);


    }

    @GetMapping("/getOrders")
    public List<Customer> getPurchaseOrder(){
        return (List<Customer>) repository.findAll();

    }

    @GetMapping("getInfo/{name}")
    public Customer getInfo(@PathVariable String name){
        return repository.findByName(name);
    }
}
