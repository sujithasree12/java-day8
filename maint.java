class animal
{
void sound()
{
System.out.println("animal makes sound");
}
}
class dog extends animal
{
@Override
void sound()
{
System.out.println("dog barks");
}
}
class cat extends animal
{
@Override
void sound()
{
System.out.println("cat meow");
}
}
class maint{
public static void main(String[]args)
{
animal a;
a=new dog();
a.sound();
a=new cat();
a.sound();
}
}