package task;
import java.util.*;

@FunctionalInterface
interface P{
	void check();
}
class PalindromePp {
	public  static  String reverseString(String s)
	{
		String reverse="";
		for(int i=s.length()-1;i>=0;i++)
		{
			reverse=reverse+s.charAt(i);
			
		}
		return s;
	}
			
	public   void isPalindrome(List<String> list)
	{
		String original="",reverse;
		List<String> palindromeStrings=new ArrayList<String>();
		for(int i=0;i<list.size();i++)
		{
			original=list.get(i);
			reverse=reverseString(original);
			if(original==reverse)
			{
				palindromeStrings.add(original);
			}
			System.out.println(palindromeStrings);
		}
	}
}
public class PalindromeP{
	public static void main(String[] args)
	{

		String[] word= {"mam","wsaf","pap","aefugyu"};
		List<String> words=Arrays.asList(word);
		 PalindromePp instance=new PalindromePp();	
		 instance.isPalindrome(words);
	//	P object= new PalindromePp()::isPalindrome;
		//object.check();
		
	}

}
