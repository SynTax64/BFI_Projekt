package aster.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.MysqlDataSource;

public class DataAccess {
	private static MysqlDataSource dataSource;

	public static Connection getConnection()
			throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		if (dataSource == null) {
			dataSource = new MysqlDataSource();
		}

		Properties props = new Properties();
		props.load(new FileInputStream("jdbc.properties"));
		dataSource.setUrl(props.getProperty("url"));
		dataSource.setUser(props.getProperty("username"));
		dataSource.setPassword(props.getProperty("password"));
		dataSource.setServerTimezone(props.getProperty("Europe/Vienna"));
		return dataSource.getConnection();
	}
}
