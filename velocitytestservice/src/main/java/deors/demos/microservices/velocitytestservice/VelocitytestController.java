package deors.demos.microservices.velocitytestservice;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VelocitytestController {

	@RequestMapping("/testTemplate")
	public String testVelocityTemplate(String tmpl, Map<String, Object> data) {
		return null;
	}
	
}
