package task;
import java.util.*;
import java.util.function.Predicate;


class PalindromePredicate
{
	
	public static boolean palindromeCheck(String original)
	{
		String reverse="";
		for(int i=original.length()-1;i>=0;i++)
		{
			reverse=reverse+original.charAt(i);
			
		}
		
		if(original==reverse)
		{
			return true;
		}
		else
			return false;
	}
}
		
public class Palindrome 
{
	public static void main(String[] args) 
	{
		String[] word= {"mam","wsaf","pap","aefugyu"};
		List<String> strings=Arrays.asList(word);
			
		

	
		
		List<String> palindromeStrings=Palindrome.filterList(strings, (String s)->PalindromePredicate.palindromeCheck(s));
	  System.out.println(palindromeStrings);
	
	}
	
		public static List<String> filterList(List<String> list , Predicate<String> p)
		{
	            		List<String> result=new ArrayList<String>();
	            		for(String s:list)
	            		{
	            			if(p.test(s))
	            				result.add(s);
	            		}
	            		return result;
		}
	}


