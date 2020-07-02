package com.rlsp.cervejaria.config.format;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * Usado nas validacoes de DATAS
 * @author rlatorraca
 *
 */
@Component
public class LocalDateFormatter extends TemporalFormatter<LocalDate> {
	
	@Autowired
	private Environment env;

	// Pega o Padrao do locale (a depender da lingua) , no caso ta fixo pra pt-BR
	@Override
	public String pattern(Locale locale) {
		return env.getProperty("localdate.format-" + locale, "dd/MM/yyyy");
	}

	@Override
	public LocalDate parse(String text, DateTimeFormatter formatter) {
		return LocalDate.parse(text, formatter);
	}	
}
