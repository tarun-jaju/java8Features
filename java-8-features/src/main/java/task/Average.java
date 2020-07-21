package task;
import java.util.*;
public class Average
{
	public static void main(String[] args)
	{
		
		Scanner input=new Scanner(System.in);
		List<Integer> numbers=new ArrayList<Integer>();
		System.out.println("how many numbers do you want to enter");
		int count=input.nextInt();
		for(int i=0;i<count;i++)
		{
			numbers.add(input.nextInt());
		}
		 numbers.stream().mapToInt(i->i).average().ifPresent(avg-> System.out.println("the average is " +avg));
		 input.close();
	}

}
