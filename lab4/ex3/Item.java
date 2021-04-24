package lab4.ex3;

public abstract class Item {
	private String idNumber;
	private String title;
	private int numberOfCopies;
	
	
	public Item() {
		
	}
	@Override
	public String toString() {
		return "Item [idNumber=" + idNumber + ", title=" + title + ", numberOfCopies=" + numberOfCopies + "]";
	}
	public Item(String idNumber, String title, int numberOfCopies) {
		super();
		this.idNumber = idNumber;
		this.title = title;
		this.numberOfCopies = numberOfCopies;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}

	
	public  boolean equals(Object obj) {
		
		boolean isSame = false;
	
		if(obj instanceof Item)
		{
		  Item item = (Item)obj;	
		  
		  boolean a = this.idNumber.equals(item.idNumber);
		  boolean b = (this.numberOfCopies == item.numberOfCopies);
		  boolean c = this.title.equals(item.title);
		  
		  return a&&b&&c;
			
		}
		return isSame;
}
	
	
	public int checkIn(int copies) {
		this.numberOfCopies += copies;
		return numberOfCopies;
	}
	
	public int checkOut(int copies) {
		this.numberOfCopies -= copies;
		return numberOfCopies;
	}
	public void print()
	{
		System.out.println("The BookNumber: "+idNumber);
		System.out.println("The Book Title: "+title);
		System.out.println("The Book Number of Copies: "+numberOfCopies);
		
	}
}
