import java.util.Scanner;
class greater_three{
int x,y,z;
void check(){
Scanner obj=new Scanner(System.in);
System.out.println("Enter the values : ");
x=obj.nextInt();
y=obj.nextInt();
z=obj.nextInt();
if(x>y){
if(x>z){
System.out.println("X is greatest : "+x);}
}
else if(y>z){
if(y>x){
System.out.println("Y is greatest : "+y);}
}
else{
System.out.println("Z is gretest : "+z);
}
}
public static void main(String [] args){
greater_three o=new greater_three();
o.check();
}










}