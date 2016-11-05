#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ${package}.dao.UsuarioDAO;
import ${package}.domain.Usuario;

@Service("usuarioService")
@Transactional
public class UsuarioService {

	@Autowired
	private UsuarioDAO usuarioDAO;
	
	public List<Usuario> buscarTodos(){
		return (List<Usuario>) usuarioDAO.findAll();
	}
	
	public Usuario salvar(Usuario usuario){
		return usuarioDAO.save(usuario);
	}
	
	public void excluir(Usuario usuario){
		usuarioDAO.delete(usuario);
	}
}