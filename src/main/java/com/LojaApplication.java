package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 15 02 2019
 */
@ComponentScan(basePackages = {"com.booksgames.loja"})
@SpringBootApplication
@EnableWebMvc
@Configuration
@EnableTransactionManagement
public class LojaApplication {

	private static final Logger LOG = LoggerFactory.getLogger(LojaApplication.class);

	public static void main(String[] args) {
		LOG.info("INICIANDO...");
		SpringApplication.run(LojaApplication.class, args);
		LOG.info("INICIOU NORMALMENTE porta 8080");
	}
}

