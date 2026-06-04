interface vehicle
{
void start();
}
class car implements vehicle
{
public void start()
{
System.out.println("Car starts");
}
}
class abs{
public static void main(String[]args)
{
vehicle v=new vehicle;
v.start();
}
}