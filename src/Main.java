
import java.util.Scanner;
import java.util.Random;
public class Main {
	
	private static int desiredPasswordLength;
	
	public static String generatePassword(int desiredPassLength) {
		
		Random rand = new Random();
		
		String p = ""; //this will be the password generated
		
		//We need the alphabet and a char array to select it
		String alphabetString = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789"; 
		char[] alphabet = alphabetString.toCharArray();
		
		for (int i = 0; i < desiredPassLength; i++) {
			p += alphabet[rand.nextInt(alphabet.length)];
		}
		
		return p;
	}
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insert the length of the password to generate");
		desiredPasswordLength = scanner.nextInt();
		
		System.out.println("Password: " + generatePassword(desiredPasswordLength));
		
	}
}
