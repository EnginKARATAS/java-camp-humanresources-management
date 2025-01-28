package kodlamaio.hrmsJava.api.controllers;

import java.util.List;

import kodlamaio.hrmsJava.Entity.concrates.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsJava.business.abstracts.CandidateService;

@RestController
@RequestMapping("/api/candidates")
@Repository
public class CandidateController {
	private CandidateService _candidateService;
	
	@Autowired
	public CandidateController(CandidateService _candidateService) {
 		this._candidateService = _candidateService;
	}

 
	@GetMapping("/getall")
	public List<Candidate> getAll(){
		return this._candidateService.getAll();
	}
	@PostMapping("/add")
	public boolean add(@RequestBody Candidate candidate){
		this._candidateService.add(candidate);
		return true;
	}
	
}
