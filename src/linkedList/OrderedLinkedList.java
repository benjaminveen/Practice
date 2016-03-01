package linkedList;

public class OrderedLinkedList<E> extends LinkedList<E>{

	OrderedLinkedList(){
		length = 0;
		head = null;
		tail = null;
	}
	
	OrderedLinkedList(E data){
		Node<E> temp = new Node<E>(data);
		head = temp;
		tail = temp;
	}
	
	@Override
	public void add(E data){
		Node<E> temp = new Node<E>(data);
		if(head == null && tail == null){
			head = temp;
			tail = temp;
		} else {
			Node<E> ptr = head;
			Node<E> prev = null;
			do{
				
			} while(ptr != null);
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
