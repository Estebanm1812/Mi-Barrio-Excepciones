package exceptions;

public class NotAllowedDayException extends Exception{

	private static final long serialVersionUID = 2L;

	private int day;
	
	private int penultimate;
	
	public NotAllowedDayException(int day, int penultimate) {
		super("Not allowed day to Join");
		this.day = day;
		this.penultimate = penultimate;
		
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getPenultimate() {
		return penultimate;
	}

	public void setPenultimate(int penultimate) {
		this.penultimate = penultimate;
	}
	
}
