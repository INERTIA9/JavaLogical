import java.util.*;
public class PerfectNumber {
public static void main(String[] args) {
System.out.println("Enter the Number to check whether it is perfect number or not; Number");
Scanner s =new Scanner(System.in);
int Number =s. nextInt();
int a;
int i =1;
int sum=0;
for(i =1;i<Number;i++) {
if(Number % i ==0) {
sum = sum + i;
}
}
if (sum==Number) {
System.out.print(+Number  + " " + "is perfect number");	
}
else {
System.out.println(+Number + " " + "is not a perfect number");	
}
}
}
