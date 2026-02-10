package br.com.isaacpatrocinio.ordersystemapi.resources.exceptions;

import java.time.Instant;

import br.com.isaacpatrocinio.ordersystemapi.services.exceptions.DatabaseException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.isaacpatrocinio.ordersystemapi.services.exceptions.ResourceNotFoundException;
import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request){
		String error = "Resource was not found";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError stdErr = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(stdErr);
	}

	@ExceptionHandler(DatabaseException.class)
	public ResponseEntity<StandardError> database(DatabaseException e, HttpServletRequest request) {
		StandardError stdErr = new StandardError(Instant.now(), HttpStatus.BAD_REQUEST.value(), "Database error", e.getMessage(), request.getRequestURI());

		return ResponseEntity.status(HttpStatus.BAD_REQUEST.value()).body(stdErr);
	}
}
