package abstractFactory;

public class EconomyCar implements Vehicle{
	@Override
	public void display() {
		System.out.println("Economy Car - Fuel Efficient");
	}
}
