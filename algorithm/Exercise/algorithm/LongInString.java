package algorithm;

public class LongInString {
	public static void main(String[] args) {
		//String text = "abcad";
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Enter a charcterString:");
		String text = input.nextLine();
		input.close();
		int[] array = new int[26];
		for(int i = 0; i < array.length; i++)
			array[i] = 0;
		int temp, max = 1, i , j;
		array[text.charAt(0) - 'a'] = 1;
		i = 0;
		j = 1;
		temp = 1;
		while(j < text.length()) {
		//while(j < text.length() && i < text.length() - max) {
			
			if(array[text.charAt(j) - 'a'] == 0) {
				array[text.charAt(j) - 'a'] = 1;
				temp++;
				if(max < temp)
					max = temp;
				j++;
			}
			else {
				array[text.charAt(i) - 'a'] = 0;
				temp--;
				i++;
			}
			
		}
		System.out.println(max);
	}

}
