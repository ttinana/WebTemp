package rs.tijanap.gym.model;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class Student {
	
	/**
	 * 20 cas ne sme da sadrzi nijednu digit CIFRU
	 * https://www.youtube.com/watch?v=93RZPA_n3DU
	 */
	@Pattern(regexp="[^0-9]*")	
	private String studentName;
	
	// 17 cas Form Validations 01
	// JSR 303/349 provided annotations 
	//@Size(min=2, max=30)
	
	/**
	 * cas 21 writing a custom Form Validation annotation
	 * https://www.youtube.com/watch?v=R3yRhL6eIAs
	 * hoby must be in a list: music or hockey or cricket
	 */
	@Size( min=3, max=30 )
	//@IsValidHobby
	//@IsValidHobby22(listOfValidHobbies="Music|Football|Cricket|Hockey")
	// if i provide default values in class i dont have to do this here:
	// i can have no parameter here in that case
	@IsValidHobby22()
	private String studentHobby;

	@Max(9999)
	private Long studentMobile;
	
	/**
	 * date of birth can not be in the future
	 */
	@Past
	private Date studentDOB;
	private ArrayList<String> studentSkills;
	
	private Address studentAddress;

	public Student() {
	}

	public Student(String name, String hobby) {
		this.studentName = name;
		this.studentHobby = hobby;
	}

	public Student(String name, String hobby, Long studentMobile,
			Date studentDOB, ArrayList<String> studentSkills) {
		this.studentName = name;
		this.studentHobby = hobby;
		this.studentMobile = studentMobile;
		this.studentDOB = studentDOB;
		this.studentSkills = studentSkills;
	}

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentHobby() {
		return studentHobby;
	}

	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}

	public Long getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(Long studentMobile) {
		this.studentMobile = studentMobile;
	}

	public Date getStudentDOB() {
		return studentDOB;
	}

	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}

	public ArrayList<String> getStudentSkills() {
		return studentSkills;
	}

	public void setStudentSkills(ArrayList<String> studentSkills) {
		this.studentSkills = studentSkills;
	}

	public Address getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(Address adress) {
		this.studentAddress = adress;
	}

}