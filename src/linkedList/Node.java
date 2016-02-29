package linkedList;

public class Node<E> {
	E data;
	Node next;
	
	Node(E data, Node next){
		this.data = data;
		this.next = next;
	}
	
	Node(E data){
		this.data = data;
		this.next = null;
	}
}
