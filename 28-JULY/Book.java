public class Book 
{
    private String Name;
    private String ISBN;
    private String Author;
    private String Publisher;


		public Book(String Name, String ISBN, String Author, String Publisher) 
		{
			this.Name = Name;
			this.ISBN = ISBN;
			this.Author = Author; 
			this.Publisher = Publisher; 
		}

		public void setName(String Name) 
		{ 
			this.Name = Name;
        	}
		public String getName() 
		{
			    return Name;
        	}
		public void setISBN(String ISBN)
        	{ 
			this.ISBN = ISBN;
		}
		public String getISBN() 
		{
  			  return ISBN;
 		}
		public void setAuthor(String Author) 
		{ 
			this.Author = Author;
		}
		public String getAuthor() 
		{
    			return Author;
		}
	
		public void setPublisher(String Publisher) 
		{
			 this.Publisher = Publisher;
		}
		public String getPublisher()
		{
  			  return Publisher;
  		}
		public void getBookInfo() 
		{
			System.out.printf("%s %s %s %s", Name,ISBN,Author,Publisher);
		}

			public static void main(String[] args) 
			{	
				Book Story = new Book("Name : Hope", "ISBN : 1837562", "Author : Marwa", "Publisher : Springer"); 
				Story.getBookInfo();
			}
 }