package dataStructures;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArraysAndStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int uniqueChars = 0;
		int uniqueCharsNoExtraSpace = 0;
		int isAnagram = 1;
		
		if(uniqueChars == 1){
			System.out.println("unique Chars");
			System.out.println(uniqueChars("abcdefg"));
			System.out.println(uniqueChars("abcdeab"));
			System.out.println(uniqueChars("hellohello"));
			System.out.println("unique chars no extra space");
		}
		if(uniqueCharsNoExtraSpace == 1) {
			System.out.println(uniqueCharsNoExtraSpace("abcdefg"));
			System.out.println(uniqueCharsNoExtraSpace("abcdeab"));
			System.out.println(uniqueCharsNoExtraSpace("hellohello"));
			System.out.println(uniqueCharsNoExtraSpace("ben"));
			System.out.println(uniqueCharsNoExtraSpace("bennie"));
		}
		if(isAnagram == 1){
			System.out.println("Is Anagram");
			System.out.println(isAnagram("ben", "neb"));
			System.out.println(isAnagram("racecar", "racecar"));
			System.out.println(isAnagram("ben", "nick"));
		}
		
	}
	
	public static boolean uniqueChars(String input) {
		Map<Character, Integer> chars = new HashMap<Character, Integer>();
		char[] cArray = input.toCharArray();
		for(char c : cArray) {
			if(chars.containsKey(c))
				return false;
			chars.put(c, 1);
		}
		return true;
	}
	
	public static boolean uniqueCharsNoExtraSpace(String input) {
		for(int i = 0; i <= input.length(); i++){
			if(i == input.length())
				continue;
			if(input.substring(i+1).contains(input.substring(i, i+1))){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isAnagram(String in1, String in2) {
		char[] in1Array = in1.toCharArray();
		char[] in2Array = in2.toCharArray();
		Arrays.sort(in1Array);
		Arrays.sort(in2Array);
		String in1Sorted = new String(in1Array);
		String in2Sorted = new String(in2Array);
		if(in1Sorted.equals(in2Sorted))
			return true;
		return false;
	}

}
