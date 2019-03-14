package com.bridgelabz.Algorithm;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Purpose : To perform different algorithm operations
 * @author Rohan Kadam
 *	Date : 5/3/2019
 */
public class AlgoUtility {

	/**
	 * Purpose : To take String Input
	 * @return : Inputed String
	 */
	public static String inputString() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String:-  ");
		String name=scanner.nextLine();
		return name;
	}
	/**
	 * Purpose:To take Integer Input
	 * @return Inputed Integers
	 */
	public static int inputInt() {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the interger:- ");
		int integer=scanner.nextInt();
		return integer;
				
	}
	/**
	 * Purpose:To Take floating Point Input
	 * @return Inputed floating Point
	 */
	public static float inputFloat() {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the floating number:- ");
	float floatip=scanner.nextFloat();
	return floatip;
	}
/**
 * Purpose:-To take Double Input
 * 
 * @return Inputed Double Value
 */
	
	public static double inputDouble() {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the Double number");
	double doubleip=scanner.nextDouble();
	return doubleip;
	}
   
/**
 * 	Purpose:-To Get Day of Week
 * @param m : month in Integer
 * @param d:-Date
 * @param y:-year
 */
public static void dayofweek(int m,int d,int y) {
	int yo,mo,xo,d1;
	yo=y-(14-m)/12;
	xo=yo+ yo/4 -yo/100 + y/400;
	mo=m+12*((14-m)/12)-2;
	d1=(d+xo+31*mo/12)%7;
	System.out.println(d1);
	if(d1==0) {System.out.println("MONDAY");
	}else if(d1==1) {System.out.println("TUESDAY");
	}else if (d1==2) {System.out.println("WEDNESDAY");
	}else if(d1==3) {System.out.println("THURSDAY");
	}else if(d1==4) {System.out.println("FIRDAY");
	}else if(d1==5) {System.out.println("SATURDAY");
	}else if(d1==6) {System.out.println("SUNDAY");
	}else {System.out.println("INVALID ");}
}
/**
 * Temperature Conversion form Fahreheit viceversa Celius 
 * @param C=float Celsius value
 * @param F= float Fahreheit value
 */
    public static void temperatureConversion(float C,float F) {
	float CelsiutoFahrenheit=C*(9/5)+32;
	float FahrenheittoCelsius=(F-32)*5/9;
	System.out.println("CelsiutoFahreheit:- "+CelsiutoFahrenheit);
	System.out.println("FahrenheittoCelsius:- "+FahrenheittoCelsius);
}
/**
 * Monthly Payments 
 * @param P:-Principal
 * @param Y:-Year
 * @param R:-Rate of Interest
 */
 
    public static void monthlyPayments(float P,float Y,float R) {
    float n,r,payments;
    r=R/(12*100);
    n=12*Y;
    float p1=(float)Math.pow((1+r),(-n));
    payments=(P*r)/(1-(p1));
    System.out.println(payments);
	
}
 
    /**
     * Newton SquareRoot
     * @param c:-Non-negative
     */
public static void NewtSqrt(double c) {
	double t,epsilon;
	
	epsilon=1e-15;
	System.out.println(epsilon);
	t=c;
	while(Math.abs(t-c/t)>epsilon*t) {
		t=(c/t+t)/2.00;
	}
	System.out.println(t);
	
	
}
/**
 * Anagram
 * @param str1:-String One 
 * @param str2:-String two
 */
public static void Anagram(String str1,String str2) {
	int s1=str1.length();
	int s2=str1.length();
	if(s1==s2) {
		System.out.println("Length are equals");
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		char [] str3=str1.toCharArray();
		char[] str4=str2.toCharArray();
		Arrays.sort(str3);
		Arrays.sort(str4);
		if (Arrays.equals(str3,str4)) {
			System.out.println("*****ANAGRAMS*****************************");
		}else {
			System.out.println("######Not ANAGRAMS#### ");
		}
			}else {System.out.println("Lengths are Not Equals & String are not anagrams");}
}
/**
 * Decimal to Binary
 * @param number
 * @return Array
 */
public static int[] DecimaltoBinary(int number) {
	int[] binaryarr=new int[8];
	int i=(binaryarr.length) -1;
	while(i>=0) {
		int temp=number%2;
		number=number/2;
		binaryarr[i]=temp;
		i--;
		printArray(binaryarr);
	}

	
//	converting to string then using buffer reader to reversed the string
	return binaryarr;
}
/**
 * NibbleSwapping
 */
