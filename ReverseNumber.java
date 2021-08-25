import java.util.*;
public class ReverseNumber {
public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
int number;
int reverse=0;
System.out.println("ENTER THE NUMBER TO BE REVERSED = number");
number=sc.nextInt();
while(number!=0) {
int Remainder = number % 10;
reverse = reverse *10 + Remainder;
number = number/10;
}
System.out.println("Reversed number is " +reverse);
}
}
