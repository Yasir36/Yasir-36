class Number{
	public static void main(String[] args) {
		
		double num = 50.25;
		int integral = (int)num;
		float decimal = (float)(num-integral);
		System.out.println("Actual Number = "+num);
		System.out.println("Integral Part = "+integral);
		System.out.println("Floating Part = "+decimal);
	}
}