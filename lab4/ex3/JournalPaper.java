package lab4.ex3;

public class JournalPaper extends WrittenItem{

	
	private int yearPublished;

	public JournalPaper() {
		super();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public JournalPaper(String id, String title, int copies, String authorName, int  yearPublished) {
		super(id, title, copies, authorName);
		this.yearPublished = yearPublished;
	}
	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
	
	
	
	
}
