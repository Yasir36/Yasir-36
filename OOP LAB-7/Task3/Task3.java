class Shape
{
	private String color;
	private boolean filled;
	public Shape()
	{
		color="Blue";
		filled=false;
	}
	public Shape(String color,boolean filled)
	{
		this.color=color;
		this.filled=filled;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public boolean isFilled()
	{
		return filled;
	}
	public void setFilled(boolean filled)
	{
		this.filled=filled;
	}
	public String toString()
	{
		return "Shape[color="+color+",Filled="+filled+"]";
	}
}
class Circle extends Shape
{
	private double radius;
	public Circle()
	{
		radius=1.0;
	}
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public Circle(double radius,String color,boolean filled)
	{
		super(color,filled);
		this.radius=radius;
	}
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	public double getArea()
	{
		return 3.14*radius*radius;
	}
	public double getPerimeter()
	{
		return 2*radius*(radius-1);
	}
	public String toString()
	{
		return "Circle["+super.toString()+",radius="+radius+",area="+getArea()+",perimeter="+getPerimeter()+"]";
	}
}
class Rectangle extends Shape
{
	double width;
	double length;
	Rectangle()
	{
		width=1.0;
		length=1.0;
	}
	Rectangle(double width,double length)
	{
		this.width=width;
		this.length=length;
	}
	Rectangle(double width,double length,String color,boolean filled)
	{
		super(color,filled);
		this.width=width;
		this.length=length;
	}
	public double getWidth()
	{
		return width;
	}
	public void setWidth(double width)
	{
		this.width=width;
	}
	public double getLength()
	{
		return length;
	}
	public void setLength(double length)
	{
		this.length=length;
	}
	public double getArea()
	{
		return length*width;
	}
	public double getPerimeter()
	{
		return 2*(length-1);
	}
	public String toString()
	{
		
		return "Rectangle["+super.toString()+",length="+length+",width="+width+",area,"+this.getArea()+",perimeter="+this.getPerimeter()+"]";
	}
}
class Square extends Rectangle
{
	double side;
	Square()
	{
		side=1.0;
	}
	Square(double side)
	{
		this.side=side;
	}
	Square(double side,String color,boolean filled)
	{
		super(side,side,color,filled);
		this.side=side;

	}
	public double getSide()
	{
		return side;
	}
	public void setSide(double side)
	{
		this.side=side;
	}
	public void setWidth(double side)
	{
		super.setWidth(side);
	}
	public void setLength(double side)
	{
		super.setLength(side);
	}
	public String toString()
	{
		Shape shape=new Shape();
		return "Square["+shape.toString()+",side="+side+"]";
	}
}
class Main
{
	public static void main(String[] args)
	{
		Circle circle=new Circle(3.0,"Red",true);
		Rectangle rectangle=new Rectangle(3.0,2.0,"Red",true);
		Square square=new Square(3.0,"Red",false);
		System.out.println(circle.toString());
		System.out.println(rectangle.toString());
		System.out.println(square.toString());
	}
}