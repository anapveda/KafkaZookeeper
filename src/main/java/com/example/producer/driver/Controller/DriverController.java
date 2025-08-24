package com.example.producer.driver.Controller;

import com.example.producer.driver.Service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class DriverController {
    @Autowired
    DriverService driverService;

    @PutMapping("/update")
    private ResponseEntity<?> updateLocation() throws InterruptedException {
        int range=10;
        while(range>0){
            //System.out.println(Math.random()+","+Math.random());
            driverService.updateLocation(Math.random()+","+Math.random());
            Thread.sleep(1000);
           range--;
        }
        return new ResponseEntity<>(Map.of("Message","Location updated"), HttpStatus.OK);
    }

}
