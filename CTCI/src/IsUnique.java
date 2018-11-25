
public class IsUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] words = {"abcde", "hello", "kite", "padle"};
		for(String word : words) {
			System.out.println(word +":" +isUniqueChars(word));
		}

	}
	public static boolean isUniqueChars(String str) {
//		if(str.length()> 128) {
//			return false;
//		}
//		boolean [] char_set = new boolean[128];
//		for(int i=0;  i<str.length(); i++) {
//			int val = str.charAt(i);
//			if(char_set[val]) return false;
//			char_set[val]=true;
//		}
//		return true;
		
		
		//Assuming only letters from a through z
		
		if(str.length()>26) {
			return false;
		}
		int checker=0;
		for(int i=0; i<str.length(); i++) {
			int val = str.charAt(i)-'a';
			if((checker & (1<<val)) > 0)return false;
			checker |= 1<<val;
		}
		return true;
	}

}
