import java.util.Scanner;
class greaterthan{
int x;
void greater(){
Scanner obj=new Scanner(System.in);
System.out.println("input the number ");
x=obj.nextInt();
if(x>5){
System.out.println("inputed number is greater than 5 is "+x);
}
else{
System.out.println("inputed number is less than 5 is "+x);
}
}
public static void main(String [] args){

greaterthan X=new greaterthan();
X.greater();
}
}