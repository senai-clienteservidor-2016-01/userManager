package br.com.gjl.usermanager.persistencia;

import org.springframework.stereotype.Repository;

import br.com.ambientinformatica.jpa.persistencia.PersistenciaJpa;
import br.com.gjl.usermanager.entidade.Usuario;

@Repository("usuarioDao")
public class UsuarioDaoJpa extends PersistenciaJpa<Usuario> implements UsuarioDao {

   private static final long serialVersionUID = 1L;

}
