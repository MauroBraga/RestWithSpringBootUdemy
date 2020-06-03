package br.com.mrb;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

	
	@RequestMapping(value = "sum/numberOne/numberTwo", method= RequestMethod.GET)
	public Double greeting(@PathVariable(value = "numberOne") String numberOne,@PathVariable(value = "numberTwo") String numberTwo)throws Exception {
		if(!isNumeric(numberOne) || isNumeric(numberTwo)) {
			throw new Exception();
		}
		Double sum = convertDouble(numberOne) + convertDouble(numberTwo);
		return sum;
	}

	private Double convertDouble(String numberTwo) {
		// TODO Auto-generated method stub
		return 1D;
	}

	private boolean isNumeric(String numberOne) {
		return false;
	}
}
