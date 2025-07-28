package Day7Overloading;

public class V1Executor {
	public static void main(String[] args) {

		System.out.println("Is 121 Palindrome? "+V1Operations.isPalindrome(121));
		System.out.println("Is 123 Palindrome? "+V1Operations.isPalindrome(123));
		
		System.out.println("Is CAR Palindrome? "+V1Operations.isPalindrome("CAR"));
		System.out.println("Is RACECAR Palindrome? "+V1Operations.isPalindrome("RACECAR"));

	}

}
