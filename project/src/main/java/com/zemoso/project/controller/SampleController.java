package com.zemoso.project.controller;

import com.zemoso.project.model.Sample;
import com.zemoso.project.service.serviceInterface.SampleServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/") //Give your end point here
@CrossOrigin
public class SampleController {

    @Autowired
    private SampleServiceInterface sampleServiceInterface;

    //Create a test
    @CrossOrigin
    @PostMapping("/addSample")
    public Sample create(){
        return null;
    }

    //Retrieve by ID
    @CrossOrigin
    @GetMapping("/getSample/{testId}")
    public Sample getById(@PathVariable Long id) throws Exception {
        return null;
    }

    //Retrieve all the tests
    @CrossOrigin
    @GetMapping("/getAllSamples")
    public List<Sample> getAll(){
        return null;
    }

    //Update a single test
    @CrossOrigin
    @PutMapping("/updateSample/{testId}")
    public Sample update(@PathVariable Long id) {
        return null;
    }

    //Delete a test by ID
    @CrossOrigin
    @DeleteMapping("/deleteSampleById/{testId}")
    public void deleteById(@PathVariable Long id){
    }

    @CrossOrigin
    @DeleteMapping("/deleteAllSamples")
    public void deleteAllSamples(){
    }

}
