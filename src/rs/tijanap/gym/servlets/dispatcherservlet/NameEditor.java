package rs.tijanap.gym.servlets.dispatcherservlet;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.beans.PropertyChangeListener;
import java.beans.PropertyEditor;

public class NameEditor implements PropertyEditor {
	

	@Override
	public void setAsText(String arg0) throws IllegalArgumentException {
	/*
	  	if(studentName.contains("Mr.") || studentName.contains("Ms.")){
			setValue(studentName);
			
		}else{
			studentName = "Ms." + studentName;
			setValue(studentName);
			
		}
	 */

	}


	@Override
	public void addPropertyChangeListener(PropertyChangeListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getAsText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Component getCustomEditor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getJavaInitializationString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getTags() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getValue() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean isPaintable() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void paintValue(Graphics gfx, Rectangle box) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setValue(Object value) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean supportsCustomEditor() {
		// TODO Auto-generated method stub
		return false;
	}




}
