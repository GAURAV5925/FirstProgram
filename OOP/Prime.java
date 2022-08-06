package PrimeNumber;
import java.util.Scanner;
public class Prime {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
int ch,i,num,n,sum,cnt,flag,fact;
do {
System.out.println(&quot;1 : Find Factorial&quot;);
System.out.println(&quot;2: Display First 50 prime

numbers&quot;);

System.out.println(&quot;3: Find Sum and average of N

numbers&quot;);

System.out.println(&quot;4: Exit&quot;);
System.out.println(&quot;Enter Choice= &quot;);
ch = sc.nextInt();
switch(ch) {
case 1 : System.out.print(&quot;Enter number = &quot;);
n = sc.nextInt();
fact = 1;
for(i=1; i&lt;=n; i++)
fact = fact * i;
System.out.println(&quot;Factorial = &quot; + fact);
break;

case 2: cnt = 1;
n=2;
while(cnt&lt;=50) {
flag = 1;
for(i = 2; i&lt;=n/2; i++) {
if(n%i == 0) {
flag = 0;
break;
}
}
if(flag == 1) {

System.out.println(n);
cnt++;
}
n++;
}
break;
case 3: System.out.print(&quot;Enter limit =&quot;);
n = sc.nextInt();
sum = 0;
for(i =1; i&lt;=n; i++)
{
System.out.print(&quot;Enter number = &quot;);
num = sc.nextInt();
sum = sum + num;
}
System.out.println(&quot;Sum = &quot; + sum);
System.out.println(&quot;Avg = &quot; + (float)sum/n);
break;
}
}while(ch!=4);
sc.close();
}
}
