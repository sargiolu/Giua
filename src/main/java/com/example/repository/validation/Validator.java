package com.example.repository.validation;

import java.util.Map;

import com.example.model.request.UserRequest;
import org.springframework.stereotype.Service;

import com.example.constants.ValidationConstants;
import com.example.entity.User;

@Service
public class Validator {
	
	public void checkRequest(UserRequest request, Map<String, String> mappaErrori) {
		
		if (request.getName() == null) {
			mappaErrori.put(ValidationConstants.KEY_PARAMETRO_MANCANTE, ValidationConstants.ERROR_NAME_MANCANTE);
		}
		
		if (request.getEmail() == null) {
			mappaErrori.put(ValidationConstants.KEY_PARAMETRO_MANCANTE, ValidationConstants.ERROR_EMAIL_MANCANTE);
		}
		
	}
	
}