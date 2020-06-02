package br.com.mrb;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s";
	
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping(value = "sum/numberOne/numberTwo", method= RequestMethod.GET)
	public Double greeting(@PathVariable(value = "numberOne") String numberOne,@PathVariable(value = "numberTwo") String numberTwo) {
		
		return 1D;
	}
}
