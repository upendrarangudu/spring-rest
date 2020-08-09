//package com.learn.rest;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class Test {
//
//	public static void main(String[] args) {
//		Test test = new Test();
//		//System.out.println(" new val is " + test.replaceSpace("test upen divya"));
//		
//		//System.out.println(" new val is " + test.repeatChar("aaabbccccdeee"));
//		System.out.println(" new val is " + test.factorial(5));
//
//	}
//	
//	public String replaceSpace(String str) {
//		StringBuffer sBuffer = new StringBuffer();
//		for(Character c: str.toCharArray()) {
//		   if((c >='a' && c <='z') || (c>='A' && c <='Z')) {
//		      sBuffer.append(c);
//		   }
//		}	
//	return sBuffer.toString();
//	}
//	
//	public int repeatChar(String str) {
//	    int threeCount =0;
//
//	    if (str != null) {
//		char[] charArr = str.toCharArray();
//		List<Character> newChar = new ArrayList<>();
//		int count=0;
//		for(Character c: charArr) {
//			newChar.add(c);
//		   count++;
//	           if (count == 3) {
//	              if(newChar.get(0) == newChar.get(1) && newChar.get(0) == newChar.get(2)) {
//			threeCount++;
//			count =0;
//			newChar = new ArrayList();
//		      }
//		   }
//		}        	
//		}
//	return threeCount;
//	}
//	
//	public char longestRepeatChar(String str) {
//		HashMap<Character,Integer> charCount = new HashMap<>();
//		for(char c: str.toCharArray()) {
//		 if(charCount.contains(c)) {
//		    charCount.put(c,charCount.get(c)+1);
//		 } else {
//		    charCount.put(c,1);
//		 }
//		}
//		int maxCount=0;
//		char c;
//		for(Map.Entry entry: charCount.entrySet()) {
//		if (Integer.parseInt(entry.getValue()) > maxCount) {
//		   maxCount=entry.getValue();
//		   c = entry.getKey();
//		}
//		}	
//		return c;
//	   }
//
//}
