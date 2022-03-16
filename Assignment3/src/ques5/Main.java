package ques5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserRegistration registration=new UserRegistration();
		try
		{
			registration.userRegistration("Amruta", "India");
		}
		catch(InvalidCountryException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
