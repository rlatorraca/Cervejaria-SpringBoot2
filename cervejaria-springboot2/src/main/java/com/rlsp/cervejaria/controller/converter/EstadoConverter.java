package com.rlsp.cervejaria.controller.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.rlsp.cervejaria.model.Cidade;
import com.rlsp.cervejaria.model.Estado;

@Component
public class EstadoConverter implements Converter<String, Estado> {

	@Override
	public Estado convert(String codigo) {
		if (!StringUtils.isEmpty(codigo)) {
			Estado estado = new Estado();
			estado.setCodigo(Long.valueOf(codigo));
			return estado;
		}
		
		return null;
	}}
