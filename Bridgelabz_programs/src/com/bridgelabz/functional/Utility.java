package com.bridgelabz.functional;

 
import java.util.*;
/**
 * Purpose:-Performing various Functional Problems
 * @author Rohan Kadam
 *
 */
public class Utility {
	/**
	 * Purpose:-Inputting  String by using Scanner Method
	 * @return:- Inputed String
	 */
	
	public static String inputString() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String ");
		String name=scanner.nextLine();
		
		return name;
	}
	/**
	 * Purpose:-Inputting Input by using Scanner Method
	 * @return:-Inputed Integers
	 */
   public static int inputInt() {
	System.out.println("Enter the numbers");
	int integer=new Scanner(System.in).nextInt();
	
	return integer;
}
   /**
    * Purpose:-Inputting Input FLOAT by using Scanner Method 
    * @return:-Inputed Floating point
    */
   public static int inputFloat() {
		System.out.println("Enter the numbers");
		Scanner scanner = new Scanner(System.in);
		float floatint=scanner.nextFloat();
		
		return (int)floatint;}
   
   /**
    * Purpose:- Generating Random method
    * @return:-Random object
    */
    public static Random random() {
    	Random rand =new Random();
    	return rand;
    }
    /**
     * Purpose:-Checking input String length and Replaceing it 
     * 
     * @param str:-String input
     */
	public static void validation(String str) {
		if(str.length()>=4)
		{
			System.out.println("Valid String ");
			String str1= "Hello <<Username>> how are you";
			String str2=str1.replace("<<Username>>",str);
			System.out.println(str2);
			System.out.println("Hello "+str+" How r u?");
		}
		else {
			System.out.println("Invalid String");
		}}
	/**
	 * Purpose:-Flip coin and print the Percentage of heads and tails
	 * 
	 */
	public static void coinflip() {
	int	total_heads=0;
	int total_tails=0;
	int count=0;
	while(count<100) {
		Random rand = random();
		 int coin=rand.nextInt(3);
		 if (coin==1) {
			 System.out.println("heads");
			 total_heads+=1;
			 count+=1;
		}else if(coin==2) {
			System.out.println("tails");
			total_tails+=1;
			count+=1;
		}
	}
	int sum1 = total_heads + total_tails;
	System.out.println(sum1);
	System.out.println("Okay,you flipped "+total_heads+" times");
	System.out.print("and you flipped "+total_tails+" times");
	double h1=(((total_heads)*100)/sum1);
	System.out.println("Percentage of heads:- "+h1);
	double t1=(((total_tails)*100)/sum1);
	System.out.println("Percentage of tails:- "+t1);
		}
	/**
	 * Purpose:-Leap year
	 * @param str:- Year
	 */
	public static void leapyear(String str) {
		if (str.length()==4) {
			System.out.println("Valid year");
			int n =Integer.parseInt(str);
			if (n%4==0 & n%100!=0 | n%400==0) {
				System.out.println("Year,its is leap year");
			}else {
				System.out.println("Year is not a leap year");
			}
		}
		else {
			System.out.println("Invalid year");
		}
	}
/**
 * 	Power of 2
 * @param n= range of N
 */
	public static void power2(int n) {
		for(int i = 0;i <= n-1;i++) {
			int p2=(int) Math.pow(2,i);
			System.out.println("Power raised to "+i+"="+p2);
		}
		
	}
/**
 * Harmonic Series
 * @param n=Range of N
 */
	public static void harmonic(int n) {
		  double results=0;
		  if(n==0) {
			  System.out.println("the harmonic value is Zero");
			  }
		  else {
			  for (int i=1;i<=n;i++) {
				  results=results +(double)1/i;
				  System.out.println(i+"="+results);
				  }
		  }
		System.out.println("The total value of:-"+results);
	}
	/**
	 * Prime Factors 
	 * @param number
	 */
	
	
public static void primefactors(int number) {
    int cnt=0;
	if (number<0) {
		System.out.println("Prime factors of negative doesnot exits");
		}
	else if(number==0) {
		System.out.println("prime factors of zero is 0");
	}
	else {
		for(int i=2;i<=number;i++) {
			while(number%i==0) {
				number=number/i;
				System.out.println(i);
				cnt=cnt+1;
			}System.out.println("Counter:-"+cnt);
		}
	}
}
/**
 * Gambler 
 * Predefined stake,Goal
 * @param goal
 */
