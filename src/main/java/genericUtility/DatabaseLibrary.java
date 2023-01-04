package genericUtility;

    import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;

    import com.mysql.jdbc.Driver;
     public class DatabaseLibrary
	{
		/**
		 * This Method is used to register and get the connection for the database
		 * @author akash
		 */
    Connection con=null;
	public void connectToDB() throws Throwable {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		con = DriverManager.getConnection(null);

	}

	/**
	 * This Method is used to execute query and get data for user
	 * @author akash
	 * @param query
	 * @param columnIndex
	 * @param expdata
	 * @throws Throwable
	 */

	public String executeQueryAndGetData(String query, int columnIndex, String expdata) throws Throwable {
		boolean flag = false;
		String data = null;
		ResultSet result=con.createStatement().executeQuery(query);
		while(result.next()) {
			data=result.getString(columnIndex);
			if(data.equalsIgnoreCase(expdata)) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println(data+"____>data verified");
			return expdata;
		}
		else {
			System.out.println(data+"________>Not verified");
			return "";
		}
	}
	/**
	 * This method is used to close the data base
	 * @throws SQLException
	 */

	public void closeDB() throws SQLException {
		con.close();
	}
	}


