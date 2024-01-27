
package factory;

import java.util.Scanner;

public class Main {
	private static VehicleCreator vehicleObj ;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Vehicle Type: ");
		String vehicleType = scanner.nextLine();
		
		switch(vehicleType) {
		case "car":
			vehicleObj = new CarCreator() ;
			break;
		case "bus":
			vehicleObj = new BusCreator() ;
			break;
		case "truck":
			vehicleObj = new TruckCreator() ;
			break;
		default :
			break;
		}
		try {
		System.out.println(vehicleObj.rentVehicleMethod());
		System.out.println(vehicleObj.sellVehicleMethod());
		}catch(Exception e) {
			System.out.println("Invalid input.Enter Valid object name") ;
		}
	}
		

}


/*
	Factory method is a creational design pattern which solves the problem of creating product objects
 	without specifying their concrete classes.

 	Ex : Rent vehicle Company every week has a different types of vehicles , 
  	okay that is great but we won't edit entire code every week we will just add new class for new vehicles




*/
