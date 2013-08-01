import com.google.common.collect.MinMaxPriorityQueue;

/*
 * @author: psoshnin
 * @date created: August 1, 2013
 * @date modified: August 1, 2013
 * @purpose: Examples of how to instantiate helpful
 * and interesting hybrid data structures from the Guava Libraries  
 */
public class GuavaExample {
  
	//this handy DS accesses the min and max elt of a collection
	//in constant time 
	private MinMaxPriorityQueue<String> minMaxPriorityQueueEx;
	
	public GuavaExample(){
		
		createQueue();
	}
	
	public void createQueue(){
		this.minMaxPriorityQueueEx= MinMaxPriorityQueue.maximumSize(200000).create();
	}

}
