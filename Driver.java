package hwassignment5csc300;

public class Driver
{
	public static void main(String[] args)
	{
		LinkedList happy = new LinkedList();
		System.out.println("" + happy.getCount());
		happy.addFront("a");
		happy.addFront("b");
		happy.addEnd("c");
		happy.addFront("d");
		happy.addFront("e");
		happy.addEnd("f");
		happy.addFront("g");
		happy.addFront("h");
		happy.addEnd("i");
		happy.addFront("j");
		happy.addFront("k");
		happy.addEnd("l");
		System.out.println("" + happy.getCount());
		happy.display();
		happy.removeEnd();
		happy.display();
		happy.removeAtIndex(3);
		happy.display();
}
}
