package com.xg.bysj;

import com.xg.bysj.jpaRepository.MyRepositoryFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(
		basePackages = "com.xg.bysj.dao",
		repositoryFactoryBeanClass = MyRepositoryFactoryBean.class)
public class BysjApplication {

	public static void main(String[] args) {
		SpringApplication.run(BysjApplication.class, args);
	}
}
