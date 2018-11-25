
public class PalindromePermuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pali = "Ratzs live on no evil startz";
		System.out.println(isPermutationOfPalindrome(pali));
		String pali2 = "Zeus was deified, saw Suez";
		System.out.println(isPermutationOfPalindrome(pali2));
	}
	
	public static boolean isPermutationOfPalindrome(String phrase) {
		int countOdd = 0;
		int[] table = new int[Character.getNumericValue('z')- Character.getNumericValue('a')+1];
		for(char c: phrase.toCharArray()) {
				int x = getCharNumber(c);
				if(x != -1) {
						table[x]++;
				
				if(table[x]%2 == 1) {
						countOdd++;
				}
				else {
						countOdd--;
				}
				}
		}
		return countOdd <= 1;
	}
	public static int getCharNumber(char c) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int val = Character.getNumericValue(c);
		if( a<= val && val <= z) {
			return val-a;
		}
		return -1;
	}

}
