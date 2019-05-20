class Circle 
{
	private double radius;
	private String color;
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public Circle(double radius,String color)
	{
		this(radius);
		this.color=color;
	}
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	public double getRadius()
	{
		return radius;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public String getColor()
	{
		return color;
	}
	public double getArea()
	{
		return 3.14*radius*radius;
	}
	public String toString()
	{
		return "Circle[radius="+radius+",color="+color+"]";
	}
}
class Cylinder extends Circle
{
	private double height;
	Cylinder(double radius)
	{
		super(radius);
	}
	Cylinder(double radius,double height)
	{
		this(radius);
		this.height=height;
	}
	Cylinder(double radius,double height,String color)
	{
		this(radius);
		this.height=height;
		super.setColor(color);
	}
	public double getHeight()
	{
		return height;
	}
	public void setHeight(double height)
	{
		this.height=height;
	}
	public double getVolume()
	{
		return (4*3.14*super.getRadius()*super.getRadius()*super.getRadius())/3;
	}

}
class Main
{
	public static void main(String[] args) 
	{
		
		Circle circle = new Circle(1.0,"Red");
		Cylinder cylinder = new Cylinder(1.0,1.0,"Red");
		circle.toString();
		System.out.println("Volume Of Cylinder : "+cylinder.getVolume()+"\nArea Of Circle : "+circle.getArea());
	}
}