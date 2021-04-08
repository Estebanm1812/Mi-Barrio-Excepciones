package exceptions;

public class MinorAgeException extends Exception{

	private static final long serialVersionUID = 1L;

	private String documentType;
	
	public MinorAgeException(String documentType) {
		super("The minor ages cant go into the market");
		this.documentType = documentType;
	}
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String type) {
		documentType = type;
	}
	
}
