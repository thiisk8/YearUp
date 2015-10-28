
public class Loops {

	public static void main(String[] args) 
	{
int[] array1 = new int[] {40,60,80, 100};	
int[] array2 = new int[] {40,20,80, 100};
int[] array3 = new int[] {40,60,80, 60};

System.out.println("Searching in array1....");
FindANumberInArray(array1, 60); 
System.out.println("Searching in array2....");
FindANumberInArray(array2, 60); 

System.out.println ("Finding all occurences in array 2....");
FindOccurancesOfNumberInArray(array, 60);
}

	public static void FindANumberInArray(int[] numbers, int searchNumber)
	{
		if (numbers != null)
		{
			int foundAtLocation =-1;
			
			for (int i = 0 ; i < numbers.length; i++)
			{
				if (numbers[i] == searchNumber)
				{
					foundAtLocation = i;
				break;
			}
			}
			
			if (foundAtLocation >= 0)
			{
				System.out.println("The number was found at location" + foundAtLocation);
			}
			else
			{
				System.out.println
			}
		}
	}
	
	public static void FindOccurancesOfNumberInArray(int[] numbers, int searchNumber)
	{
		if (numbers != null)
		{
			int countOfOccurances =0;
			
			for (int i = 0 ; i < numbers.length; i++)
			{
				if (numbers[i] == searchNumber)
				{
					countOfOccurances++;
			}
			}
			
			{
				System.out.println("The number was found at location" + foundAtLocation);
			}
			else
			{