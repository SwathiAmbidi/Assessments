package flight.task;

public class FlightDetails {

	public void printFlightDetails(Flight flight)
	{
		/* Write code to print the flight information and fare break up*/
		
		System.out.println("Flight Number is: "+flight.getFlightNumber());
		System.out.println("Air Liner: "+flight.getAirliner());
		System.out.println("Source: "+flight.getSource());
		System.out.println("Fly DateTime: "+flight.getFlyDateTime());
		System.out.println("Arrival DateTime: "+flight.getArrivalDateTime());
		//Hault obj = new Hault();
		
		for(Hault i: flight.getHault()) {
			System.out.println("Airport Name: "+i.getAirportName());
			System.out.println("Duration: "+i.getDuration());
		}
		System.out.println("Flight Number is: "+flight.getFlightNumber());
		
		System.out.println("=====Flight cost break up=====");
		System.out.println("Base Fare: "+flight.getBaseFare());
		System.out.println("Holiday Tax: "+flight.getHolidayTax());
		System.out.println("Time Tax: "+flight.getTimeTax());
		System.out.println("Friendly Tax: "+flight.getNonFriendlyTax());
		System.out.println("Airport Surcharge Tax: "+flight.getAirportSurchargeTax());
		System.out.println("Fuel Cost Tax: "+flight.getFuelCostTax());
		System.out.println("Internation Fly Tax: "+flight.getInternationFlyTax());
		System.out.println("Total cost of Flight: "+flight.calculateCost());
		
		
	}
}
