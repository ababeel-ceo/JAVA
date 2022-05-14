class LL1 {
	class Node
	{
		int data;
		Node next;
		Node(int val)
		{
			data=val;
		}
		
		
	}
	Node head;
	
	LL1()
	{
		head=null;
	}
	
	
	void insertNode(int val)
	{
		Node newNode = new Node(val);
		newNode.next=head;
		head=newNode;
		
	}
	
	
	 void middleElement()
	{
		 int count=0;
		Node temp=head;
		Node mid=head;
		
		while (temp.next !=null)
		{
			count++;
			mid=mid.next;
			
			temp=temp.next.next;
			
			if(temp==null)
			{
				break;
			}
			
			
		}
		System.out.println("mid element is :"+mid.data+"  "+count);
		
		
		
	}
}


public class FindMiddleElemntInLLInOnePass {

	public static void main(String[] args) {
			LL1 list = new LL1();
			list.insertNode(10);
			list.insertNode(20);
			list.insertNode(9);
			list.middleElement();
	}

}