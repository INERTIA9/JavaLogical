import java.util.*;
public class PrimeNumbers {
public static void main(String[]  args) {
int n;
int i =2;
System.out.println("Enter the number: n");
Scanner s =new Scanner(System.in);
n = s.nextInt();
boolean flag = false;
while(i<=n/2) {
if (n%i==0){
flag = true;
break;
}
++i;
}
if (!flag) {
System.out.println(+n +" " + "is a prime number");
}
else {
System.out.println(+n + " " + "is not a prime number");	
}
}
}


