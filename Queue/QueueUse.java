package Queue;

public class QueueUse {

	public static void main(String[] args) throws QueueFullException, QueueEmptyException{
		QueueUsingArray queue = new QueueUsingArray(5);
//		for(int i = 1; i <= 5; i++){
//			//queue.Enqueue(i);
//			try {
//				queue.Enqueue(i);
//			} catch (QueueFullException e) {
//				
//			}
//		}
		
//		while(! queue.isEmpty()){
//			try {
//				System.out.println(queue.deQueue());
//			} catch (QueueEmptyException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		queue.Enqueue(10);
		queue.Enqueue(20);
		queue.Enqueue(30);
		System.out.println("deleted element= "+queue.deQueue());
		queue.Enqueue(10);
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
