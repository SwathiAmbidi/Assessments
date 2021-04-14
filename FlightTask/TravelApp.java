package flight.task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;



public class TravelApp {
	
	Flight flights[] = new Flight[1000];
	int index=0;
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		/* Write code to call Flight constructor and Flight class setter methods*/
	/*	Flight flight = null;
		
		
		FlightDetails flightDetails = new FlightDetails();
		flightDetails.printFlightDetails(flight);
		
		*/
		
		
		TravelApp obj1 = new TravelApp();
		
		while(true) {
			System.out.println("---Press---\n1 To insert flights\n2 to view flight information by flight number\n3 to get flight cost\n4.display\n5.Exit");
			int ch = in.nextInt();
			switch(ch) {
			case 1:
				obj1.insertFlights();
				break;
			case 2:
				
				System.out.println("Enter flight number to get flight details");
				String flightNum = in.next(); 
				obj1.getFlightDetails(flightNum);
			
				break;
			case 3:
				System.out.println("Enter flight number to get flight cost");
				String f = in.next(); 
				obj1.getFlightCost(f);
				break;
			case 4:
				obj1.displayAll();
				break;
			case 5:
				System.exit(0);
			}				
		}
		}
		public void insertFlights() {
			//1
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
			
			System.out.println("Enter flight number");
			String fNumber = in.next();
			
			
			System.out.println("Enter Airliner");
			String airliner = in.next();
			
			
			System.out.println("Enter Departure DateTime");
			
			String f = in.next();
			LocalDateTime fly = LocalDateTime.parse(f);
			
			System.out.println("Enter source");
			String source = in.next();
			
			
			System.out.println("Enter Destination");
			String destination = in.next();
			
			
			System.out.println("Enter Arrival DateTime");
			String A = in.next();
			LocalDateTime arr = LocalDateTime.parse(A);
			
			
			System.out.println("Enter fly type (true- for international/ false - for domestic");
			boolean fType = in.nextBoolean();
			
			
			System.out.println("Enter base fair");
			int charge = in.nextInt();
			
			
			System.out.println("Enter number of haults");
			int noOfHaults = in.nextInt();
			Hault h[] = new Hault[noOfHaults];
			for (int i = 0; i < noOfHaults; i++) {
				//Hault temp = new Hault();
				System.out.println("Enter Airport name");
				String s = in.next();
				System.out.println("Enter Duration");
				int d = in.nextInt();
				h[i] = new Hault(s,d);
			}
			Flight obj = new Flight();
			obj.setFlightNumber(fNumber);
			obj.setAirliner(airliner);
			obj.setFlyDateTime(fly);
			obj.setSource(source);
			obj.setDestination(destination);
			obj.setArrivalDateTime(arr);
			obj.setFlyType(fType);
			obj.setBaseFare(charge);
			obj.setHault(h);
			addFlight(obj);
			System.out.println(obj);
			//System.out.println("flight number is"+obj.getFlightNumber());
		}
		
		public boolean addFlight(Flight flight) {
			boolean isInserted = true;
			flights[index] = flight;
			index++;     // SQL insert qery
			return isInserted;
		}

		public void displayAll() {
			//System.out.println("inside display");
			for(int i=0; i<index; i++) {
				//System.out.println("inside for loop");
				System.out.println(flights[i].getFlightNumber()+" "+flights[i].calculateCost());
			}
		}
		public void getFlightCost(String flightNum) {
		
			for(int i=0; i<index; i++) {
				if(flights[i].getFlightNumber().equals(flightNum)) {
					//System.out.println("--------");
					System.out.println("cost of flight is "+flights[i].calculateCost());
				}
			}
			
		}
		public void getFlightDetails(String flightNum) {
			//System.out.println("-------"+flightNum);
			FlightDetails fd = new FlightDetails();
			for(int i=0; i<index; i++) {
				if(flights[i].getFlightNumber().equals(flightNum)) {
					//System.out.println("inside if"+flights[i].getFlightNumber());
					fd.printFlightDetails(flights[i]);
				}
			}
			
	
	}
	
}
