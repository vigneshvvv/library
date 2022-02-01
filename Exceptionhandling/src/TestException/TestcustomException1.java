package TestException;

import Exception.InvalidAgeException;

public class TestcustomException1 {
	public static void validate(int age) throws InvalidAgeException {
		
		if(age<18) {
			throw new InvalidAgeException("age is not valid for voting");
		}
		else {
			throw new InvalidAgeException("age is valid for voting");
		}
		
	}
	
	public static void main(String[]args) {
		
		try {
			validate(19);
		}
		catch(InvalidAgeException ex) {
			System.out.println("caught the exception");
			System.out.println("exception occur"+ex);
		}
	}

}
