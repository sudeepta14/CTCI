
public class URLify {
	public static void main(String [] args) {
		String str = "Mr John Smith    ";
		
		// Sending the length of the actual string without spaces at end
		char[] arr = str.toCharArray();
		int trueLength = findLastChar(arr)+1;
		char[] array = replaceArray(arr, trueLength);
		System.out.println(String.valueOf(array));
		
		
	}
	public static int findLastChar(char[] arr) {
		for(int i = arr.length-1; i>=0 ; i--) {
			if(arr[i] != ' ') {
				return i;
			}
		}
		return -1;
	}
	public static char[] replaceArray(char[] arr, int trueLength) {
		int spaceCount = 0, index, i=0;
		for(i=0; i<trueLength; i++) {
			if(arr[i] == ' ') {
				spaceCount++;
			}
		}
		index = trueLength + spaceCount*2;
		for(i= trueLength-1; i>=0; i--) {
			if(arr[i] == ' ') {
				arr[index-1] = '0';
				arr[index-2] = '2';
				arr[index-3] = '%';
				index = index-3;
			}else {
				arr[index-1]= arr[i];
				index--;
			}
		}
		return arr;
	}

}
