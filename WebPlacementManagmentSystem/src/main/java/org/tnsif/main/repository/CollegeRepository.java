package org.tnsif.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tnsif.main.entites.College;

/* JPA Interface contain CRUD OPERATION 
 * REQUIRED FOR SPRING  */
public interface CollegeRepository extends JpaRepository<College , Integer> {

}
