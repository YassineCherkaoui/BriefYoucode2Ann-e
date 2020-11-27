package Calculator;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1=0;
int num2=0;
char operator;
double answer=0.0;

Scanner scanObject = new Scanner(System.in);

System.out.println("Please enter first number: ");
num1 = scanObject.nextInt();
System.out.println("Please enter second number: ");
num2 = scanObject.nextInt();
System.out.println("What Opertor?  ");
operator = scanObject.next().charAt(0);

switch (operator) {  //expression is evaluated once.
case '+': answer = num1 + num2;  //The value of the expression is compared with the values of each case
	break;   //it breaks out of the switch block.
case '-': answer = num1 - num2 ;
break;
case '/': answer = num1/num2;
break;
case '*': answer = num1*num2;
break;
}
System.out.println(num1+" "+operator+" "+num2+" = "+answer);

	}
    
  }
