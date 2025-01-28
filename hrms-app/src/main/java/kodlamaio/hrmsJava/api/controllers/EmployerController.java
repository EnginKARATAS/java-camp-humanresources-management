package kodlamaio.hrmsJava.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsJava.Entity.concrates.Employer;
import kodlamaio.hrmsJava.Entity.concrates.Job;
import kodlamaio.hrmsJava.business.abstracts.EmployerService;
import kodlamaio.hrmsJava.core.utilities.results.DataResult;
import kodlamaio.hrmsJava.core.utilities.results.Result;

@RestController
@RequestMapping("/api/jobs")
public class EmployerController {
	private EmployerService _employerService;
	
	@Autowired
	public EmployerController(EmployerService _employerService) {
		this._employerService = _employerService;
	}


	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll(){
		return this._employerService.getAll();
	}
		
	@PostMapping("/add")
	public Result add(@RequestBody Employer employer) {
		return this._employerService.add(employer);

	}
	
}

