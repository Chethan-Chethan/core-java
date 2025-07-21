class Division
{
public static void main(String [ ] args)
{
int a = 30;
int b = 5;

division(a,b);
division();}

public static void division(int a , int b)
{
System.out.println("calling arguments");
int c = a / b;
System.out.println(c);}

public static void division()
{
System.out.println();
int a = 12;
int b = 5;
int c = a / b;
System.out.println(c);}
}