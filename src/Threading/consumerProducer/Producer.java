package Threading.consumerProducer;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
	BlockingQueue<String> queue;
	
	public Producer(BlockingQueue<String> queue){
		this.queue = queue;
	}
	void produce(){
		for(int i =0;i<=10;i++){
			String s = "Item "+i;
			try {
				queue.put(s);
				System.out.println("Added "+s);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		produce();
	}
}
