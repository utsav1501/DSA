package PriorityQueue;
public class InplaceHeapSort {

	private static void insertIntoVirtualHeap(int[] arr, int i) {
		int childIndex = i;
		//System.out.println(childIndex);
		int parentIndex = (childIndex - 1) / 2;
		//System.out.println(parentIndex);
		//System.out.println(1/2);
		while(childIndex > 0){
			if(arr[childIndex] < arr[parentIndex] ){
				int temp = arr[childIndex];
				arr[childIndex] = arr[parentIndex];
				arr[parentIndex] = temp;
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			}else{
				return;
			}
		}

	}

	private static int removeMinFromVirtualHeap(int[] arr, int heapSize) {

		int temp = arr[0];
		arr[0] = arr[heapSize - 1];
		heapSize--;
		//System.out.println(arr[2]);
		//System.out.println(heapSize);
		int index = 0;
		int leftChildIndex = 2 * index + 1;
		int rightChildIndex = 2 * index + 2;
//		if(heapSize==2) {
//		System.out.println("RCI "+arr[2]);
//		}
		while(leftChildIndex < heapSize){  //ye hum just swap karne ke liye kr rhe hain index ko uske leftChild aur Rightchild se;
			int minIndex = index;
			if(arr[leftChildIndex] < arr[minIndex]){
				minIndex = leftChildIndex;
			}
			if(rightChildIndex < heapSize && arr[rightChildIndex] < arr[minIndex]){
				minIndex = rightChildIndex;
			}
			if(minIndex != index){
				int temp1 = arr[index];
				arr[index] = arr[minIndex];
				arr[minIndex]  = temp1;
				index = minIndex;
				leftChildIndex = 2 * index + 1;
				rightChildIndex = 2 * index + 2;
			}else{
				break;
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {5,1,9,2};
		for(int i = 0; i < arr.length; i++){
			insertIntoVirtualHeap(arr,i);//yha pe element heap me chala jeyega....
		}

		for(int i = 0; i < arr.length; i++){
			arr[arr.length - 1 - i] = removeMinFromVirtualHeap(arr, arr.length - i);
		}

		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}

	}


}
