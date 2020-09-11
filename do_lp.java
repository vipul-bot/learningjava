//Using do-while loop
import java.util.Scanner;
class do_lp{
int x,prod=1;
int g_loop(){
Scanner obj=new Scanner(System.in);
System.out.println("Enter the number : ");
x=obj.nextInt();
do{
prod*=x;
x-=1;
}while(x>0);
return (prod);
}
public static void main(String [] args){
do_lp O=new do_lp();
System.out.println("the output is : "+O.g_loop());



}







}