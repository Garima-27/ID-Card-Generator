import java.sql.*;
import java.util.*;
import java.time.Year;

public class Database 
{
	static Connection con=Connect.getDBConnection();
	static PreparedStatement ps;
	static int val=0;
	public static String generateId(Info obj)
	{
		String name=obj.getName();
		String fname=obj.getFatherName();
		String dob=obj.getDob();
		String address=obj.getAddress();
		try {
			ps=con.prepareStatement("select * from students_id where Name=?");
			ps.setString(1, name);
			ResultSet rq=ps.executeQuery();
			while(rq.next())
			{
				if(rq.getString("FatherName").equals(fname) && rq.getString("DateOfBirth").equals(dob) && rq.getString("Address").equals(address))
					return "NO";
			}
			ps=con.prepareStatement("select ID.nextval from dual");
			rq=ps.executeQuery();
			if(rq.next())
				val=rq.getInt(1);
			Year y=Year.now();
			String s=""+y.toString().substring(2)+dob.substring(3,5)+val;
			return s;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	public String insert(Info obj)
	{
		String id=generateId(obj);
		int a=0;
		if(id.equals("NO"))
			return "Record already exists";
		obj.setId(id);
		try {
				ps=con.prepareStatement("insert into students_id values(?,?,?,?,?,?,?,?,?,?)");
				ps.setString(1,id);
				ps.setString(2, obj.getName());
				ps.setString(3, obj.getFatherName());
				ps.setString(4, obj.getBranch());
				ps.setString(5, obj.getDob());
				ps.setString(6, obj.getGender());
				ps.setInt(7,obj.getAge());
				ps.setString(8,obj.getBloodGrp());
				ps.setLong(9,obj.getMobile());
				ps.setString(10, obj.getAddress());
				a=ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(a==0)
				return "Cannot insert";
			else
			{
				new Card(obj);
				return "Inserted";
			}
				
	}
	
}
