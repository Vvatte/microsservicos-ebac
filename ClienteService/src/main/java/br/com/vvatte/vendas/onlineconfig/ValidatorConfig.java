
package br.com.vvatte.vendas.onlineconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Configuration
public class ValidatorConfig {
	
//	@Autowired
//    ResourceBundleMessageSource messageSource;

	@Bean
    public LocalValidatorFactoryBean validatorFactory () {
		LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
//	    bean.setValidationMessageSource(messageSource);
	    return bean;
    }
}
