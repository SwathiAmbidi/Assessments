package lab4.ex3;

public class MediaItem extends Item{
	private int runTime;
	
	public MediaItem() {
		
	}
    public MediaItem(String title, int copies, String id, int runTime) {
		super(id,title, copies);
		this.runTime = runTime;
		
	}

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	@Override
	public String toString() {
		return "MediaItem [runTime=" + runTime + "]";
	}
    
    

}
