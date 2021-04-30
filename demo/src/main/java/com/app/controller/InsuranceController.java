package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.app.dto.Quote;
import com.app.dto.RequestDTO;

@RestController
@RequestMapping("/get-quote")
public class InsuranceController {

	@Autowired
	private Quote quote;
	
	public InsuranceController() {
		System.out.println("in ctor of "+getClass().getName());
	}
	
	@GetMapping("/")
	public ResponseEntity<String> welcomeUser(){
		return new ResponseEntity<String>("Hello user", HttpStatus.OK);
	}
	@PostMapping("/digit")
	public ResponseEntity<?> getDigitQuote(@RequestBody RequestDTO request){
		System.out.println("in getQuote method "+request);
		if(request.getMake().equals("Honda")) {
			String url = "http://api.mocki.io/v2/31275098\r\n";
			RestTemplate restTemplate = new RestTemplate();
			quote = restTemplate.getForObject(url, Quote.class);
			quote.setCarQuote(quote.getCarQuote() * request.getYrs());
			return new ResponseEntity<Quote>(quote, HttpStatus.OK); 
		}
		return new ResponseEntity<String>("Can not get qoute for your car", HttpStatus.OK);
	}
	@PostMapping("/hdfc")
	public ResponseEntity<?> getHdfcQuote(@RequestBody RequestDTO request){
		System.out.println("in getQuote method "+request);
		if(request.getMake().equals("Honda")) {
			String url = "http://api.mocki.io/v2/913fb6ee";
			RestTemplate restTemplate = new RestTemplate();
			quote = restTemplate.getForObject(url, Quote.class);
			quote.setCarQuote(quote.getCarQuote() * request.getYrs());
			return new ResponseEntity<Quote>(quote, HttpStatus.OK); 
		}
		return new ResponseEntity<String>("Can not get qoute for your car", HttpStatus.OK);
	}
}
