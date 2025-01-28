package kodlamaio.hrmsJava.api.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsJava.Entity.concrates.Job;
import kodlamaio.hrmsJava.business.abstracts.JobService;
import kodlamaio.hrmsJava.core.utilities.results.DataResult;
import kodlamaio.hrmsJava.core.utilities.results.Result;
 
@RestController
@RequestMapping("/api/jobs")
public class JobController {
	private JobService _jobService;
	
	@Autowired
	public JobController(JobService _jobService) {
 		this._jobService = _jobService;
	}

 
	@GetMapping("/getall")
	public DataResult<List<Job>> getAll(){
		return this._jobService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody Job job) {
		return this._jobService.add(job);

	}
	
}
