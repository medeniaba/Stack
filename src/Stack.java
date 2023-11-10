
class Node {
	
	int data ; 
	Node next ;  
	Node (int data ){
		this.data = data ; 
		next = null ; 
	}
}

public class Stack {
Node ust ; 
	
	public Stack() {
		
		ust = null ; 
		
	}

	boolean Bosmu () {
		
		return ust == null ; 
		
	}

	public void push ( Node yeni ) { // ekleme metodu 
		
		if (Bosmu()) {
			ust = yeni ; 
			System.out.println("yeni eleman eklendi " + yeni.data );
			
		}
		
		else {
			yeni.next = ust; 
			ust = yeni ; 
			System.out.println(ust.data + " stacke eklendi");
		}
	}
	
	
	Node pop () { // eleman çıkarma metodu 
		Node e = ust ; 
		if (!Bosmu()) {
			ust = ust.next ; 
			System.out.println("eleman çıkarıldı , çıkarılan eleman --> " + e.data );
		}
		
		 else {
			System.out.println(" yıgında eleman kalmadı , yıgın boş ");
			
		}
		return e ; 
	}
	
	
	public static void main(String[] args) {
		
		Stack stack = new Stack() ;
		
		Node elemanbir = new Node (5); 
		Node elemaniki = new Node (7);
        Node elemanuc  = new Node (8);  
	    Node elemandort = new Node(9); 
	    Node elemanbes = new Node (85);
		
	    stack.push(elemanbir);
	    stack.push(elemaniki);
	    stack.push(elemanuc);
	    
	    stack.pop();
	    stack.pop();
	    stack.pop();
	    stack.pop();
	   
		

	}

}

