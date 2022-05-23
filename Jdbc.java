import java.sql.*;
import java.util.*;
public class Jdbc {

public static void main(String[] args) throws Exception {

Class.forName("com.mysql.jdbc.Driver");
 Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");

if(con != null)
{
System.out.println("Connected Successfully");
}


//Statement st= con.createStatement();
//st.execute("CREATE TABLE stud (regno INTEGER(10),name VARCHAR(10))");


Scanner sc=new Scanner(System.in);
System.out.println("Enter the regno and name");
int regno=sc.nextInt();
String name=sc.nextLine();


PreparedStatement p= con.prepareStatement("insert into stud values(?,?)");
p.setInt(1, regno);
p.setString(2, name);
int i=p.executeUpdate();
	System.out.println(i+" Record Inserted\n");
	System.out.println("The Records Are :");


ResultSet rs= p.executeQuery("select * from stud");
while(rs.next())
{
System.out.println(rs.getInt(1)+ " "+rs.getString(2));
}
con.close();
sc.close();
}
}

