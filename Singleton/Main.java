
public class Main {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());
        thread1.start();
        thread2.start();
	}
	static class Thread1 implements Runnable {
	    @Override
	    public void run() {
	        Singleton singleton = Singleton.getInstance("Same Value ! Correct");
	        System.out.println(singleton.value);
	    }
	}

	static class Thread2 implements Runnable {
	    @Override
	    public void run() {
	        Singleton singleton = Singleton.getInstance("Different Value ! Wrong ");
	        System.out.println(singleton.value);
	    }
	}
}
/*
	Singleton is a creational design pattern that lets you ensure 
 	that a class has only one instance, while providing a global access point to this instance.

  	Ex : Database Connection
*/


