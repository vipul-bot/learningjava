//factorial using while loop
import java.util.Scanner;
class w_loop{
int x,prod=1;
int c_loop(){
Scanner obj=new Scanner(System.in);
System.out.println("Enter the number : ");
x=obj.nextInt();
while(x>0){
prod*=x;
x-=1;
}
return (prod);
}
public static void main(String [] args){
w_loop O=new w_loop();
System.out.println("The Output is : "+O.c_loop());
}
}