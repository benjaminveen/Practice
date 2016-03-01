package linkedList;

public class Node<E> {
	E data;
	Node<E> next;
	
	Node(E data, Node<E> next){
		this.data = data;
		this.next = next;
	}
	
	Node(E data){
		this.data = data;
		this.next = null;
	}
}
