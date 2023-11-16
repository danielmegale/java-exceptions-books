package org.java.exceptions.books;

public class Book {
	private String titolo;
	private int numeroPagine;
	private String autore;
	private String editore;
	public Book(String titolo,int numeroPagine,String autore,String editore) throws Exception {
		setTitolo(titolo);
		setNumeroPagine(numeroPagine);
		setAutore(autore);
		setEditore(editore);
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) throws Exception {
		if(titolo == null || titolo.isEmpty())
			throw new Exception("Titol cannot be null");
		this.titolo = titolo;
	}
	public int getNumeroPagine() {
		return numeroPagine;
	}
	public void setNumeroPagine(int numeroPagine) throws Exception {
		if(numeroPagine <=0)
			throw new Exception("Page number cannot 0");
		this.numeroPagine = numeroPagine;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) throws Exception {
		if(autore== null || autore.isEmpty())
			throw new Exception("Autor cannot be null");
		this.autore = autore;
	}
	public String getEditore() {
		return editore;
	}
	public void setEditore(String editore) throws Exception {
		if(editore == null || editore.isEmpty())
			throw new Exception("Editor cannot be null");
		this.editore = editore;
	}
	
	@Override
	public String toString() {
		return   "Titolo"+ " " + titolo+"\n"
				+"Pagine:" + " " + numeroPagine + "\n"
				+"Autore:" + " " + autore + "\n"
				+"editore:" + " " + editore + "\n"
				+"-------------------------------"+"\n"
				;
	}
}
