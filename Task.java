class Task
{
public static void main(String [ ] args)
{
byte a = 30;
byte b = 5;

division(a,b);
division();}

public static void division(byte a , byte b)
{
System.out.println("calling arguments");
byte c = (byte)(a / b);
System.out.println(c);}

public static void division()
{
System.out.println();
byte a = 12;
byte b = 5;
byte c = (byte)(a / b);
System.out.println(c);}

}