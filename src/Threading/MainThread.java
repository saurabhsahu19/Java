package Threading;

public class MainThread {
	
	public static void main(String[] args) {
		System.out.println("Thread Name "+Thread.currentThread().getName());
		for(int i=0;i<=7;i++){
			Thread t = new Thread("Thread "+i){
				public void run() {
					System.out.println("Thread "+getName()+" is running");
				};
			};
			t.start();
		}
	}
}
