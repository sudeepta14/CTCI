
public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabbxx";
		
		System.out.println(compress(str));
	}
	public static String compress(String str) {
		StringBuilder compressed = new StringBuilder();
		int countConsective = 0;
		for(int i=0; i<str.length(); i++) {
			countConsective++;
			if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {
				compressed.append(str.charAt(i));
				compressed.append(countConsective);
				countConsective = 0;
			}
		}
		return compressed.toString();
	}

}
