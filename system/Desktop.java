package week3.day1.assignments.org.system;

public class Desktop extends Computer {
	
	public void desktopSize()
	{
		System.out.println("Desktop size: '15'inches");
	}



public static void main(String[] args)

{
System.out.println("\n.....Single level inheritance.....");	
Desktop compObj=new Desktop();
compObj.computerModel();
compObj.desktopSize();

}
}

