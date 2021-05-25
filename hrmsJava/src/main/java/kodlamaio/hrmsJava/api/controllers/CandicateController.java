package kodlamaio.hrmsJava.api.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsJava.Entity.concrates.Candicate;
 import kodlamaio.hrmsJava.business.abstracts.CandicateService;
  
@RestController
@RequestMapping("/api/candicates")
public class CandicateController {
	private CandicateService _candicateService;
	
	@Autowired
	public CandicateController(CandicateService _candicateService) {
 		this._candicateService = _candicateService;
	}

 
	@GetMapping("/getall")
	public List<Candicate> getAll(){
		return this._candicateService.getAll();
	}
	@PostMapping("/add")
	public boolean add(@RequestBody Candicate candicate){
		this._candicateService.add(candicate);
		return true;
	}
	
}
