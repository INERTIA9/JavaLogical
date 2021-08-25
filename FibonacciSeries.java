import java.util.*;
public class FibonacciSeries {
public static void main(String[] args) {
System.out.println("Enter the Nth number upto which you want fibonacci series; N");
Scanner s =new Scanner(System.in);
int N;
N = s.nextInt();
int i =1;
int firstnum=0;
int secondnum=1;
while(i<=N) {
System.out.println(firstnum + " ");
int nextnum = firstnum + secondnum;
firstnum = secondnum;
secondnum = nextnum;
i++;
}
}
}
