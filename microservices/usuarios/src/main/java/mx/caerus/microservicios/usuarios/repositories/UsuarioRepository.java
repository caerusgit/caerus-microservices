package mx.caerus.microservicios.usuarios.repositories;

import mx.caerus.microservicios.usuarios.models.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
}
