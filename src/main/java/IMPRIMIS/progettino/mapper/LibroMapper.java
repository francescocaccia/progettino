package IMPRIMIS.progettino.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import IMPRIMIS.progettino.entities.Libro;

@Mapper
public interface LibroMapper {
	List<Libro> selectAllLibri();

	Libro selectLibroById(Long id);

	void createLibro(Libro libro);

	void updateLibro(Libro libro);

	void deleteLibro(Long id);
}