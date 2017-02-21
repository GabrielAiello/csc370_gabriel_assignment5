package hwassignment5csc300;

public class LinkedList 
{
	private Node head;
	private int count;
	public LinkedList()
	{
		this.head = null;
		this.count = 0;
	}
	
	public int getCount()
	{
		return this.count;
	}
	
	public String removeEnd()
	{
		if(this.count == 0)
		{
			throw (new RuntimeException("Hey, can't remove from the empty list!"));
		}
		else
		{
			removeAtIndex(count - 1);
			
			String removed = "";
			return removed;
		}
	}
	
	public String removeAtIndex(int index)
	{
		if(this.count == 0)
		{
			throw (new RuntimeException("Hey, can't remove from the empty list!"));
		}
		else
		{
			Node runner = this.head;
			Node chaser = runner;
			for (int i = 0; i < index; i++)
			{
				chaser = runner;
				runner = runner.getNextNode();
			}
			String removed = runner.getPayload();
			Node eraser = runner.getNextNode();
			chaser.setNextNode(eraser);
			this.count = this.count - 1;
			System.out.println(removed);
			return removed;
		}
	}
	
	public String removeFront()
	{
		if(this.count == 0)
		{
			throw (new RuntimeException("Hey, can't remove from the empty list!"));
		}
		else
		{
			Node currFront = this.head;
			this.head = this.head.getNextNode();
			currFront.setNextNode(null);
			this.count = this.count - 1;
			return currFront.getPayload();
		}
	}
	
	public String getAtIndex(int index)
	{
		if(index < 0 || index >= this.count)
		{
			throw (new RuntimeException("Hey, that isn't a legal index! -> " + index));
		}
		else
		{
			Node currNode = this.head;
			for(int i = 0; i < index; i++)
			{
				currNode = currNode.getNextNode();
			}
			return currNode.getPayload();
		}
	}
	
	public void addAtIndex(String s, int index)
	{
		if(index == 0)
		{
			this.addFront(s);
		}
		else if(index == this.count)
		{
			this.addEnd(s);
		}
		else if(index < 0 || index > this.count)
		{
			throw (new RuntimeException("Hey, that isn't a legal index! -> " + index));
		}
		else
		{
			//do the hard part
			Node n = new Node(s);
			Node currNode = this.head;
			for(int i = 0; i < index-1; i++)
			{
				currNode = currNode.getNextNode();
			}
			
			//we have moved currNode into the position immediately before index
			n.setNextNode(currNode.getNextNode());
			currNode.setNextNode(n);
		}
	}
	
	public void addFront(String s)
	{
		Node n = new Node(s);
		if(this.head == null)
		{
			this.head = n;
		}
		else
		{
			//head points to a real Node
			n.setNextNode(this.head);
			this.head = n;
		}
		this.count++;
	}
	
	public void addEnd(String s)
	{
		Node n = new Node(s);
		if(this.head == null)
		{
			this.head = n;
		}
		else
		{
			Node currNode = this.head;
			while(currNode.getNextNode() != null)
			{
				currNode = currNode.getNextNode();
			}
			currNode.setNextNode(n);
		}
		this.count++;
	}
	
	public void display()
	{
		if(this.head == null)
		{
			System.out.println("Empty List");
		}
		else
		{
			Node currNode = this.head;
			while(currNode != null)
			{
				System.out.print(currNode.getPayload() + " -> ");
				currNode = currNode.getNextNode();
			}
			System.out.println("null");
		}
	}
}
//Add Comment