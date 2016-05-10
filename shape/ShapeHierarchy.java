/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;


import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;
import java.util.Scanner;

class Shape
{
    private double len,hei,w ;
    Shape(double a,double b,double c)
    {
        len=a;
        hei=b;
        w=c;
    }
    Shape (double a,double b)
    {
        len=a;
        hei=b;
    }
    Shape (double a)
    {
        len=a;
    }
    double geta()
    {
        return len;
    }
    double getb()
    {
        return hei;
    }
    double getc()
    {
        return w;
    }
}
abstract class TwoDShape extends Shape
{
    TwoDShape(double a,double b,double c)
    {
        super(a,b,c);
    }
    TwoDShape(double a,double b)
    {
        super(a,b);
    }
    TwoDShape(double a)
    {
        super(a);
    }
    abstract double area ();
}
abstract class ThreeDShape extends Shape
{
    ThreeDShape(double a,double b,double c)
    {
        super(a,b,c);
    }
     ThreeDShape(double a)
    {
        super(a);
    }
    abstract  double volume ();
}
class Circle extends TwoDShape
{
    Circle(double a)
    {
        super(a);
    }
    @Override
    double area()
    {
        return 3.1416*geta()*geta();
    }

    

    

    
}
class Rectangle extends TwoDShape
{
    Rectangle(double a,double b)
    {
        super(a,b);
    }
    @Override
    double area()
    {
        return getb()*geta();
    }

    
}
class Triangle extends TwoDShape
{
    Triangle(double a,double b,double c)
    {
        super(a,b,c);
    }
    @Override
    double area()
    {
        double a=geta(),b=getb(),c=getc(),d;
        d=(a+b+c)/2.0;
        d=d*(d-a)*(d-b)*(d-c);
        d=sqrt(d);
        return d;
    }
}
class Sphere extends ThreeDShape
{
    Sphere(double a)
    {
        super(a);
    }
    @Override
    double volume()
    {
        return pow(geta(),3.0)*(4.0/3)*3.1416;
    }
    
}
class Cube extends ThreeDShape
{
    Cube(double a,double b,double c)
    {
        super(a,b,c);
    }
    @Override
    double volume()
    {
        return geta()*getb()*getc();
    }
}

public class ShapeHierarchy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TwoDShape obj1=new Circle(3.17);
        TwoDShape obj2=new Rectangle(10,9);
        TwoDShape obj3=new Triangle(10,7,4);
        ThreeDShape obj4=new Sphere(10);
        ThreeDShape obj5=new Cube(5,6,7);
        
        System.out.println("obj1 is a "+obj1.getClass().getSimpleName()+": "+obj1.area());
        System.out.println("obj2 is a "+obj2.getClass().getSimpleName()+" :"+obj2.area());
        System.out.println("obj3 is a "+obj3.getClass().getSimpleName()+": "+obj3.area());
        System.out.println("obj4 is a "+obj4.getClass().getSimpleName()+": "+obj4.volume());
        System.out.println("obj5 is a "+obj5.getClass().getSimpleName()+": "+obj5.volume());
    }
    
}
