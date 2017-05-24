package ds.queue;

import org.omg.Messaging.SyncScopeHelper;

public class Queue {

	private int maxSize; //initializes the set number of SLOTS
	private long[] queueArray; // Slots to maintain DATA
	private int front; // index position for the element in front
	private int rear; //index position for the element in the back
	private int nItems; //counter to maintain the no. of items in our queue

	//initialize the queue by constructor

	public Queue(int size){
		this.maxSize = size;
		this.queueArray = new long[size];
		this.front = 0; //index pos of the first slot of array
		this.rear = -1; // there's no item in the array yet to be considered last item.
		this.nItems = 0; //don't have elements in array yet
	}

	public void insert(long j){ //j=1,2
		try{
			if(isFull()){
				System.out.println("It is FULL");
			}else{
				rear++;  //rear++ = 0,1
				queueArray[rear] = j; //queueArray[0] = 1; | [1] = 2;
				nItems ++; //nitems= 1, 2
			}
		}catch(Exception e){
			System.out.println("Full: " +e );
		}
	}


	public long remove(){ //remove from the front of the queue
		
			long temp = queueArray[front];  //retrieves and stores the front element
			front++;
			if(front == maxSize){ //To set front = 0 and use it again
				front = 0;
			}
			nItems--;
			return temp;
		}
		
	

	public void view(){
		System.out.print("[ ");
		for(int i=0; i< queueArray.length; i++){
			System.out.print(queueArray[i]+ " ");	
		}
		System.out.print(" ]");
	}

	public long peek(){
		return queueArray[front];
	}

	public boolean isFull(){
		/*if(rear == maxSize){
			return true;
		}else
			return false;*/
		return (nItems == maxSize);
	}

	public boolean isEmpty(){
		/*	if(front < 0){
			return true;
		}else
			return false;
	}*/
		return (nItems == 0);
	}
}
