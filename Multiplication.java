class Multiplication
{
public static void main(String [ ] args)
{
int a = 12;
int b = 5;

multiplication(a,b);
multiplication();}

public static void multiplication(int a , int b)
{
System.out.println("calling arguments");
int c = a * b;
System.out.println(c);}

public static void multiplication()
{
System.out.println();
int a = 12;
int b = 5;
int c = a * b;
System.out.println(c);}
}