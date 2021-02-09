package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class ZipCodeAssignment {

	
	List<ZipcodeData> zips = new ArrayList<ZipcodeData>(Arrays.asList(
			
			new ZipcodeData("30326","GA", "ATLANTA", "US"),
			new ZipcodeData("60712", "IL", "LINCOLNWOOD", "US"),
			new ZipcodeData("60646", "IL", "CHICAGO","US"),
			new ZipcodeData("99501", "AK", "ANCHORAGE", "US")
		
			));
	
	@RequestMapping(method=RequestMethod.POST, value="/zipcode", consumes=MediaType.APPLICATION_JSON_VALUE, produces = "application/json")
	public ZipcodeData zipFind(@RequestBody ZipcodeData zipcode) {
		for(ZipcodeData zip : zips) {
			if(zipcode.getZipcode().equals(zip.getZipcode())){
				return zip;
			}
		}
		return new ZipcodeData(zipcode.getZipcode(), "n/a", "n/a", "n/a");
	}
	
}
