public class PalindromicNumberFinder {
    private int num;

    // constructor
    public PalindromicNumberFinder(int num){
        this.num = num;
    }

    // accessor/getter method
    public int getNum(){
        return this.num;
    }

    // this method should find the next palindromic number
    public int searchForPalindromicNum(int num){
			this.num = num;
			int counter = num;
			boolean found = false;

			while(!found){
				counter++;
				// System.out.println(counter);
				if(testPalindromicNum(counter)){
					found = true;
					// System.out.println("Changed found to true");
				}
			}
			// System.out.print("Returning palindromic number: ");
			return counter - num;
    }

    // this is a helper method for searchForPalindromicNum. It's purpose is to test if a number is actually a palindrome
    public boolean testPalindromicNum(int num){
			this.num = num;
			int convertedString = Integer.valueOf(reverseNum(num));
			if(num == convertedString){
				// System.out.println(num + " == " + convertedString);
				return true;
			}
			else{
				// System.out.println(num + " != " + convertedString);
				return false;
			}
    }


    // this is a helper method for testPalindromicNum. It should reverse the number and return it.
    public String reverseNum(int num){
			  this.num = num; 
				int reversed = 0;
				String output = "";
        while(Integer.valueOf(num) != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
				output = String.valueOf(reversed);
				return output;
    }


    @Override
    public String toString(){
        return "You'd have to drive " + searchForPalindromicNum(this.num) + " miles";
    }
}
