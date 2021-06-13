package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javacamp.hrms.business.abstracts.SchoolService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.School;

@RestController
@RequestMapping("/api/schools")
public class SchoolsController {
	private SchoolService schoolService;

	@Autowired
	public SchoolsController(SchoolService schoolService) {
		super();
		this.schoolService = schoolService;
	}

	 @GetMapping("/getAll")
	public DataResult<List<School>>getAllByJobSeekerId(@RequestParam int jobSeekerId) {
		return this.schoolService.getAllByJobSeekerId(jobSeekerId);
	}

	 @PostMapping("/add")
	public Result add(@RequestBody School school) {
		return this.schoolService.add(school);
	}

	 @PostMapping("/update")
	 public Result update(@RequestBody School school) {
			return this.schoolService.update(school);
		}

	 @PostMapping("/delete")
	 public Result delete(@RequestBody School school) {
			return this.schoolService.update(school);
		}

	 
}
