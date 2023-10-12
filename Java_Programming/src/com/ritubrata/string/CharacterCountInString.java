package com.ritubrata.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCountInString {
	public static String countOccofEachCharHashMap(final String s){

		final HashMap<Character, Integer> map = new LinkedHashMap<>();
		int i =0;
		while(i< s.length()){
			final Character c = s.charAt(i);
			if(map.containsKey(c)){
				map.put(c , map.get(c)+1);
			} else if(c != ' ') {
				map.put(c,1);
			}
			i++;
		}
		final StringBuilder sb = new StringBuilder();
		for(final Map.Entry<Character, Integer> entry : map.entrySet()) {
			sb.append(entry.getKey());
			sb.append("=");
			sb.append(entry.getValue());
			sb.append(" ");
		}
		return sb.toString();
	}

	public static void main(final String[] args) {
		System.out.println(countOccofEachCharHashMap("ritubrata"));
	}

}
