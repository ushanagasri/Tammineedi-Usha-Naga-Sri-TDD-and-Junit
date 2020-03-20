package com.epam.tddandjunit;

public class RemoveCharAInFirst2Positions {
   public String remove(String res) {
	   String resultString="";
	   if(res.length()>2) {
		   if(res.substring(0,2).equals("AA"))
			   resultString=res.substring(2);
		   else if(res.charAt(0)=='A')
			   resultString=res.substring(1);
		   else if(res.charAt(1)=='A')
			   resultString=res.charAt(0)+res.substring(2);
		   else
			   resultString=res;
	   }
	   else {
		   if(res.equals("A") ||res.equals("AA"))
			   resultString="";
		   else
			   resultString=res;
	   }
	   return resultString;
   }
}
