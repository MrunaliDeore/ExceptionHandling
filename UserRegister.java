package ExceptionHandling;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegister {
	static Scanner scan = new Scanner(System.in);
	
	public static boolean firstname() throws InvalidUserInputException {
		//Take input from user
		System.out.println("Enter first name : ");
		String name = scan.next();
		
		//check name is valid condition using regex
		String regex = "[A-Z]{1}[a-z]{3,6}";
		Pattern pattern = Pattern.compile(regex);
		Matcher ma = pattern.matcher(name);
		
		//check by using regex name is valid or not
		if (ma.matches() == true) {
			System.out.println("The given first name is : " +name + "->" + ma.matches());
			return ma.matches();
		}		
		//if not match throw  exception
		throw new InvalidUserInputException();
	}
	
	public static boolean lastname() throws InvalidUserInputException {
		//Take input from user
		System.out.println("Enter last name : ");
		String lastname = scan.next();
		
		//check name is valid condition using regex
		String regex = "[A-Z]{1}[a-z]{3,6}";
		Pattern pattern = Pattern.compile(regex);
		Matcher ln = pattern.matcher(lastname);
		
		//check by using regex name is valid or not
		if (ln.matches() == true) {
			System.out.println("The given last name is : " +lastname + "->" + ln.matches());
			return ln.matches();
		}		
		//if not match throw  exception
		throw new InvalidUserInputException();
	}
	
	public static boolean mobile() throws InvalidUserInputException {
		//Take input from user
		System.out.println("Enter mobile num : ");
		String mobile = scan.next();
		
		//check name is valid condition using regex
		String regex = "(91)?[7-9][0-9]{9}";
		Pattern pattern = Pattern.compile(regex);
		Matcher mn = pattern.matcher(mobile);
		
		//check by using regex name is valid or not
		if (mn.matches() == true) {
			System.out.println("The given mobile num is : " +mobile + "->" + mn.matches());
			return mn.matches();
		}		
		//if not match throw  exception
		throw new InvalidUserInputException();
	}
	
	public static boolean email() throws InvalidUserInputException {
		//Take input from user
		System.out.println("Enter email ID: ");
		String email = scan.next();
		
		//check name is valid condition using regex
		String regex = "[a-z]{3}(.+)[a-z]{3}@[bl](.+)[co](.+)";
		Pattern pattern = Pattern.compile(regex);
		Matcher ei = pattern.matcher(email);
		
		//check by using regex name is valid or not
		if (ei.matches() == true) {
			System.out.println("The given mobile num is : " +email + "->" + ei.matches());
			return ei.matches();
		}		
		//if not match throw  exception
		throw new InvalidUserInputException();
	}
	
	public static boolean password() throws InvalidUserInputException {
		//Take input from user
		System.out.println("Enter email ID: ");
		String password = scan.next();
		
		//check name is valid condition using regex
		String regex = "[a-z]{3}(.+)[a-z]{3}@[bl](.+)[co](.+)";
		Pattern pattern = Pattern.compile(regex);
		Matcher pw = pattern.matcher(password);
		
		//check by using regex name is valid or not
		if (pw.matches() == true) {
			System.out.println("The given mobile num is : " +password + "->" + pw.matches());
			return pw.matches();
		}		
		//if not match throw  exception
		throw new InvalidUserInputException();
	}
	public static void main(String args[]){
		UserRegister u = new UserRegister();
	}
	
}


