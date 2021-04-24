package lab4.ex3;

public class WrittenItem extends Item{
	private String authorName;
	
	public WrittenItem() {
		super();
	}
	
     public WrittenItem(String idNumber, String title, int numberOfCopies, String authorName) {
    	 super(idNumber,title,numberOfCopies);
    	 this.authorName = authorName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
     
	public boolean equals(Object obj) {
		boolean isSame = false;
		
		if(obj instanceof WrittenItem)
		{
		  WrittenItem written = (WrittenItem)obj;	
		  boolean a = this.authorName.equals(written.authorName);
		  
		  return super.equals(obj) && a;
			
		}
		return isSame;
	}

	@Override
	public String toString() {
		return "WrittenItem [authorName=" + authorName + "]";
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("The Book Author is: "+authorName);
		System.out.println("------------------");
	}
	
}
