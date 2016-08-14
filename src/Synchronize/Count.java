package Synchronize;

public class Count {
	int count = 0;
	public void countIt(int i){
		synchronized (this) {
			count +=i;
			System.out.println("Thread "+Thread.currentThread().getName()+" and value is "+count);
		}
	}

}
