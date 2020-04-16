package csrp.york;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

import com.york.provider.IProviderService;

@SpringBootApplication
// @EnableEurekaClient
 @EnableFeignClients(clients =IProviderService.class)
//@EnableFeignClients
@EnableDiscoveryClient
public class Cumster_Application_9001 {
	public static void main(String[] args) {
		SpringApplication.run(Cumster_Application_9001.class, args);
	}
}
