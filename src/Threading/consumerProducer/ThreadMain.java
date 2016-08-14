package Threading.consumerProducer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ThreadMain {
	public static void main(String[] args) {
		BlockingQueue<String> queue = new ArrayBlockingQueue<String>(4);
		Producer p = new Producer(queue);		
		Consumer c =  new Consumer(5, queue);
		Thread t = new Thread(p);
		t.start();
		c.consume();
	}
}
