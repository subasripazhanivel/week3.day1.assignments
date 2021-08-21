package week3.day1.assignments.students;

public class Students {
	
	public void getStudentInfo(int id)
	{
	System.out.println("Student ID : " +id+"\n");	
	}
	
	public void getStudentInfo(int id,String name)
	{
	System.out.println("Student ID : " +id);
	System.out.println("Student Name : " +name+"\n");
	}
	
	public void getStudentInfo(String email,long phNumber)
	{
	System.out.println("Student Email: " +email);
	System.out.println("Student Phone number: " +phNumber);
	}
	public static void main(String[] args) {
		
		Students stObj=new Students();
		stObj.getStudentInfo(2345);
		stObj.getStudentInfo(34455, "Mithra");
		stObj.getStudentInfo("mithu@gmail.com", 95456456566L);
		
	}

}
