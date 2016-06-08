package org.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

/**
 * @author Crunchify.com
 * 
 */

public class PropertiesGetPropertyValues {
	String result = "";
	InputStream inputStream;
	Properties prop = new Properties();
	String propFileName = "config.properties";

	public String getPropValues() throws IOException {

		try {
			inputStream = getClass().getClassLoader().getResourceAsStream(
					propFileName);

			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '"
						+ propFileName + "' not found in the classpath");
			}

			Date time = new Date(System.currentTimeMillis());

			// get the property value and print it out
			String user = prop.getProperty("user");
			String company1 = prop.getProperty("company1");
			String company2 = prop.getProperty("company2");
			String company3 = prop.getProperty("company3");
			String userAPR = prop.getProperty("apr.user");
			//String passAPR = prop.getProperty("apr.password");

			result = "Company List = " + company1 + ", " + company2 + ", "
					+ company3 + "userAPR" + userAPR;
			System.out.println(result + "\nProgram Ran on " + time
					+ " by user=" + user);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			inputStream.close();
		}
		return result;
	}
	

	public String getUserAPR() throws IOException {

		try {

			inputStream = getClass().getClassLoader().getResourceAsStream(
					propFileName);

			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '"
						+ propFileName + "' not found in the classpath");
			}

			String userAPR = prop.getProperty("apr.user");

			result = userAPR;
			
		} catch (Exception e) {
			System.out.println("Exception userAPR undefined: " + e);
		} finally {
			inputStream.close();
		}
		return result;
	}
	
	

	public String getPassAPR() throws IOException {

		try {

			inputStream = getClass().getClassLoader().getResourceAsStream(
					propFileName);

			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '"
						+ propFileName + "' not found in the classpath");
			}

			String passAPR = prop.getProperty("apr.password");

			result = passAPR;
			
		} catch (Exception e) {
			System.out.println("Exception passAPR undefined: " + e);
		} finally {
			inputStream.close();
		}
		return result;
	}
}