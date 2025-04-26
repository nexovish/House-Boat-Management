package GUI_Final;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;

public class boat_details {
	String val="";
	Connection connect=null;
	
	try{
		Class.forName("org.postgresql.Driver");
		System.out.println("class done");
		connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/houseboat", "postgres", "manky");
		System.out.println("connect done");
		PreparedStatement st = (PreparedStatement) connect
                .prepareStatement("select * from houseboat;");
		
		ResultSet rs=st.executeQuery();
		rs.next();
		 val = "" + "Boat_id" + ":"+rs.getString(1) +  "\n"+ "  "+ "Boat_name" + ":" +
		
		rs.getString(2) +"  " + "Capacity"+":"+rs.getInt(3);
	}
	catch(Exception e1) {
        e1.printStackTrace();
        System.exit(0);
	}
	return val;
}
}

