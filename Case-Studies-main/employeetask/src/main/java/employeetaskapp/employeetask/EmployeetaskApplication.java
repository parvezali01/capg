package employeetaskapp.employeetask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages= {"com.controller","com.model"})
@EnableJpaRepositories({"com.model"})
@EntityScan("com.model")
public class EmployeetaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeetaskApplication.class, args);
	}

}
