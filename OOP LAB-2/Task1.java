class CLineArgs{
	public static void main(String[] args) {
		String name = args[0];
		int age =Integer.parseInt(args[1]);
		float percentObt=Float.parseFloat(args[2]);

		System.out.println("Name : "+name);
		System.out.println("AGE : "+age);
		System.out.println("pERCENTAGE : "+percentObt);


	}
}