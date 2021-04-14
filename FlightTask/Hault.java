package flight.task;

public class Hault {

	public Hault(String airport,int duration) {
		super();
		// TODO Auto-generated constructor stub
		this.airportName = airport;
		this.duration = duration;
	}
	private String airportName;
	private int duration;
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
}