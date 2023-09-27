package IMPRIMIS.progettino.service;

import java.util.List;

import IMPRIMIS.progettino.entities.Libro;

public interface LibroService {
	List<Libro> getAllLibri();

	Libro getLibroById(Long id);

	void createLibro(Libro libro);

	void updateLibro(Libro libro);

	void deleteLibro(Long id);
}
