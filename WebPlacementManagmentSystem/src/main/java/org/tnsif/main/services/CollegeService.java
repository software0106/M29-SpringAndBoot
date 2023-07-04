package org.tnsif.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.main.entites.College;
import org.tnsif.main.repository.CollegeRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CollegeService {

	//to inject dependency automatic
	@Autowired
	private CollegeRepository repo;

	//create
	public void create(College college)
	{
		repo.save(college);
	}
	//retrieve with Specific ID
	public College retrieve(Integer id)
	{
		return repo.findById(id).get();
	}
	//retrieve all records
	public  List<College> retriveAll()
	{
		return repo.findAll();
	}
	
	//delete with specific record
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}
	
	
	
	
	
	

}