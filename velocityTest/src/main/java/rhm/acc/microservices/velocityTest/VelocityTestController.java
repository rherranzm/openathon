package rhm.acc.microservices.velocityTest;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VelocityTestController {

	@RequestMapping("/testtpl")
	public String testVelocityTemplate(Map<String,Object> input) {
		return "hola";
	}
}
