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
		
			// 0- Drop Table : 
			Statement stmt = con.createStatement();
			String drop = "Drop table if exists Movies";
			stmt.execute(drop);
			System.out.println("Table exists , so Table will Drop ...");
			

			// 1- Create Table : 
			String q = "create table Movies (Id int(10) primary key auto_increment , Title varchar(255) not null , YearOfRelease int (10))";
			Statement stmt = con.createStatement();
			stmt.execute(q);
			System.out.println("Table Created ...");
			
			
			// 2- Insert Data inside Table :
			PreparedStatement s=con.prepareStatement("insert into Movies(Title,YearOfRelease) values(?,?)");			
			s.setString(1, Title);
			s.setInt(2, YearOfRelease);
			s.executeUpdate();
			System.out.println("Inserted Successfully...");
			
			
			// 3- Update Data :
			PreparedStatement ps = con.prepareStatement("update Movies set Title=? , YearOfRelease=? where Id=?");
			ps.setString(3, Title);
			ps.setInt(4, YearOfRelease);
			ps.setInt(5, Id);
			ps.executeUpdate();
			System.out.println("Update Record ...");
		
			
			// 4- Delete Data : 
			String del = ("Delete From Movies where Id=2");
			stmt.execute(del);
			System.out.println("Delete record ...");
			
			
			// 5- Display Data : 
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

