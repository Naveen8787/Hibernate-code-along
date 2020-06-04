package utility;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionManager {
	public static Connection getConnection() throws Exception {
		Properties prop = loadPropertiesFile();
		Class.forName((String) prop.getProperty("driver"));
		Connection con = DriverManager.getConnection((String) prop.getProperty("url"),(String) prop.getProperty("username"),(String) prop.getProperty("password"));
		return con;
	}
	
	public static Properties loadPropertiesFile() throws Exception {
		Properties prop = new Properties();	
		InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
		prop.load(in);
		in.close(); 
		return prop;
	}
}

