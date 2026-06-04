class employ
{
employ()
{
System.out.println("employee details");
}
}
class manager extends employ
{
manager()
{
super();

System.out.println("manager details:");
}
}
class moji
{
public static void main(String[]args)
{
manager m=new manager();
}
}
