package com.tnsif.interfacedemo;

public interface Printable {

}

//Implement the marker interface
public class Document implements Printable {
	private String content;
	
	public Document(String content) {
		this.content = content;
	}
	
	public String getContent() {
		return content;
	}
}

//Use the marker interface
public class Printer {
	public static void print(Printable printable) {
		if (printable instanceof Printable) {
			Printable document = (Printable) printable;
		}
		
		public static void main(String[] args) {
			Printable document = new Printable("Hello, world!");
			print(document);
		
	}
}

