package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class CreditCardAssingment {

	
	@RequestMapping(value="/cc", method=RequestMethod.POST,  consumes=MediaType.APPLICATION_JSON_VALUE)
	public String validCC(@RequestBody CreditCard cc) {
		String num = String.valueOf(cc.getNumber());
		String brand = cc.getBrand();
		//Visa
		if(brand.equalsIgnoreCase("visa")) {
			if(num.length() <= 19 && num.charAt(0) == '4') {
				return "valid Visa";
			}else return "not valid Visa";
		//Mastercard	
		}else if(brand.equalsIgnoreCase("mastercard")) {
			boolean validMastercard = (cc.getNumber() >= 510000 && cc.getNumber() <= 559999) ||
					(cc.getNumber() >= 222100 && cc.getNumber() <= 272099);
			if(num.length()==16 && validMastercard) {
				return "valid Mastercard";
			}else return "not valid Mastercard";
		}
		//JCB
		else if(brand.equalsIgnoreCase("jcb") && num.length()>=16 && num.length() <= 19) {
			String firstFour = num.substring(0,4);
			if(Integer.parseInt(firstFour) >= 3528 && Integer.parseInt(firstFour) <= 3589 ) {
				return "valid JCB";
			}else return "not valid JCB";
		}
		//enRoute
		else if(brand.equalsIgnoreCase("enroute") && num.length() == 15) {
			String firstFour = num.substring(0,4);
			if(Integer.parseInt(firstFour) >= 2014 && Integer.parseInt(firstFour) <= 2149 ) {
				return "valid JCB";
			}else return "not valid enRoute";
		}
		//Discover
		else if(brand.equalsIgnoreCase("discover")) {
			String firstSix = num.substring(0,6);
			int sixDig = Integer.parseInt(firstSix);
			if( (sixDig >= 601100 && sixDig <= 601109) ||
					(sixDig >= 601120 && sixDig <= 601149) ||
					(sixDig == 601174) ||
					(sixDig >= 601177 && sixDig <= 601179) || 
					(sixDig >= 601186 && sixDig <= 601199) || 
					(sixDig >= 644000 && sixDig <= 659999))
			return "valid Discover";
		else return "not valid Discover";
		}
	return "not valid Credit Card";
	}
	
	
}
