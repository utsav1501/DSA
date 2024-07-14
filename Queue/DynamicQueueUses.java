package Queue;

public class DynamicQueueUses {
	public static void main(String[] args) {
		
	
	DynamicQueue queue = new DynamicQueue(3);
	for(int i = 1; i <= 5; i++){
		//queue.Enqueue(i);
		try {
			queue.Enqueue(i);
		} catch (QueueFullException e) {
			
		}
	}
	
	while(! queue.isEmpty()){
		try {
			System.out.println(queue.deQueue());
		} catch (QueueEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}