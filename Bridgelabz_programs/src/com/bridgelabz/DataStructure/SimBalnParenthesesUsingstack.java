package com.bridgelabz.DataStructure;
/**
 * Simple Balanced Parthenthsis
 * @author admin1
 *
 */
public class SimBalnParenthesesUsingstack {
static	int cnt1=0;
static	int cnt2=0;
 
public static boolean areParthenthesBalance(char exp[]) {
	Stack stack=new Stack();
	for(int i=0;i<exp.length;i++) {
		if(exp[i]=='('||exp[i]=='['||exp[i]=='{' ) {
			stack.push(exp[i]);
			
			  cnt1++;
		}
		if(exp[i]==')'||exp[i]==']'||exp[i]=='}') {
			if(stack.isEmpty()) {
				return false;
			}else {
				stack.pop();
			   cnt2++;
			}
		}
	}
	if (cnt1==cnt2) {
		return true;
	}else {
	return false;
}}

public static void main(String[] args) {
	System.out.println("Enter the expression:=");
	String str  =DSUtility.StringInput();
	char []exp = str.toCharArray();
	if(areParthenthesBalance(exp))
		System.out.println("Balanced!");
	else
		System.out.println("Not Balanced!");
}		

}
//SINGLE COUNTER CAN BE ALSO USED SUCH THAT FOR POP DECREMENTING COUNTER & FOR PUSH INCREMENTING COUNTER