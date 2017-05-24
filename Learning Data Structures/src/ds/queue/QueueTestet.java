package ds.queue;

import javax.swing.plaf.synth.SynthStyle;

public class QueueTestet {

	public static void main(String[] args) {

		Queue queue = new Queue(5);
		queue.insert(5);
		queue.insert(4);
		queue.insert(3);
		queue.insert(2);
		queue.insert(1);
		
		
		queue.view();
		System.out.println(queue.peek());
		
		queue.remove();
		//queue.insert(0);
		queue.view();
	}

}
