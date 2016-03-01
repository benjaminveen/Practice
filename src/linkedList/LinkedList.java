package linkedList;

public class LinkedList<E> {
	
	int length;
	Node<E> head;
	Node<E> tail;
	
	LinkedList(){
		length = 0;
		head = null;
		tail = null;
	}
	
	LinkedList(Node<E> initial){
		length = 1;
		head = initial;
		tail = initial;
	}
	
	LinkedList(E data){
		length = 1;
		Node<E> temp = new Node<E>(data);
		head = temp;
		tail = temp;
	}
	
	//Adds node to end of list
	public void add(E data){
		Node<E> temp = new Node<E>(data);
		if(head == null && tail == null){
			head = temp;
			tail = temp;
			length++;
		} else {
			tail.next = temp;
			tail = temp;
			length++;
		}
	}
	
	public E remove(E data){
		Node<E> ptr = head;
		Node<E> prev = null;
		do{
			if(ptr.data.equals(data)){
				E tempdata = ptr.data;
				if(ptr.next == null){
					tail = prev;
				} else if (prev == null){
					head = head.next;
					return tempdata;
				}
				prev.next = ptr.next;
				ptr.next = null;
				return tempdata;
			}
			prev = ptr;
			ptr = ptr.next;
		} while(ptr != null);
		return null;
	}
	
	public int getLength(){
		return length;
	}
	
	public void printLength(){
		System.out.println("Linked List's length is: "+length);
	}
	
	public void printList(){
		Node<E> ptr = head;
		do{
			System.out.print(ptr.data + "->");
			ptr = ptr.next;
		} while(ptr != null);
		System.out.println("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(55);
		ll.printList();
		System.out.println(ll.getLength());
		
		ll.remove(55);
		ll.printList();
		ll.add(6);
		ll.printList();
		ll.remove(1);
		ll.printList();
	}

}
