package IMPRIMIS.progettino.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import IMPRIMIS.progettino.entities.Libro;
import IMPRIMIS.progettino.exception.LibroNotFound;
import IMPRIMIS.progettino.mapper.LibroMapper;

@Service
public class LibroServiceImpl implements LibroService {

	@Autowired
	private LibroMapper libroMapper;

	@Override
	public List<Libro> getAllLibri() {
		return libroMapper.selectAllLibri();
	}

	@Override
	public Libro getLibroById(Long id) throws LibroNotFound {
		Libro libro = libroMapper.selectLibroById(id);
		if (libro == null) {
			throw new LibroNotFound("Nessun libro trovato con ID: " + id);
		}
		return libro;
	}

	@Override
	public void createLibro(Libro libro) {
		libroMapper.createLibro(libro);
	}

	@Override
	public void updateLibro(Libro libro) {
		libroMapper.updateLibro(libro);
	}

	@Override
	public void deleteLibro(Long id) {
		libroMapper.deleteLibro(id);
	}
}
