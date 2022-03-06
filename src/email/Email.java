package email;


	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;
	public class Email {
	public static boolean isValidEmail(String email) {
	String regex = "^(.+)@(.+)$";
	 
	Pattern pattern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(email);
	return matcher.matches();
	}
	public static void main(String[] args) {
	List<String> emails = new ArrayList<String>();
	
	emails.add("Pranathi@example.com");
	emails.add("Radha@example.com");
	emails.add("Praveen@example.me.org");
	
	emails.add("chinni.example.com");
	emails.add("allu.balayya@example.com");
	emails.add("PSPK@.example.com");
	for (String value : emails) {
	System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));
	}
	System.out.println("Enter any email address to check");
			       Scanner sc = new Scanner(System.in);
			       String input = sc.nextLine();
			       System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));
			       
			   }
			   
	}

