package exercise;

import java.util.HashMap;

public class NumberDictionary {
	
	HashMap<String, String> numDict = new HashMap<>();
	public void initiateDictionary() {

		numDict.put("1", "ONE");
		numDict.put("2", "TWO");
		numDict.put("3", "THREE");
		numDict.put("4", "FOUR");
		numDict.put("5", "FIVE");
		numDict.put("6", "SIX");
		numDict.put("7", "SEVEN");
		numDict.put("8", "EIGHT");
		numDict.put("9", "NINE");
		numDict.put("10", "TEN");
		
		numDict.put("11", "ELEVEN");
		numDict.put("12", "TWELVE");
		numDict.put("13", "THIRTEEN");
		numDict.put("14", "FOURTEEN");
		numDict.put("15", "FIFTEEN");
		numDict.put("16", "SIXTEEN");
		numDict.put("17", "SEVENTEEN");
		numDict.put("18", "EIGHTEEN");
		numDict.put("19", "NINETEEN");
		numDict.put("20", "TWENTY");
		numDict.put("30", "THIRDY");
		numDict.put("40", "FOURTY");
		numDict.put("50", "FIFTY");
		numDict.put("60", "SIXTY");
		numDict.put("70", "SEVENTY");
		numDict.put("80", "EIGHTY");
		numDict.put("90", "NINETY");
		
		numDict.put("100", "HUNDRED AND");
		numDict.put("1000", "ONE THOUSAND");
		
	}
	
	public HashMap<String, String> getDictionary() {
		return numDict;
	}

}
