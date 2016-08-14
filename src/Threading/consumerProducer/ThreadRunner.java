package Threading.consumerProducer;

public class ThreadRunner implements Runnable {
	private int i;
	public ThreadRunner(int i) {
		this.i = i;
	}

	@Override
	public void run() {
		try{
		Thread.sleep(1000);
		System.out.println(Thread.currentThread().getName()+" : "+i*5);
		}
		catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
	}

}
