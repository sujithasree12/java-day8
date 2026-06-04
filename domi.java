import java.util.Scanner;
import java.util.Arrays;
class domi
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter size:");
int size=sc.nextInt();	
int[] num=new int[size];
System.out.println("Enter the numerical codes:");
for (int i = 0; i < size; i++)
 {
num[i] = sc.nextInt();
}
        
Arrays.sort(num); 
int largest = num[num.length - 1];
System.out.println("The largest number is: " + largest);
        

} 
}	
