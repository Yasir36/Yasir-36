class Area
{
	public void calcArea(int side)
	{
		System.out.println("Area Of Square = "+side*side);
	}
	public void calcArea(int length,int breadth)
	{
		System.out.println("Area Of Rectangle = "+length*breadth);
	}
	public static void main(String[] args) 
	{
		Area area = new Area();
		area.calcArea(10);
		area.calcArea(10,10);
		
	}
}