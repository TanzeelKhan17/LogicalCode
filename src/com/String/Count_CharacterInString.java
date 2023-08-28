package com.String;
import java.util.HashMap;
import java.util.Map;

public class Count_CharacterInString {

	
	
	    public static void main(String[] args) {
	        String input = "Hello, World!";
	        Map<Character, Integer> characterCountMap = countCharacters(input);
	        
	        // Display the character frequencies
	        for (Map.Entry<Character, Integer> entry : characterCountMap.entrySet()) {
	            char c = entry.getKey();
	            int count = entry.getValue();
	            System.out.println("'" + c + "' occurs " + count + " times");
	        }
	    }
	    
	    public static Map<Character, Integer> countCharacters(String input) {
	        Map<Character, Integer> characterCountMap = new HashMap<>();
	        
	        // Iterate over each character in the string
	        for (char c : input.toCharArray()) {
	            // Ignore whitespace and punctuation
	            if (Character.isWhitespace(c) || !Character.isLetterOrDigit(c)) {
	                continue;
	            }
	            
	            // Convert the character to lowercase for case-insensitive counting
	            c = Character.toLowerCase(c);
	            
	            // Update the count in the map
	            characterCountMap.put(c, characterCountMap.getOrDefault(c, 0) + 1);
	        }
	        
	        return characterCountMap;
	    }
	}

