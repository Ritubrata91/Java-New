package com.ritubrata.string;
import java.util.ArrayList;
import java.util.List;

class FirstNonRepeatingLetter {
	final static int max_chars = 256;

	static String find(final String str){

		final List<Character> my_list = new ArrayList<Character>();
		final boolean[] repeat = new boolean[max_chars];
		for (int i = 0; i < str.length(); i++){
			final char x = str.charAt(i);
			if (!repeat[x]){
				if (!my_list.contains(x)){
					my_list.add(x);
				}
				else{
					my_list.remove((Character)x);
					repeat[x] = true;
				}
			}
		}
		if (my_list.size() != 0){
			return String.valueOf(my_list.get(0));
		}
		return "";
	}

	public static void main(final String[] args) {
		System.out.println(find("StTsSTt"));
	}
}