package Synchronize;

public class ThreadExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count c= new Count();
		Thread A = new MyCounter(c);
		A.setName("Thread A");
		Thread B = new MyCounter(c);
		B.setName("Thread B");
		A.start();
		B.start();
	}

}
