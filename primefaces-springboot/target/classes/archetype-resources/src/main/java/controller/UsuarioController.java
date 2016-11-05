#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controller;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ${package}.domain.Usuario;
import ${package}.service.UsuarioService;

@RequestScoped
@Component
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	private Usuario usuario;

	@PostConstruct
	public void init(){
		usuario = new Usuario();
	}
	
	public String cadastrarNovoUsuario(){
		
		usuarioService.salvar(usuario);

		FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Successful",  "Usuário cadastrado com sucesso!") );
        
		return "index.xhtml/?faces-redirect=true";
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
