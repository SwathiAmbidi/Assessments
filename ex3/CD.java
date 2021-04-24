package lab4.ex3;

public class CD extends MediaItem {

	
	private String artist;
	private String genre;
	
	public CD() {
		super();
	}
	public CD(String title, int copies, String id, int runTime, String artist, String genre) {
		super(title, copies, id, runTime);
		this.artist = artist;
		this.genre = genre;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "CD [artist=" + artist + ", genre=" + genre + "]";
	}
	
	
}
