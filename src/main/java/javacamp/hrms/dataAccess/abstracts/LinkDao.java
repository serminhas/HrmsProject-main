package javacamp.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import javacamp.hrms.entities.concretes.Link;

public interface LinkDao extends JpaRepository<Link,Integer>{
	List<Link> getAllByJobSeekerId(int jobSeekerId);
}
