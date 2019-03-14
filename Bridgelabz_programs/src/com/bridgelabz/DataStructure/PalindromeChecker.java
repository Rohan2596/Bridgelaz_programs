
package com.bridgelabz.DataStructure;
/**
 * To check if String is Palindrome or not
 * @author Rohan Kadam
 *
 */
public class PalindromeChecker {
	public static void main(String[] args) {
    int val1=0;
    int val2 = 0;
    QueueWithlink<Character> Queue = new QueueWithlink<Character>();
     System.out.println("ENTER THE String");
    String InputString = DSUtility.StringInput();
    char word[] = new char[20];//First array
    char arr[] = new char[20];//second array
    String reverse="";//Empty reverse array
    word = InputString.toCharArray();
    System.out.println(word);

    for (char item : word) {
        Queue.engueu(item);
        val1=Queue.dequeu();
        System.out.println(val1); 
    }
    
   //Reversing the String
    for (int i = InputString.length() - 1 ; i >= 0 ; i--) {
          reverse = reverse + InputString.charAt(i);
    } 
       System.out.println("Reverse of the string: " + reverse);

    System.out.println("*****************");
    arr=reverse.toCharArray();
    for (char item1 :arr) {
        Queue.engueu(item1);
        val2 = Queue.dequeu();
        System.out.print(val2 + " ");
    System.out.println(item1);
    }
    System.out.println("*******************");
//Comparing both value of String
    if (val1==val2) {
        System.out.println("String are palindrome");
    }else {
        System.out.println("String not Palindrome");
    }
}

}
	