public static void gambler(int goal) {
	int total_money=1;
	while(total_money<goal) {
		if(total_money==0) {
			break;
		}
		 int n1=Utility.inputInt();
		 Random rand =random();
		 int n=rand.nextInt(2);
		 System.out.println(n);
		 if (n1==n) {
			 System.out.println("Gambler won");
			 total_money+=1;
			 System.out.println("Total_money :- "+total_money);
		 }
		 else if(n!=n1) {
			 System.out.println("Gambler lost");
			 total_money-=1;
			 System.out.println("Total_money :-"+total_money);
			 
		 }
	}
	
}
/**
 * Euclidean Distance
 * 
 * @param n1:-Position one
 * @param n2:- Position Two
 */
public static void euclidean(int n1,int n2) {
	int a,b,su; 
	a= n1*n1;
	b=n2*n2;
	su=a+b;
    float sqrt = (float)Math.pow(su,0.5);
    System.out.println("Elucidean distance between:- "+sqrt);
	}
/**
 * Quadratic Equation
 * @param a:-Value of Coefficient
 * @param b:-Value of Coefficient
 * @param c:-Value of Coefficient
 */
public static void quadratic(int a,int b,int c) {
	float delta;
	delta=((b*b)-(4*a*c));
	 float d=Math.abs(delta);
	 float roots1=(float) (-b+(Math.sqrt(Math.abs(delta)))/2*a);
	 float roots2=(float) (-b-(Math.sqrt(Math.abs(delta)))/2*a);
	 System.out.println("Roots are 1:- "+roots1+"  2:-  "+roots2);
}
/**
 * Windchill
 * @param t:-Temperature 
 * @param v:-Wind speed
 */
public static void windchill(float t,float v) {
	float w1=(float) ((float)35.74+0.6215*t);
	float w2=(float) ((0.4275*t-35.75)*Math.pow(v, 0.16));
	float w3=(float)(w1 +w2);
	if ((t<=50) & v<=120 & v>=3) {
		System.out.println("valid input"+w3);
	}else {
		System.out.println("Invalid input"+w3);
	}
}
/**
 * CouponNumber
 * @param n:-Total of CouponNumber
 */
public  static void couponnumb(int n) {
	int arr[]= new int[n];
	int n1;
	Random rand =random();
	for(int i=0;i<arr.length;i++) {
		 n1=rand.nextInt(1000);
//		System.out.println(arr[i]);
		while(arr[i]!=n1) {
//			 n1=rand.nextInt(20);
			 arr[i]=n1;
             
		 System.out.println(arr[i]);
		 }
		}

}
/**
 * Sum Of Three
 * @param arr:-Array consisting of various of elements
 */
public static void sumOfThree(int[] arr) {
	int counter=0;
	for(int i=0; i<arr.length; i++) {
		for(int j=1+i; j<arr.length; j++) {
			for(int k=j+1; k<arr.length; k++) {
				if(arr[i]+arr[j]+arr[k]==0) {
					System.out.println(arr[i]+" + "+arr[j]+" + "+arr[k]+" = 0");
					counter++;
				}
			}
		}
	}
	System.out.println("Total no of triplets are "+counter);
	
}
/**
 * 2DArray
 * @param n1:-Number of rows
 * @param n2:-Number of Columns
 */
public static void two2darray(int n1,int n2) {
	int [][] arr=new int[n1][n2];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			
				Random rand =random();
				int n=rand.nextInt(1000);
				arr[i][j]=n;
				System.out.println(arr[i][j]);
			}
		}
	}


public static void permute(String string,int l,int r) {
if (l==r) {
	System.out.println(string);
}else {
	for (int i=l;i<=r;i++) {
		string=swap(string,l,i);
		permute(string,l+1,r);
	}
}}
public static String swap(String string,int i,int j){
	char temp;
	char[] charArray=string.toCharArray();
	temp=charArray[i];
	charArray[i]=charArray[j];
	charArray[j]=temp;
	return String.valueOf(charArray);
}
}




