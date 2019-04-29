class Task3A{
	public static void main(String[] args) {
		int number=Integer.parseInt(args[0]);
		int sum=0;
		for(int i=1;i<=number;i++){
			sum+=i;
		}
		System.out.println("Sum = "+sum);


	}
}