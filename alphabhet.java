import java.util.Scanner;
class alphabhet{
char a;
void check(){
Scanner obj=new Scanner(System.in);
System.out.println("Enter the character : ");
a=obj.next().charAt(0);
switch(a){
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
System.out.println("Entered word is a vowel : "+a);
break;
default:
System.out.println("You Entered a Consonant : "+a);
}
}
public static void main(String [] args){
alphabhet O=new alphabhet();
O.check();
}
}