public static int[] nibbleSwap(int[] arr) {
	
	int i=0,j=3;
	while(i<=3) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		j++;
	}
return nibbleSwap(arr);
}
/**
 * BinaryTo Decimal
 * @param binaryarr
 */

public static void BinarytoDecimal(int [] binaryarr) {
//	converting string into charArray
	int sum=0;
	int i=(binaryarr.length)-1;
	reverse(binaryarr);
	for (i=7;i<8;i--) {
		if(binaryarr[i]==1) {
		int k=(int)Math.pow(2, i);
		System.out.println(k);
		sum+=k;
		System.out.println(sum);
		}else if (binaryarr[i]==0){
			System.out.println("");
		}else {System.out.println("error");}
	}
	
			
}
/**
 * Reverse array 
 * @param arr
 * @return
 */
public static int[] reverse(int [] arr) {
	int start=0;
	int end=arr.length-1;
	
		int temp;
		printArray(arr);
		while(start<end) {
			temp=arr[start];
			System.out.println(arr[start]+" "+arr[end]);
			arr[start]=arr[end];
			arr[end]=temp;
			System.out.println(arr[start]+" "+arr[end]);
			printArray(arr);
			start++;
			end--;
		}

	printArray(arr);
	return arr;
}
/**
 *Integers  PrintArray
 * @param arr
 */
public static void printArray(int arr[]) 
{ 
for (int i = 0; i < arr.length; i++) 
System.out.print(arr[i] + " "); 

System.out.println(); 
}
/**
 * BubbleSorting integer Array
 * @param arr
 */
public static void bublesort(int[] arr) {
	 int n = arr.length;
     for (int i = 0; i < n-1; i++) {
         for (int j = 0; j < n-i-1; j++)
             if (arr[j] > arr[j+1])
             {
                 // swap temp and arr[i]
                 int temp = arr[j];
                 arr[j] = arr[j+1];
                 arr[j+1] = temp;
             }
     }printArray(arr);
}
public static String[] Stringbubblesort(String[] chararray) {
	int n=chararray.length;
	for(int i=0;i<n-1;i++) {
		for(int j=0;j<n-i-1;j++) {
			if((Math.abs(chararray[j].hashCode()))>(Math.abs(chararray[j+1].hashCode()))){
				String temp=chararray[j];
				chararray[j]=chararray[j+1];
				chararray[j+1]= temp;
				System.out.println(chararray);
			}
		}
	}printString(chararray);
	return chararray;
}
/**
 * INsertionSorting Integer array
 * @param arr
 */
public static void insertionsort(int[] arr) {
int i,temp,j;
for(i=1;i<arr.length;i++) {
	temp=arr[i];
	j=i-1;
while(j>=0 && arr[j]>temp) {
	arr[j+1]=arr[j];
	j=j-1;
}arr[j+1]=temp;
}	printArray(arr);
}
/**
 * Binary Search
 * @param arr:-Array of integers
 * @param key:-Integers Input
 */
public static void BinarySearch(int [] arr, int key) {
	int start=0;
	int end=arr.length;
	printArray(arr);
	while(start<=end) {
		 int mid=(start+end)/2;
		if (key==arr[mid]) {System.out.println("elements found at position"+mid);
		break;
		}else if (key<arr[mid]) {
			end=mid-1;
		}else if(key>arr[mid]) {start=mid+1;
		}else {System.out.println("element not found");}
		
	}
}
/**
 * BinaryWordlist to Find word is form text file
 * 
 * @param chararray:-String array
 * @param key:-String Key
 */
public static void StringBinaryWordlist(String[] chararray,String key) {
	int start=0;
	int end=chararray.length;
	while(start<=end) {
		int mid=(start+end)/2;
		if(key==chararray[mid]) {
			System.out.println("Elements found at position"+mid);
		break;
		}else if((Math.abs(key.hashCode()))<(Math.abs(chararray[mid].hashCode())) ){
			end=mid-1;
		}else if((Math.abs(key.hashCode()))>(Math.abs(chararray[mid].hashCode()))) 
		{
			start=mid+1;
		}
		
	}System.out.println("elements not found");

}
/**
 * Method for printing String Array
 * @param arr:-String Array
 */
public static void printString(String arr[])
{
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]+" ");
		System.out.println();
	}
}
/**
 * Guessno:-Guessing number using Binary Search Alogrithms
 * @param number
 */
