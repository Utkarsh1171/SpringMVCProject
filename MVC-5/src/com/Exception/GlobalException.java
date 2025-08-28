package com.Exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class GlobalException {
	@ExceptionHandler(value= NullPointerException.class)
	public String globalNullPointer(Model model) {
		model.addAttribute("msg", "Credential Invalid");
		
		System.out.println("Global NullPointer Exception handel");
		return "error";
		
	}

}
