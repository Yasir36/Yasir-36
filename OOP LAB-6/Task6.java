class StaticEx{
	private static int objCount=0;
	public StaticEx(){
		objCount++;
	}
	public static int getObjCount(){
		return objCount;
	}

	public static void main(String[] args) {
		StaticEx obj1=new StaticEx();
		StaticEx obj2=new StaticEx();
		StaticEx obj3=new StaticEx();
		StaticEx obj4=new StaticEx();
		System.out.println(StaticEx.getObjCount());
	}
}