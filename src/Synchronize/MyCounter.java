package Synchronize;

public class MyCounter extends Thread {
	Count c =null;
	MyCounter(Count c){
		this.c = c;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++){
				c.countIt(i);				
			}
	}

}
