package com.ora.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.toggler.MyFeatures;

@Controller
public class OffersController {

	@RequestMapping(value = "/offers", method = RequestMethod.GET)
	public ResponseEntity<?> offers() {

		if (MyFeatures.OFFERS_CONFIGURATION.isActive()) {
			 return new ResponseEntity < String > ("Feature is Active", HttpStatus.OK);
		} else {
		  return new ResponseEntity < String > ("We canot Support at this time", HttpStatus.NOT_IMPLEMENTED);
		}
	}

}
