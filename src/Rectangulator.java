public class Rectangulator
{
public static void main(String args[])
{
int length,width;
length=Integer.parseInt(args[0]);
width=Integer.parseInt(args[1]);
Rectangle rect=new Rectangle(length,width);
System.out.println("length: "+rect.length);
System.out.println("Width: "+rect.width);
System.out.println("Area of the Rectangle: "+rect.getArea());
System.out.println("Perimeter of the Rectangle"+rect.getPerimeter());
}
}

