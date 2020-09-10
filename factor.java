import java.util.Scanner;
class factor{
int x,prod=1;
void factorial(){
Scanner obj = new Scanner(System.in);
System.out.println("Enter the number : ");
x=obj.nextInt();
for(int i=1;i<=x;i++){
prod*=i;
}
System.out.println("The Factorial is : "+prod);
}
public static void main(String [] args){
factor O=new factor();
O.factorial();
}


}