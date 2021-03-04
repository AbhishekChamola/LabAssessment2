package com.ymsli.companyapp.exceptions;





import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

 

@ResponseStatus(value =HttpStatus.NOT_FOUND )
public class EmployeeNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -6117542027186324051L;

	public EmployeeNotFoundException (String message) {
        super(message);
       
    }

 

}