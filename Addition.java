class Addition
{
public static void main(String [ ] args)
{
int a = 30;
int b = 5;

addition(a,b);
addition();}

public static void addition(int a , int b)
{
System.out.println("calling arguments");
int c = a + b;
System.out.println(c);}

public static void addition()
{
System.out.println();
int a = 12;
int b = 5;
int c = a + b;
System.out.println(c);}
}