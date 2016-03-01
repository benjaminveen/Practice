package linkedList;

//First in Last out
public class Stack<E> extends LinkedList<E> {

	Stack(){
		length = 0;
		head = null;
	}
	
	Stack(E data){
		length++;
		Node<E> temp = new Node<E>(data);
		head = temp;
	}
	
	public void push(E data){
		Node<E> temp = new Node<E>(data);
		temp.next = head;
		head = temp;
		length++;
	}
	
	public E pop(){
		Node <E> temp = head;
		head = head.next;
		length--;
		return temp.data;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.printList();
		stack.printLength();
		stack.pop();
		stack.printList();
		stack.printLength();
	}

}
