import java.util.Scanner;
class greater_than{
int x;
public static void main(String [] args){
Scanner obj=new Scanner(System.in);
greater_than X=new greater_than();
System.out.println("input the number ");
X.x=obj.nextInt();
if(X.x>5){
System.out.println("inputed number is greater than 5 is "+X.x);
}
else{
System.out.println("inputed number is less than 5 is "+X.x);
}
}
}