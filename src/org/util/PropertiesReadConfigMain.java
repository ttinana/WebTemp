package org.util;

import java.io.IOException;

public class PropertiesReadConfigMain {
	PropertiesGetPropertyValues properties = new PropertiesGetPropertyValues();

	public void test() throws IOException {
		properties.getPropValues();
	}

	public String getUserAPR() throws IOException {
		return properties.getUserAPR();
	}

	public String getPassAPR() throws IOException {
		return properties.getPassAPR();
	}

}
