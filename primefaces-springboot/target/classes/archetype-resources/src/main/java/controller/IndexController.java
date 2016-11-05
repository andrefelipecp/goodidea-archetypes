#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.RequestScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ${package}.domain.Usuario;
import ${package}.service.UsuarioService;
@RequestScoped
@Component
public class IndexController {
	private Logger log = LoggerFactory.getLogger(IndexController.class);

	@Autowired
	private UsuarioService usuarioService;
	
	public List<Usuario> getUsuarios(){
		return usuarioService.buscarTodos(); 
	}
	
	@PostConstruct
	void log() {
		log.info("starting");
	}
} 