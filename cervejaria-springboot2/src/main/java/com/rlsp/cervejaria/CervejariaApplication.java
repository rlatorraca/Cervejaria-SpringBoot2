package com.rlsp.cervejaria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Inicializaca o Spring Boot
 * @author rlatorraca
 */
@SpringBootApplication
public class CervejariaApplication {
	
	private static ApplicationContext APPLICATION_CONTEXT;
	
	public static void main(String[] args) {
		APPLICATION_CONTEXT = SpringApplication.run(CervejariaApplication.class, args);
	}
	
	/**
	 * Devolve um BEAN do tipo ApplicationContext	  
	 */
	public static <T> T getBean(Class<T> requiredType) {
		return APPLICATION_CONTEXT.getBean(requiredType);
	}
}
