class Variable
{
public static void main(String [ ] args)
{
int a = 100;
int b = 200;

addition(a,b);
addition();
subtraction(a,b); }


public static void addition(int a , int b)
{
System.out.println("calling arguments" );
int c = a+b;
System.out.println(c);

}
public static void addition()
{
System.out.println();
int a =100;
int b = 200;
int c =a+b;
System.out.println(c);
}


public static void subtraction(int a, int b)
{
System.out.println("calling arguments");
int c = a-b;
System.out.println(c);
}
public static void subtraction()
{
System.out.println();
int a =100;
int b= 200;
int c =a-b;
System.out.println(c);
}

}


