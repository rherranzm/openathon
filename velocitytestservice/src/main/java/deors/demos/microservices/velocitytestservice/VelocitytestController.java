package deors.demos.microservices.velocitytestservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class VelocitytestController {

    @Autowired
    RestTemplate restTemplate;
    
	@RequestMapping("/testTemplate")
	@ResponseBody
    @com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand(fallbackMethod = "getErrorInfo")
	public VelocityTestResponse testVelocityTemplate(@RequestBody(required=false) VelocityTestRequest request) {
		 return new VelocityTestResponse("OK", "<html><body>ok</body></html>");
	}
	
	public VelocityTestResponse getErrorInfo(VelocityTestRequest request) {
		return new VelocityTestResponse("ERRROR", "");
	}
	
}
