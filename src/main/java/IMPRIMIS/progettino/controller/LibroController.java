package IMPRIMIS.progettino.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import IMPRIMIS.progettino.entities.Libro;
import IMPRIMIS.progettino.exception.LibroNotFound;
import IMPRIMIS.progettino.service.LibroService;

@RestController
@RequestMapping("/libri")
public class LibroController {

	@Autowired
	private LibroService libroService;

	@GetMapping
	public ResponseEntity<List<Libro>> getAllLibri() {
		return ResponseEntity.ok(libroService.getAllLibri());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Libro> getLibroById(@PathVariable Long id) throws LibroNotFound {
		Libro libro = libroService.getLibroById(id);
		return new ResponseEntity<>(libro, HttpStatus.OK);
	}

	@ExceptionHandler(LibroNotFound.class)
	public ResponseEntity<String> handleLibroNonTrovatoException(LibroNotFound e) {
		return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
	}

	@PostMapping
	public ResponseEntity<Void> createLibro(@RequestBody Libro libro) {
		libroService.createLibro(libro);
		return ResponseEntity.ok().build();
	}

	@PutMapping("/{id}")
	public ResponseEntity<Void> updateLibro(@PathVariable Long id, @RequestBody Libro libro) {
		libro.setId(id);
		libroService.updateLibro(libro);
		return ResponseEntity.ok().build();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteLibro(@PathVariable Long id) {
		libroService.deleteLibro(id);
		return ResponseEntity.ok().build();
	}
}
