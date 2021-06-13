package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javacamp.hrms.business.abstracts.LinkService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.Link;

@RestController
@RequestMapping("/api/links")
public class LinksController {
	private LinkService linkService;

	@Autowired
	public LinksController(LinkService linkService) {
		super();
		this.linkService = linkService;
	}

	 @GetMapping("/getAll")
	public DataResult<List<Link>>getAllByJobSeekerId(@RequestParam int jobSeekerId) {
		return this.linkService.getAllByJobSeekerId(jobSeekerId);
	}

	 @PostMapping("/add")
	public Result add(@RequestBody Link link) {
		return this.linkService.add(link);
	}

	 @PostMapping("/update")
	 public Result update(@RequestBody Link link) {
			return this.linkService.update(link);
		}

	 @PostMapping("/delete")
	 public Result delete(@RequestBody Link link) {
			return this.linkService.delete(link);
		}
}
