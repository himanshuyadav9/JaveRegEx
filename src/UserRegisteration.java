import java.util.Scanner;

public class UserRegisteration {

	// UC-1 PRINTING RESULT OF FIRST NAME
	public void isValidFirstName() {
		String firstNamePattern = "^[A-Z][a-z]{2,}$";
		System.out.println("Enter First Name");
		Scanner sc = new Scanner(System.in);
		String firstName = sc.next();
		if (firstName.matches(firstNamePattern)) {
			System.out.println("valid first name");
		} else {
			System.out.println("Invalid first name");
			isValidFirstName();
		}
	}
	
	 //UC-2 PRINTING RESULT OF FIRST NAME
	public void isValidLastName() {
		String firstNamePattern = "^[A-Z][a-z]{2,}$";
		System.out.println("Enter Last Name");
		Scanner sc = new Scanner(System.in);
		String lastName = sc.next();
		if (lastName.matches(firstNamePattern)) {
			System.out.println("valid Last name");
		} else {
			System.out.println("Invalid Last name");
			isValidLastName();
		}
	}
	
	// UC-3 PRINTING RESULT OF EMAIL
	public void isValidEmail() {
		String emailPattern = "^[a-z]{1,}([.]?[-]?[+]?[a-z0-9]{1,})?[@]{1}[a-z0-9]{1,}[.]{1}[a-z]{2,4}([.]?[a-z]{2,4})?$";
		System.out.println("Enter E-mail");
		Scanner sc = new Scanner(System.in);
		String lastName = sc.next();
		if (lastName.matches(emailPattern)) {
			System.out.println("valid  E-mail");
		} else {
			System.out.println("Invalid  E-mail");
			isValidEmail();
		}
	}
	
	//UC-4 PRINTING RESULT OF PHONE NUMBER
	public void isValidMobileNumber() {
		String mobileNumberPattern = "^[0-9]{2}[ ][0-9]{10}$";
		System.out.println("Enter Mobile Number");
		Scanner sc = new Scanner(System.in);
		String mobileNumber = sc.next();
		if (mobileNumber.matches(mobileNumberPattern)) {
			System.out.println("valid Mobile number");
		} else {
			System.out.println("Invalid Mobile number");
			isValidMobileNumber();
		}
	}
	
	//UC-5 PRINTING RESULT OF PASSWORD
	public void isValidPassword() {
		String passwordPattern = ".{8,}";
		System.out.println("Enter Password");
		Scanner sc = new Scanner(System.in);
		String password = sc.next();
		if (password.matches(passwordPattern)) {
			System.out.println("valid  Password");
		} else {
			System.out.println("Invalid Password");
			isValidPassword();
		}
	}
	
	//UC-6  PRINTING RESULT OF PASSWORD ONE UPPER CASE
	public void isOneUpperCaseValidPassword() {
		String passwordPattern = ".*[A-Z]+.*";
		System.out.println("Enter Password");
		Scanner sc = new Scanner(System.in);
		String password = sc.next();
		if (password.matches(passwordPattern)) {
			System.out.println("valid one upper case Password");
		} else {
			System.out.println("Invalid Password");
			isOneUpperCaseValidPassword();
		}
	}
	
	// UC-7 PRINTING RESULT OF PASSWORD ONE NUMERIC VALUE
	public void isOneNumericValidPassword() {
		String passwordPattern = ".*[0-9]+.*";
		System.out.println("Enter Password");
		Scanner sc = new Scanner(System.in);
		String password = sc.next();
		if (password.matches(passwordPattern)) {
			System.out.println("valid One Numeric Value Password");
		} else {
			System.out.println("Invalid Password");
			isOneNumericValidPassword();
		}
	}
	
	//UC-8 PRINTING RESULT OF PASSWORD ONE SPECIAL CHARACTER
	public void isSpecialValidPassword() {
		String passwordPattern = "^[^!@#$%^&*(),.?\":{}|<>]*[!@#$%^&*(),.?:\"{}|<>][^!@#$%^&*(),.?\":{}|<>]*$";
		System.out.println("Enter Password");
		Scanner sc = new Scanner(System.in);
		String password = sc.next();
		if (password.matches(passwordPattern)) {
			System.out.println("valid One Special Value Password");
		} else {
			System.out.println("Invalid Password");
			isSpecialValidPassword();
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome to user Registeration");
		UserRegisteration user = new UserRegisteration();
            user.isValidFirstName();
            user.isValidLastName();
            user.isValidEmail();
            user.isValidMobileNumber();
            user.isValidPassword();
            user.isOneUpperCaseValidPassword();
            user.isOneNumericValidPassword();
            user.isSpecialValidPassword();
	}
	
}
