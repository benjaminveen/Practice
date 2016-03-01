package linkedList;

//First in First out
public class Queue<E> extends LinkedList<E>{

	Queue(){
		head = null;
		tail = null;
		length = 0;
	}
	
	Queue(E data){
		Node<E> temp = new Node<E>(data);
		length++;
		head = temp;
		tail = temp;
	}
	
	public E remove(){
		Node<E> temp = head;
		head = head.next;
		length--;
		return temp.data;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> queue = new Queue<Integer>();
		queue.add(1);
		queue.add(2);
		queue.add(4);
		queue.add(7);
		queue.printList();
		queue.printLength();
		queue.remove();
		queue.printLength();
		queue.printList();
	}
}
