class Authors{
	private String _name;
	private String _email;
	private char   _gender;

	Authors(String name,String email,char gender)
	{
		_name=name;
		_email=email;
		_gender=gender;
	}
	public String getName(){return _name;}
	public char getGender(){return _gender;}
	public void setEmail(String email){ _email=email;}
	public String getEmail(){return _email;}
	public String toString(){
		
		return "Author[Name="+_name+",Email="+_email+",Gender="+_gender+"]";
	}
	public static void main(String args[])
	{
		Authors author=new Authors("Yasir","Y.gmail.com",'M');
		System.out.println(author.toString());
		author.setEmail("Whatever@email.com");
		System.out.println(author.toString());
}
}