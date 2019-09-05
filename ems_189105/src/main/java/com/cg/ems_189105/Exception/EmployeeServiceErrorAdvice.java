package com.cg.ems_189105.Exception;

import java.sql.SQLException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeServiceErrorAdvice {
	// Using Exception handler
	@ExceptionHandler({ EmployeeNotFoundException.class, SQLException.class })
	protected ResponseEntity<String> handle(EmployeeNotFoundException prexp) {
		return error(HttpStatus.INTERNAL_SERVER_ERROR, prexp);
	}

	protected ResponseEntity<String> error(HttpStatus status, EmployeeNotFoundException prexp) {
		return ResponseEntity.status(status).body(prexp.getMessage());
	}
}
