package hwassignment5csc300;

public class Node 
{
	private String payload;
	private Node nextnode;
	public Node(String payload)
	{
		this.payload = payload;
		this.nextnode = null;
	}
	public String getPayload() {
		return payload;
	}
	public void setPayload(String payload) {
		this.payload = payload;
	}
	public Node getNextNode() {
		return nextnode;
	}
	public void setNextNode(Node nextnode) {
		this.nextnode = nextnode;
	}
	
}
