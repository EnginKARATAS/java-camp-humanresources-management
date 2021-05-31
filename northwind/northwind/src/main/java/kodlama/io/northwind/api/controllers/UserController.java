package kodlama.io.northwind.api.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

 
import kodlama.io.northwind.business.abstracts.UserService;
import kodlama.io.northwind.core.entities.User;
import kodlama.io.northwind.core.utilities.results.ErrorDataResult;
import org.springframework.validation.FieldError;
import org.springframework.http.HttpStatus;
@RestController
@RequestMapping(value="/api/users")
public class UserController {

	private UserService _userService;

	@Autowired
	public UserController(UserService _userService) {
		super();
		this._userService = _userService;
	}
	
	@PostMapping(value="/add")
	public ResponseEntity<?> add(@RequestBody User user) {
		return ResponseEntity.ok(this._userService.add(user));
	}
	
	//typeof() c#taydı burda .class	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorDataResult<Object> handleValidationException
	(MethodArgumentNotValidException exceptions){
		Map<String,String> validationErrors = new HashMap<String, String>();
		for(FieldError fieldError : exceptions.getBindingResult().getFieldErrors()) {
			validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
		}
		
		ErrorDataResult<Object> errors 
		= new ErrorDataResult<Object>(validationErrors,"Doğrulama hataları");
		return errors;
	}
}
