class Author{
	private String _name;
	private String _email;
	private char   _gender;

	Author(String name,String email,char gender)
	{
		_name=name;
		_email=email;
		_gender=gender;
	}
	public String getName(){return _name;}
	public char getGender(){return _gender;}
	public void setEmail(String email){ _email=email;}
	public String getEmail(){return _email;}
	public String toString()
	{
		return "Author[Name="+_name+",Email="+_email+",Gender="+_gender+"]";
	}
	
}
class Book{
 	private String name;
 	private Author authors[];
 	private double price;
 	private int qty;
 	Book(String name,Author authors[],double price,int qty)
 	{

 		this.name=name;
 		this.authors=authors;
 		this.price=price;
 		this.qty=qty;
 		
 	}
 	public String getName(){return name;}
 	public Author[] getAuthors(){return authors;}
 	public void   setPrice(double price){this.price=price;}
 	public double getPrice(){return price;}
 	public void   setQty(int qty){this.qty=qty;}
 	public int    getQty(){return qty;}
	public String toString()
	{
		String data="";
		for(int i=0;i<authors.length;i++){
			data+="{ Author[Name = "+authors[i].getName()+" ,Email = "+authors[i].getEmail()+" ,Gender = "+authors[i].getGender()+"]\n";
		}
		return "Book[name = "+name+",Price=" +price+" ,Quantity = "+qty+"]"+"authors = "+data+"}]";
	}
	public static void main(String args[])
	{
		Author author=new Author("Yasir","y.gmail.com",'M');
		Author author2=new Author("YasirBhatti","yBB.gmail.com",'M');
		Author[] authors={author,author2};
		Book book=new Book("Legend Of Zelda",authors,1500,3);
		
		System.out.println(book.toString());
	 	
		
	}	
 }