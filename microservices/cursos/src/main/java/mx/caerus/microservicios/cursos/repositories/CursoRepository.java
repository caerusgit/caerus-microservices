package mx.caerus.microservicios.cursos.repositories;

import mx.caerus.microservicios.cursos.entity.Curso;
import org.springframework.data.repository.CrudRepository;

public interface CursoRepository extends CrudRepository<Curso, Long> {
}
