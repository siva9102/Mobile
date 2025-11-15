package com.globalExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class GlobalException {
	@ExceptionHandler(NameNotFoundException.class)
	public ResponseEntity<Object> rest(NameNotFoundException ne){
	return new ResponseEntity<Object> (ne.getMessage(),HttpStatus.ALREADY_REPORTED);
}
	@ExceptionHandler(NumberNotFoundException.class)
	public ResponseEntity<Object> rest(NumberNotFoundException nn){
	return new ResponseEntity<Object> (nn.getMessage(),HttpStatus.BAD_REQUEST);
}	
	@ExceptionHandler(ColorNotFoundException.class)
	public ResponseEntity<Object> rest(ColorNotFoundException nn){
	return new ResponseEntity<Object> (nn.getMessage(),HttpStatus.BAD_GATEWAY);
}	
}