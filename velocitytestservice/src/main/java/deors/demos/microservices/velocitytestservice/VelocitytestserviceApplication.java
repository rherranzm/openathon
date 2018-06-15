package deors.demos.microservices.velocitytestservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@org.springframework.cloud.client.discovery.EnableDiscoveryClient
public class VelocitytestserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VelocitytestserviceApplication.class, args);
	}
}
