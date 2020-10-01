
import java.util.*;
class Menu
{

public static void main (String a[])  
{  

char ans;    
Scanner sc=new Scanner(System.in);

    do
    {  
    System.out.println("\n1. Option1 \n2. Option2\n3. Option3\n");  
    System.out.println("Enter choice");
    int choice = sc.nextInt();
    switch(choice)  
    {  
        case 1 :   
        System.out.println("Option is 1! ");
        break;  
        case 2:    
        System.out.println("Option is 2! ");
        break;  
        case 3:  
           System.out.println("Option is 3! ");
        break;  
        default:   
       System.out.println("please enter valid choice");
 
    }  
System.out.println("do you want to enter more?");     
    ans= sc.next().charAt(0);      
  }


while(ans=='y'||ans=='Y');  
}  
}