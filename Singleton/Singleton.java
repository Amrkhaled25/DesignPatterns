
// Singleton Pattern with Thread-Safety
public class Singleton {
	public static Singleton instance ;
	public String value ;
	
	Singleton(String value) {
		this.value = value ;
	}
	
	public static Singleton getInstance(String value) {
		// this var for Double-checked locking to solve Race condition problem 
		Singleton result  =  instance ;
		if(result != null) {
			return result ;
		}
		// sync threads
		synchronized(Singleton.class) {
			if(instance == null ) {
				instance = new Singleton(value);
			}
			return instance ;
		}
	}
	
}
