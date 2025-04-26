package GUI_Final;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class boat {
	
	String customer_id;
	
	boat(String customer_id){
		this.customer_id = customer_id;
	}
	
	
	
	public void booking(String id,String name,int capacity) {
		Connection connect = null;
		try{
			Class.forName("org.postgresql.Driver");
			System.out.println("class done");
			connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/houseboat", "postgres", "manky");
			System.out.println("connect done");
			PreparedStatement st = (PreparedStatement) connect
                    .prepareStatement("insert into houseboat values(?,?,?)");
			st.setString(1, id);
            st.setString(2, name);
            st.setInt(3,capacity);
            st.executeUpdate();
		}catch(Exception e1) {
	         e1.printStackTrace();
	         System.exit(0);
		}
		
	}
	
	public String  display(String customer_id) {
		String val = "";
		
		Connection connect = null;
		try{
			Class.forName("org.postgresql.Driver");
			System.out.println("class done");
			connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/houseboat", "postgres", "manky");
			System.out.println("connect done");
			PreparedStatement st = (PreparedStatement) connect
                    .prepareStatement("select * from Customer where Customer_id =?");
			st.setString(1, this.customer_id);
			ResultSet rs=st.executeQuery();
			rs.next();
			val = "" + "Customer Id" + ":"+rs.getString(1) + "  " +  "Boat id" + ":" + rs.getString(2) +  "\n"+ "  "+ "First Name" + ":" +
			
			rs.getString(3) + "  "+ "Last Name" +":"+ rs.getString(4) +"  " +"Phone no"+ ":" +rs.getInt(5)+"  "+"Customer city"+":" +rs.getString(6);
		}
            
            
           
            
		catch(Exception e1) {
	         e1.printStackTrace();
	         System.exit(0);
		}
		
		return val;
		
	}

}