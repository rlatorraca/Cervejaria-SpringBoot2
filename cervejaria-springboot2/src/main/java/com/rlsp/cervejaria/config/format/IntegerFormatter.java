package com.rlsp.cervejaria.config.format;

import java.math.BigDecimal;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * Usado para fazer a conversacao de VALORES NUMERICOS em caso de INTERNACIONALIZACAO 
 *	- Mantendo os valores em R$ mesmo se a lingua for em INGLES oura qualquer que tenha moeda distinta
 * @author rlatorraca
 */

@Component
public class IntegerFormatter extends NumberFormatter<BigDecimal> {
	
	@Autowired
	private Environment env;

	@Override
	public String pattern(Locale locale) {
		return env.getProperty("bigdecimal.format", "#,##0");
	}
}
