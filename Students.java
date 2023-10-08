package polymorphism;

public class Students {

	public void getStudentInfo(int id)
	{
		System.out.println("id: " + id);	
				
	}
	
	public void getStudentInfo(int id, String name)
	{
		System.out.println("id: " +id+ "name: "+ name);
		
	}
	
	public void getStudentInfo(String email, String phonenumber)
	{
		System.out.println("email: "+email +"phonenumber: " +phonenumber);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Students st = new Students();
 st.getStudentInfo(12345);
 st.getStudentInfo(12345, "NAGAJOTHI");
 st.getStudentInfo("nagajothi.mahudeeswaran2gmail.com", "9790667125");
	}

}
