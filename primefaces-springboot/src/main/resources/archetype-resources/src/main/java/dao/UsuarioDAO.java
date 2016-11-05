#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import ${package}.domain.Usuario;

@Transactional
public interface UsuarioDAO extends CrudRepository<Usuario, Long>{

	List<Usuario> findByLogin(String login);
	
}
