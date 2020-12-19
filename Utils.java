public class Utils {

	public boolean MultipleOfFour(int input) {
		return input % 4 == 0;
	}
	
	public boolean IsPrime(int input) {
		
		if(input <= 1)
			return false;
		
		for(int i = 2; i <= input/2; i++) {
			if(input % i == 0)
				return false;
		}
		
		return true;
	}
	
	public boolean IsPalindrome(int input) {
		
		int reversed = 0;	
		while(input > 0) {		
			reversed = reversed * (input % 10);
			input = input / 10;		
		}
		
		return reversed == input;
		
	}
}
