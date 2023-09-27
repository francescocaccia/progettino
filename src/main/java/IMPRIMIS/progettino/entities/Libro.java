package IMPRIMIS.progettino.entities;

public class Libro {

	private Long id;
	private String titolo;
	private String autore;
	private String genere;
	private String annodipubblicazione; // Ho modificato il nome della variabile qui

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public String getAnnodipubblicazione() { // E ho modificato il nome del metodo getter qui
		return annodipubblicazione;
	}

	public void setAnnodipubblicazione(String annodipubblicazione) { // E anche il nome del metodo setter
		this.annodipubblicazione = annodipubblicazione;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titolo=" + titolo + ", autore=" + autore + ", genere=" + genere
				+ ", annodipubblicazione=" + annodipubblicazione + "]"; // E ho aggiornato la stringa di
																		// rappresentazione
	}
}
