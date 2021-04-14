package flight.task;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Duration;
import java.time.LocalDate;
//import  java.time.temporal.ChronoUnit.MINUTES;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;


public class Flight {

	


	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Flight(String flightNumber, String airliner, String source, LocalDateTime flyDateTime, String destination,
			LocalDateTime arrivalDateTime, boolean flyType, int internationFlyTax) {
		super();
		this.flightNumber = flightNumber;
		this.airliner = airliner;
		this.source = source;
		this.flyDateTime = flyDateTime;
		this.destination = destination;
		this.arrivalDateTime = arrivalDateTime;
		///this.hault = hault;
		this.flyType = flyType;
		this.internationFlyTax = internationFlyTax;
		//this.baseFare = baseFare;
		///*this.holidayTax = holidayTax;
//		this.nonFriendlyTax = nonFriendlyTax;
	//	this.airportSurchargeTax = airportSurchargeTax;
		//this.fuelCostTax = fuelCostTax;
		//this.finalCost = finalCost;
		//this.timeTax = timeTax;
		
	}


	private String flightNumber;
	private String airliner;
	
	private String source;
	private LocalDateTime flyDateTime;
	
	private String destination;
	private LocalDateTime arrivalDateTime;
	
	private Hault[] hault; // can be null;
	
	private boolean flyType; // domestic (false) or international(true)
	
	private int internationFlyTax; 
	private int baseFare; // always include 5% as airport surcharge and 30% as fuel cost
	private double holidayTax;
	private double nonFriendlyTax;
	private double airportSurchargeTax;
	private double fuelCostTax;
	private int finalCost;// based on Airliner calendar and other criteria's 
	private double timeTax;
	
	
	public double getTimeTax() {
		return timeTax;
	}


	public void setTimeTax(double timeTax) {
		this.timeTax = timeTax;
	}


	public double getAirportSurchargeTax() {
		return airportSurchargeTax;
	}


	public void setAirportSurchargeTax(double surcharge) {
		this.airportSurchargeTax = surcharge;
	}


	public double getFuelCostTax() {
		return fuelCostTax;
	}


	public void setFuelCostTax(double fuelCost) {
		this.fuelCostTax = fuelCost;
	}

	
	public double getHolidayTax() {
		return holidayTax;
	}


	public void setHolidayTax(double holidayCharge) {
		this.holidayTax = holidayCharge;
	}
	
	public double getNonFriendlyTax() {
		return nonFriendlyTax;
	}


	public void setNonFriendlyTax(double nonArrivalCharge) {
		this.nonFriendlyTax = nonArrivalCharge;
	}
	
	public String getFlightNumber() {
		return flightNumber;
	}


	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}


	public String getAirliner() {
		return airliner;
	}


	public void setAirliner(String airliner) {
		this.airliner = airliner;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}


	public LocalDateTime getFlyDateTime() {
		return flyDateTime;
	}


	public void setFlyDateTime(LocalDateTime flyDateTime) {
		this.flyDateTime = flyDateTime;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public LocalDateTime getArrivalDateTime() {
		return arrivalDateTime;
	}


	public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}


	public Hault[] getHault() {
		return hault;
	}


	public void setHault(Hault[] hault) {
		this.hault = hault;
	}


	public boolean isFlyType() {
		return flyType;
	}


	public void setFlyType(boolean flyType) {
		this.flyType = flyType;
	}


	public int getInternationFlyTax() {
		return internationFlyTax;
	}


	public void setInternationFlyTax(int internationFlyTax) {
		this.internationFlyTax = internationFlyTax;
	}


	public int getBaseFare() {
		return baseFare;
	}


	public void setBaseFare(int baseFare) {
		this.baseFare = baseFare;
	}


	public int getFinalCost() {
		return finalCost;
	}


	public void setFinalCost(int finalCost) {
		this.finalCost = finalCost;
	}
	


    public double daysDifferenceWithCalender(LocalDateTime arr) {
    	AirlinerCalendar obj = new AirlinerCalendar();
    	LocalDate arrivalDate = arr.toLocalDate();
    	double result = 0;
    	for(LocalDate l: obj.listOfHolidays) {
    		long diff = ChronoUnit.DAYS.between(arrivalDate, l);
    		if(diff < 10 &&  diff >1) {
    			result = 0.2;
    		}
    		if(diff <= 1 &&  diff >=0) {
    			result =  0.5;
    		}	
    	}
    	return result;
		
	}

    public double getTimeDifference(LocalDateTime arr) {
    	AirlinerCalendar obj = new AirlinerCalendar();
    	LocalTime arrivalTime = arr.toLocalTime();
    	LocalTime standardTime = LocalTime.parse("12:00:00");
    	double result = 0;
    	if(Math.abs((int)ChronoUnit.HOURS.between(arrivalTime, standardTime)) ==2) {
    		result = 0.1;
    	}
    	return result;
    	
    }
    public boolean isFriendlyCountry(String destination) {
    	FriendlyCountry fc = new FriendlyCountry();
    	for(String s: fc.countries) {
    		if(s.equals(destination)) return true;
    	}
    	return false;
    }
    	
    public double taxForNonFriendlyCountry(String destination) {
    	FriendlyCountry fc = new FriendlyCountry();
    	double result=0.3;
    	for(String s: fc.countries) {
    		if(s.equals(destination))
    			result = 0;
    	}
    	return result;
    }
    
    
	public int calculateCost()
	{
		/*
		 * Cost of the flight will be decided by 
		 * 1. arrival date. :-
		 * 		1.a)  If 10 to 2 days prior to the AirlinerCalendar Date	 :- 20% extra
		 * 		1.b)  If 1 to 0 day prior to the AirlinerCalendar Date 	:-  50% extra	
		 * 2. arrival time.
		 * 		2.a) If flight land time is 2 hr +/- to 12:00 Noon (Any Date)	:- 10% extra
		 * 3. Non free travel countries (List of FriendlyCountry.java)
		 * 		3.a) If destination belongs to non free travel, friendly country :- 30% extra
		 * */
		
       if(flyType==false) {
    	   internationFlyTax = 0;
       }
       else if(flyType ==true && isFriendlyCountry(destination))
    	   internationFlyTax = 0;
       else
    	   internationFlyTax = 1000;
		holidayTax = baseFare*daysDifferenceWithCalender(arrivalDateTime);
        timeTax = baseFare*getTimeDifference(arrivalDateTime);
        nonFriendlyTax = baseFare*taxForNonFriendlyCountry(destination);
        fuelCostTax = baseFare*0.3;
        airportSurchargeTax = baseFare*0.05;
        
		finalCost = (int)(holidayTax+timeTax+nonFriendlyTax+fuelCostTax+airportSurchargeTax)+internationFlyTax;
		
		return (baseFare+finalCost);
	}


	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", airliner=" + airliner + ", source=" + source
				+ ", flyDateTime=" + flyDateTime + ", destination=" + destination + ", arrivalDateTime="
				+ arrivalDateTime + ", hault=" + Arrays.toString(hault) + ", flyType=" + flyType
				+ ", internationFlyTax=" + internationFlyTax + ", baseFare=" + baseFare + ", holidayTax=" + holidayTax
				+ ", nonFriendlyTax=" + nonFriendlyTax + ", airportSurchargeTax=" + airportSurchargeTax
				+ ", fuelCostTax=" + fuelCostTax + ", finalCost=" + finalCost + ", timeTax=" + timeTax + "]";
	}

	

}
