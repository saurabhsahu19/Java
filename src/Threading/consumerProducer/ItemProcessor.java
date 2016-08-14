package Threading.consumerProducer;

import java.util.concurrent.BlockingQueue;

/*
 * class to process items
 */
public class ItemProcessor implements Runnable{
	private BlockingQueue<String> queue;
	
	ItemProcessor(BlockingQueue<String> queue){
		this.queue = queue;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		processQueue();		
	}
	
	private void processQueue(){
		String s;
		while(!queue.isEmpty()){
			try {
				s = queue.take();
				System.out.println("Consumed Thread "+Thread.currentThread().getName()+" item no. "+s);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
