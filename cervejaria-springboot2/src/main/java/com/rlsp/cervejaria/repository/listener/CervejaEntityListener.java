package com.rlsp.cervejaria.repository.listener;

import javax.persistence.PostLoad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.rlsp.cervejaria.CervejariaApplication;
import com.rlsp.cervejaria.model.Cerveja;
import com.rlsp.cervejaria.storage.FotoStorage;

/**
 * Usado pelo MODEL (Cerveja)
 *
 */
public class CervejaEntityListener {

//	@Autowired
//	private FotoStorage fotoStorage;
	
//  final ==> nao pode modificado para NULL
	@PostLoad
	public void postLoad(final Cerveja cerveja) {
		/**
		 * Pertence ao SPRING
		 *  - Resolve as injecoes de dependencias dependentes para fotoStorage baseado no ATUAL CONTEXTO
		 *  - Isto pois, CervejaEntity nao faz parte do Contexto de Cervejaria
		 */		
		//SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
		
		FotoStorage fotoStorage = CervejariaApplication.getBean(FotoStorage.class); // Pega o Contexto de FotosStorage (Interface) para que possa ser usado dentro do Listener, ja que o listener nao eh um BEAN do spring Boots
		cerveja.setUrlFoto(fotoStorage.getUrl(cerveja.getFotoOrMockUp())); 
		cerveja.setUrlThumbnailFoto(fotoStorage.getUrl(FotoStorage.THUMBNAIL_PREFIX + cerveja.getFotoOrMockUp()));
	}
}
