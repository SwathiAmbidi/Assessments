package lab4.ex3;

public class Video extends MediaItem{

	private String directorName;
	private String genre;
	private String yearReleased;
	
	public Video() {
		super();
	}
	
	public Video(String title, int copies, String id, int runTime, String directorName, String genre,
			String yearReleased) {
		super(title, copies, id, runTime);
		this.directorName = directorName;
		this.genre = genre;
		this.yearReleased = yearReleased;
	}
	public String getDirectorName() {
		return directorName;
	}
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getYearReleased() {
		return yearReleased;
	}
	public void setYearReleased(String yearReleased) {
		this.yearReleased = yearReleased;
	}
	@Override
	public String toString() {
		return "Video [directorName=" + directorName + ", genre=" + genre + ", yearReleased=" + yearReleased + "]";
	}

	

}
