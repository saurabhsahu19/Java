package Threading.consumerProducer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* This is a consumer class
*/
public class Consumer {
	// Hello Brother
	//jojo-1
	int poolSize;
	BlockingQueue<String> queue;
	public Consumer(int poolSize, BlockingQueue<String> queue){
		this.poolSize = poolSize;
		this.queue = queue;
	}
	
	public void consume(){
		// try to see other threads as well-hehe
		ExecutorService service = Executors.newFixedThreadPool(5);
		for(int i=0;i<=10;i++){
			ItemProcessor ip = new ItemProcessor(queue);
			Runnable t = new Thread(ip, "Thread "+i);
			service.execute(t);
		}
		service.shutdown();
		while(!service.isTerminated()){			
		}
		System.out.println("All threads finished");
	}
	
}