public static void Guessno(int number) {
	int start=0;
	int end=number;

	while(start<=end) {
		 int mid=(start+end)/2;
		 System.out.println("is number is greater than "+mid + "?");
		if (end==start) 
		{
			System.out.println("your number is "+mid);
			break;
		}
		else if (AlgoUtility.inputInt()==0) {
			end=mid;
//			System.out.println("is number is less than "+mid);

		}else if(AlgoUtility.inputInt()==1) {
			start=mid+1;
//			System.out.println("is Number is greater than"+mid);
			
		}else {System.out.println("element not found");}
		
	}
}
	/**
	 * Merge Sort:-Divide and Conquer Algorithms
	 * @param str:-String Array
	 * @param start:-Start of String
	 * @param end:-End of String
	 */
public static void mergeSort(String[] str, int start, int end) {
	if(start<end) {
		int mid = (start + end)/2;
		mergeSort(str, start, mid);
		mergeSort(str, mid+1, end);
		merge(str, start, mid, end);
	}
	printString(str);
}

/**
 * Merge
 * @param str
 * @param start
 * @param mid
 * @param end
 */
private static void merge(String[] str, int start, int mid, int end) {
	int n1 = mid-start+1;
	int n2 = end-mid;
	int s = start;
	String[] tm1 = new String[n1];//Creating left half
	String[] tm2 = new String[n2];//Creating Right half
	//copying of elements
	for(int i=0; i<n1; i++) {
		tm1[i] = str[s];
		s++;
	}
	for(int i=0; i<n2; i++) {
		mid++;
		tm2[i] = str[mid];
	}
	//finally sorting both
	int i=0, j=0;
	while(i<n1 && j<n2) {
		if(tm1[i].hashCode()<tm2[j].hashCode()) {
			str[start] = tm1[i];
			start++;
			i++;
		}else {
			str[start] = tm2[j];
			start++;
			j++;
		}
	}
	//left half sorting
	while(i<n1) {
		str[start]=tm1[i];
		start++;
		i++;
	}
	//Right half sorting
	while(j<n2) {
		str[start]=tm2[j];
		start++;
		j++;
	}
}
public static void isconvert(String string) {
	int i=Integer.parseInt(string);
	System.out.println(i);
	
}
/**
 * VendingMachine:-To Return minimum amount of notes form the machine
 * @param notes:-Integer Input of notes
 */
public static void isVendingMachine(int notes) {
	System.out.println("Amount Entered into Vending Machine"+notes);

	int [] n1= {1000,500,200,100,50,20,2,1};
	int i=-1;
	int cnt=0;
	while(notes>=0) {
		if (i<n1.length-1) {
			i=i+1;
		}
		if(notes>=n1[i]) {
			notes=notes-n1[i];
			System.out.println(n1[i]);
			i=i-1;
		cnt++;
	
		}
//		System.out.println(cnt);
		
	}
}
/**
 * PrimeRamge:-To find prime number in range
 * @param numbers
 */
public static String[] primerange(int numbers)
   {		
      int i =0;
      int num =0;
      //Empty String
      String  primeNumbers = "";
      for (i = 1; i <= numbers; i++)  	   
      { 		 		  
         int counter=0; 		  
         for(num =i; num>=1; num--)
         {
	    if(i%num==0)
	    {
		counter = counter + 1;
	    }
	 }
	 if (counter ==2)
	 {
	    //Appended the Prime number to the String
	    primeNumbers = primeNumbers + i + " ";
	 }	
      }	
      System.out.println("Prime numbers from 1 to n are :");
      System.out.println(primeNumbers);
      String [] primenumbers=primeNumbers.split(" ");
      printString(primenumbers);
     return primenumbers; 
   }


	/**
	 * PrimeANagrams :-TO find Prime NUmbers which are anagrams
	 * @param numbers
	 */

public static void PrimeAnagram(int numbers) {
	
	String [] primenumbers=AlgoUtility.primerange(numbers);
	for(int i=0;i<=primenumbers.length;i++) {
		for (int j=i+1;j<primenumbers.length;j++) {
			String str1=primenumbers[i].toString();
			String str2=primenumbers[j].toString();
			AlgoUtility.Anagram(str1, str2);
		
			System.out.println(str1+" "+str2);
			
		}
	
	}
	
	
}
}



