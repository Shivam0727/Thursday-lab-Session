import java.sql.*;
import java.util.Scanner;


public class JDBC 
{


	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter Title :");
		String Title=sc.next();
		
		System.out.println("Enter YearOfRelease :");
		int YearOfRelease=sc.nextInt();
		
		System.out.println("Enter Id : ");
		int Id = sc.nextInt();
		
		try {
			//Connection : 
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube", "root","Shivam@07122000");
			System.out.println("Database connected Successfully!!");
			
			// Execution :
		
			String q = "create table Movies (Id int(10) primary key auto_increment , Title varchar(255) not null , YearOfRelease int (10))";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(q);
			System.out.println("Table Created ...");
			
			
			String s=("insert into Movies(Title,YearOfRelease) values('Dilwale',2016) , ('Avengers Endgame' , 2019) , ('KGF-2' , 2022)");			
			stmt.executeUpdate(s);
			System.out.println("Inserted Successfully...");
			
			
			PreparedStatement ps = con.prepareStatement("update Movies set Title=? , YearOfRelease=? where Id=?");
			ps.setString(1, Title);
			ps.setInt(2, YearOfRelease);
			ps.setInt(3, Id);
			ps.executeUpdate();
			System.out.println("Update Record ...");
		
			
			String del = ("Delete From Movies where Id=2");
			stmt.executeUpdate(del);
			System.out.println("Delete record ...");
			
			ResultSet rs = stmt.executeQuery("select *from Movies");
			System.out.println("Title \t\t YearOFRelease");
			while(rs.next())
				{
					String n = rs.getString(2);
					int m = rs.getInt(3);
					System.out.println(n+" \t\t "+m);
				}
			
			
		}
		catch (ClassNotFoundException e) 
			{	
				e.printStackTrace();
			}
		catch (SQLException e) 
			{	
				e.printStackTrace();
			}
		}

}