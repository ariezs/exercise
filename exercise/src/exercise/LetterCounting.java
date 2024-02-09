package exercise;

import java.util.ArrayList;
import java.util.HashMap;

public class LetterCounting {

	public static void main(String args[])  {
		
		NumberDictionary  numDict = new NumberDictionary();
		numDict.initiateDictionary();
		HashMap<String, String> nb = numDict.getDictionary();
		
		ArrayList<String> numArray = new ArrayList<String>();
		for(int i = 1; i <= 20; i++) {
			String valueByKey = nb.get(Integer.toString(i));
			numArray.add(valueByKey);
		}
		
		for(int i = 845; i <= 1000; i++) {
			
			char[] indexSplitIntoDigits = String.valueOf(i).toCharArray();
			
			String firstDigit = String.valueOf(indexSplitIntoDigits[0]);
			String secondDigit = String.valueOf(indexSplitIntoDigits[1]);
			String currentDecade = firstDigit + "0";
			
			if(indexSplitIntoDigits.length == 2) {
				if(!secondDigit.equals("0")) {
					numArray.add(nb.get(currentDecade)+nb.get(secondDigit));
				} else {
					numArray.add(nb.get(currentDecade));
				}
			}
			
			if(indexSplitIntoDigits.length == 3) {
				String thirdDigit = String.valueOf(indexSplitIntoDigits[2]);
				currentDecade = secondDigit + "0";
				numArray.add(nb.get(firstDigit).concat(nb.get("100").concat(" ").concat(nb.get(currentDecade)+nb.get(thirdDigit))));
			}
			
		}
		numArray.add(nb.get("1000"));
		numArray.forEach(n -> System.out.println(n));
	}
}
