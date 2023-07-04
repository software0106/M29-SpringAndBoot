package org.tnsif.main.controller;
//program to demo restful API


import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.tnsif.main.entites.College;

//it is used to create controller
@RestController
public class CollegeController {
	@Autowired
	private CollegeService service;
	
	//RESTful API's method
	@PostMapping("/college")
	public void insert(@RequestBody Collection college)
	{
		service.create(college);
	}
	
	@DeleteMapping("/college/{id}")
	public void remove(@PathVariable Integer id)
	{
		Service.delete(id);
	}
	
	@GetMapping("/college")
	public List<College>retriveA()
	{
		return service.retriveAll();
	}
	
	@GetMapping("/college/{id}")
	public ResponseEntity<College> retreive(@PathVariable Integer id)
	{
		try {
			College college=service.retrieve(id);
			return new ResponseEntity<College>(college,HttpStatus.OK);

		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/college/{id}")
	public ResponseEntity<College>update (@RequestBody College college,@PathVariable Integer id)
	{
		try {
		College c=service.retrieve(id);
		service.create(college);
		return new ResponseEntity<College>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	
	

}
