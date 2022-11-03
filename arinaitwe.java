package assignment1;

import java.util.Scanner;

public class arinaitwe {
	public static void main(String[] args) {
		char operator;
		int num1,num2,output;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("select an operator:+,/,*,-");
		operator=input.next().charAt(0);
		
		System.out.println("Enter firt number");
		num1=input.nextInt();
		
		
		System.out.println("Enter second number");
		num2=input.nextInt();
		
		
		switch(operator) {
		case '*':
			output=num1*num2;
		
		System.out.println(num1+"*"+num2+"="+output);
		
		break;
		case '/':
			output=num1/num2;
		
		System.out.println(num1+"/"+num2+"="+output);
		
		
		
		
		break;
		case '+':
			output=num1+num2;
		
		System.out.println(num1+"+"+num2+"="+output);
		
		
		break;
		case '-':
			output=num1-num2;
		
		System.out.println(num1+"-"+num2+"="+output);
		
		break;
		default:
			System.out.println("invalid input");

	
		
		}
		
		
		input.close();
		

	}


	}	 





