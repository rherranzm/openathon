package rhm.acc.microservices.velocityTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@org.springframework.cloud.client.discovery.EnableDiscoveryClient
public class VelocityTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(VelocityTestApplication.class, args);
	}
}
