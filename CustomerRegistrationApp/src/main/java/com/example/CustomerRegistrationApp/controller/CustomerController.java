package com.example.CustomerRegistrationApp.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@RequestMapping("/api/v1/customers")
//@CrossOrigin(origins = "http://localhost:5173")
public class CustomerController {

    //view all customers details
    @GetMapping("/viewall")
    public String helloWorld() {
        return "Hello, World!";
    }




}
