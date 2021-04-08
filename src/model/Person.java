package model;

public class Person {

	private DocumentType document;
	private String id;
	
	public Person(String document, String id) {
		
		this.document = DocumentType.valueOf(document);
		this.id = id;
	}

	public DocumentType getDocument() {
		return document;
	}

	public void setDocument(DocumentType document) {
		this.document = document;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
