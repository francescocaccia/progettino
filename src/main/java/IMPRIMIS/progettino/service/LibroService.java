package IMPRIMIS.progettino.service;

import java.util.List;

import IMPRIMIS.progettino.entities.Libro;
import IMPRIMIS.progettino.exception.LibroNotFound;

public interface LibroService {
	List<Libro> getAllLibri();

	Libro getLibroById(Long id) throws LibroNotFound;

	void createLibro(Libro libro);

	void updateLibro(Libro libro);

	void deleteLibro(Long id);
}
