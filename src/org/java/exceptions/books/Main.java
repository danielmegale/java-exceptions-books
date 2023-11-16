package org.java.exceptions.books;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Quanti libri vuoi aggiungere?");
		int n=in.nextInt();
		in.nextLine();
		Book[] books = new Book[n];
		
		int arrayLoop=0;
			
		try {
			while (arrayLoop < n) {
		
			System.out.println("Inserisci il titolo del libro: ");
			String titoloInput=in.nextLine();
			System.out.println("Inserisci il numero di pagine: ");
			int pagineInput=in.nextInt();
			in.nextLine();
			System.out.println("Inserisci l'autore");
			String autoreInput=in.nextLine();
			System.out.println("Inserisci l'editore");
			String editoreInput=in.nextLine();
			Book b = new Book(titoloInput,pagineInput,autoreInput,editoreInput);
			System.out.println(b);
			books[arrayLoop]=b;
			arrayLoop++;
			}
		} catch (Exception e) {
			System.out.println("Error:"+" "+e.getMessage());
		}
		finally{
			if(in!=null)
			in.close();
		}
		System.out.println("Libro aggiunto correttamente"+"\n"
				+ "----------------------------");
		
		File mioFile = new File("C:\\Users\\danim\\Desktop\\esercizi-java\\java-exceptions-books\\src\\org\\java\\exceptions\\books\\Books.txt");
		
		FileWriter myWriter = null;
		
		try{
			myWriter = new FileWriter(mioFile);

			for(int i=0; i < books.length ;i++) {
				
				myWriter.write(books[i].toString()+"\n");
			}
			
			} catch(IOException e){
				System.out.println("Error reading file:" + e.getMessage());
			}finally {
				
				if(myWriter != null)
				try {
					myWriter.close();
				} catch (IOException e) {}
			}
		
		
		
		Scanner reader=null;
		try {
			reader=new Scanner(mioFile);
			while(reader.hasNextLine()) {
				String data = reader.nextLine();
				System.out.println(data);
			}
		} catch(FileNotFoundException e) {
			System.out.println("Error reading file:" + e.getMessage());
		}finally {
			if(reader!=null)
				reader.close();			
		}
		
}
}
