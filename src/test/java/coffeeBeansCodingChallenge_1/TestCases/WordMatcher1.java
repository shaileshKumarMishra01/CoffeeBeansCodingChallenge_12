package coffeeBeansCodingChallenge_1.TestCases;
import java.util.HashMap;
import java.util.Set;




	
	class WordFinder{
	    public void findDuplicate(String strValue){
	        String[] strArrayValue =strValue.split(" ");
	        for(String str:strArrayValue) {
	            HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
	            char[] charArray = str.toLowerCase().toCharArray();
	            for (char c : charArray) {
	                if (charCountMap.containsKey(c)) {
	                    charCountMap.put(c, charCountMap.get(c) + 1);
	                }
	                else {
	                    charCountMap.put(c, 1);
	                }
	            }
	            Set<Character> charsInString = charCountMap.keySet();
	            
	            for (Character ch : charsInString) {
	                if (charCountMap.get(ch) > 1) {
	                    System.out.println(str +" - "+ ch + "(" + charCountMap.get(ch)+")");
	                }
	            }
	        }
	    }
	}
	public class WordMatcher1 {
		
	    public static void main(String[] args) {
	        String name = "Bangalore is in india";

	        WordFinder wordFinder =new WordFinder();
	        wordFinder.findDuplicate(name);
	    }
	}



