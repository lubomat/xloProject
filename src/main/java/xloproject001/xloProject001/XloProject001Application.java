package xloproject001.xloProject001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@SpringBootApplication
public class XloProject001Application {

	public static void main(String[] args) {
		SpringApplication.run(XloProject001Application.class, args);
	}

	@Bean
	Validator validator() {
		return new LocalValidatorFactoryBean();

	}

}
