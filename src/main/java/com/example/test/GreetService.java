package com.example.test;

import java.io.Serializable;
import java.sql.Date;
import java.util.Calendar;

import org.springframework.stereotype.Service;

@Service
public class GreetService implements Serializable {

    public String greet(String name) {
        if (name == null || name.isEmpty()) {
            return "Hello anonymous user";
        } else {
            return "Hello " + name;
        }
    }

	public String send_date(String date) {

      
        if (date == null || date.isEmpty()) {
            return "No date!";
        } else {
            return "date: " + date ;
        }
	}

}
