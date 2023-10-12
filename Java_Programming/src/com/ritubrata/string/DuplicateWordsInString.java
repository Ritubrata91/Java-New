package com.ritubrata.string;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWordsInString {

	static void duplicateWords(final String inputString){
		final String[] words = inputString.split(" ");
		final HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		for (final String word : words){
			if(wordCount.containsKey(word.toLowerCase())){
				wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase())+1);
			}else{
				wordCount.put(word.toLowerCase(), 1);
			}
		}
		final Set<String> wordsInString = wordCount.keySet();
		for (final String word : wordsInString){
			if(wordCount.get(word) > 1){
				System.out.println(word+" : "+wordCount.get(word));
			}
		}
	}

	public static void main(final String[] args){
		duplicateWords("Bread butter and bread");
		duplicateWords("Java is java again java");
		duplicateWords("Super Man Bat Man Spider Man");
	}
}
