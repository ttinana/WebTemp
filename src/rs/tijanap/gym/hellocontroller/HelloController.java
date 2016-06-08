package rs.tijanap.gym.hellocontroller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;




import rs.tijanap.gym.businesscontroller.LoginController;
import rs.tijanap.gym.model.Student;
import rs.tijanap.gym.model.Zaposleni;
import rs.tijanap.gym.testModel.TestSpringCoreApp;

@Controller
//@RequestMapping("/gym")
public class HelloController {

	/*
	 * @InitBinder public void InitBinder(WebDataBinder binder) { // ovako nece
	 * preneti vrednost ovog parametra binder.setDisallowedFields(new String[] {
	 * "studentMobile" });
	 * 
	 * // formating date in format yyyy***MM***dd SimpleDateFormat dateFormat =
	 * new SimpleDateFormat("yyyy***MM***dd");
	 * binder.registerCustomEditor(Date.class, "studentDOB", new
	 * CustomDateEditor(dateFormat, false));
	 * 
	 * binder.registerCustomEditor(String.class, "studentName", new
	 * StudentNameEditor());
	 * 
	 * }
	 */

	// http://localhost:8080/GymApp/gym/welcome
	@RequestMapping("/*")
	protected ModelAndView handleRequestWelcome(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		TestSpringCoreApp test = new TestSpringCoreApp();
		test.test();

		ModelAndView modelandview = new ModelAndView("welcome");
		modelandview.addObject("welcomeMessage", "Dobrodošli");

		return modelandview;
	}

	@RequestMapping("/login")
	// /${pageContext.request.contextPath}
	protected ModelAndView handleRequestLogin(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ModelAndView modelandview = new ModelAndView("LoginForm");
		modelandview.addObject("welcomeMessage", "Dobrodošli");
		modelandview.addObject("title", "Autentifikacija");
		modelandview.addObject("subtitle",
				"Unesite parametre za pristup sistemu: ");
		return modelandview;
	}

	@RequestMapping(value = "/submitLOGINForm", method = RequestMethod.POST)
	public ModelAndView submitLOGINForm(
			@Validated @ModelAttribute("zaposleni") Zaposleni zaposleni,
			BindingResult result) {
				
		LoginController tryLogin = new LoginController();		
		ModelAndView model;
		if (result.hasErrors() ||  !(tryLogin.loginClan(zaposleni))) {
			model = new ModelAndView("LoginForm");
			model.addObject("subtitle", "Pokušajte ponovo!");
		} else {

			model = new ModelAndView("loginSuccess");
			model.addObject("subtitle", "Èestitamo!");
		}

		return model;
	}

	// //////////////////////////////////////////////
	// //////////////////////////////////////////////
	// ///////////////////////////////////////////////

	// http://localhost:8080/GymApp/gym/hi
	@RequestMapping("/hi")
	protected ModelAndView handleRequestHi(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		TestSpringCoreApp test = new TestSpringCoreApp();
		test.test();

		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage", "CRHoV");

		return modelandview;
	}

	// if i wont to send parameter
	// http://localhost:8080/GymApp/gym/org/hi/tijana
	@RequestMapping("/org/hi/{username}")
	protected ModelAndView handleRequestForward(
			@PathVariable("username") String name) {

		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage", "Hi " + name);

		return modelandview;
	}

	// http://localhost:8080/GymApp/gym/aha/zdravo/tijana/pavicic
	@RequestMapping("/aha/{greetingMessage}/{username}/{pass}")
	protected ModelAndView handleRequestForwardMap(
			@PathVariable Map<String, String> pathVars) {
		String greeting = pathVars.get("greetingMessage");
		String name = pathVars.get("username");
		String pass = pathVars.get("pass");

		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage", greeting + " " + name + " "
				+ pass);

		return modelandview;
	}

	// /////////////////////////////////////////////////////////////////////////////////////////
	// /////////////////////////////////////////////////////////////////////////////////////////
	// ////////////////////////////////////////////////////////////////////////////////////////
	// ////////////////////////////////////////////////////////////////////////////////////////
	/**
	 * 10.cas https://www.youtube.com/watch?v=jCsbrk01V_4
	 * http://www.gontu.org/spring
	 * -mvc-tutorials-10-handling-html-form-using-requestparam-annotation/
	 * 
	 * 
	 */
	// http://localhost:8080/GymApp/gym/admissionForm
	@RequestMapping(value = "/admissionForm", method = RequestMethod.GET)
	// @RequestMapping("/admissionForm")
	protected ModelAndView getAdmissionForm(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView model = new ModelAndView("AdmissionForm");
		model.addObject("headermsg",
				"STUDENT ADMISSION FORM FOR ENGINEERING COURSES");

		return model;
	}

	@RequestMapping(value = "/submitAdmissionForm1", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm1(
			@RequestParam(value = "studentName", defaultValue = "not provided") String name,
			@RequestParam("studentHobby") String hobby) {

		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("msg", "Details submitted by you:: Name: " + name
				+ ", Hobby: " + hobby);

		return model;
	}

	@RequestMapping(value = "/submitAdmissionForm2", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm2(
			@RequestParam Map<String, String> reqPar) {

		String name = reqPar.get("studentName");
		String hobby = reqPar.get("studentHobby");

		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("msg", "Details submitted by you:: Name: " + name
				+ ", Hobby: " + hobby);

		return model;
	}

	@RequestMapping(value = "/submitAdmissionForm12", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm12(
			@RequestParam Map<String, String> reqPar) {

		String name = reqPar.get("studentName");
		String hobby = reqPar.get("studentHobby");
		Student student1 = new Student(name, hobby);

		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("headermsg", "Details submitted by you:: Name: " + name
				+ ", Hobby: " + hobby);
		model.addObject("student1", student1);

		return model;
	}

	/**
	 * 11.cas @ModelAttribute Annotation 01 parameter level
	 * https://www.youtube.com/watch?v=stGq8lnEFlM http://www.gontu.org/spring
	 * -mvc-tutorials-11-understanding-modelattibute-annotation
	 * -01-using-method-argument/
	 * 
	 * 
	 */
	// same as "/submitAdmissionForm" but with model atribute
	@RequestMapping(value = "/submitAdmissionFormModel", method = RequestMethod.POST)
	public ModelAndView submitAdmissionFormModel(
			@ModelAttribute("student1") Student student1) {

		// String name = reqPar.get("studentName");
		// String hobby = reqPar.get("studentHobby");
		// Student student1 = new Student(name,hobby);

		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("headermsg", "Congratulations.");
		// model.addObject("headermsg","Details submitted by you:: Name: "+name+
		// ", Hobby: " + hobby);
		// model.addObject("student1", student1);

		return model;
	}

	/**
	 * 12.cas @ModelAttribute Annotation 02 method level
	 * https://www.youtube.com/watch?v=8V4ArtwNuwk
	 * http://www.gontu.org/spring-mvc
	 * -tutorials-12-understanding-modelattribute-
	 * annotation-02-using-method-level/
	 * 
	 * 
	 * putting @ModelAttribute at method level will add that model to all
	 * methods in this controller
	 */

	@ModelAttribute
	public void addingCommonObjects(Model model) {
		model.addAttribute("titleMsg", "Ovo je nasa organizacija !");

	}

	@RequestMapping(value = "/submitAdmissionFormMethod", method = RequestMethod.POST)
	public ModelAndView submitAdmissionFormMethod(
			@ModelAttribute("student1") Student student1) {

		// String name = reqPar.get("studentName");
		// String hobby = reqPar.get("studentHobby");
		// Student student1 = new Student(name,hobby);

		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("headermsg", "Congratulations!");
		// model.addObject("headermsg","Details submitted by you:: Name: "+name+
		// ", Hobby: " + hobby);
		// model.addObject("student1", student1);

		return model;
	}

	/**
	 * 13.cas Data Binding with Date, Collection (Arraylist)
	 * https://www.youtube.com/watch?v=ZEz_0V8EJpM
	 * http://www.gontu.org/spring-mvc
	 * -tutorials-13-data-binding-date-collection-arraylist-long-etc/
	 * 
	 * 
	 * putting @ModelAttribute at method level will add that model to all
	 * methods in this controller
	 * 
	 * @throws ParseException
	 */

	// without @ModelAttribute more code
	@RequestMapping(value = "/submitAdmissionFormNoModel", method = RequestMethod.POST)
	public ModelAndView submitAdmissionFormNoModel(
			@RequestParam("studentName") String studentName,
			@RequestParam("studentHobby") String studentHobby,
			@RequestParam("studentMobile") String studentMobile,
			@RequestParam("studentDOB") String DOB,
			@RequestParam("studentSkills") String[] studentSkills)
			throws ParseException {

		Long studentMobile1 = Long.valueOf(studentMobile).longValue();

		SimpleDateFormat format = new SimpleDateFormat("yyyy/mm/dd");
		Date studentDOB = format.parse(DOB);
		ArrayList<String> skillsSetList = new ArrayList<String>();
		for (int i = 0; i < studentSkills.length; i++) {
			skillsSetList.add(studentSkills[i]);
		}

		Student student = new Student(studentName, studentHobby,
				studentMobile1, studentDOB, skillsSetList);

		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("student1", student);
		model.addObject("headermsg", "Congratulations!");

		return model;
	}

	// with @ModelAttribute less code
	@RequestMapping(value = "/submitAdmissionFormModel13", method = RequestMethod.POST)
	public ModelAndView submitAdmissionFormModel13(
			@ModelAttribute("student1") Student student1) {

		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("headermsg", "Congratulations!");

		return model;
	}

	/**
	 * 14.cas BindingResult https://www.youtube.com/watch?v=zyJr_uc8haA
	 * http://www
	 * .gontu.org/spring-mvc-tutorials-14-data-binding-user-defined-type
	 * -bindingresult-concept/
	 * 
	 * 
	 */

	// with @ModelAttribute less code
	@RequestMapping(value = "/submitAdmissionForm14", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm14(
			@ModelAttribute("student1") Student student1, BindingResult result) {
		ModelAndView model;
		if (result.hasErrors()) {
			model = new ModelAndView("AdmissionForm");
			model.addObject("headermsg", "Try again!");
		} else {

			model = new ModelAndView("AdmissionSuccess");
			model.addObject("headermsg", "Congratulations!");
		}

		return model;
	}

	/**
	 * 15.cas @InitBinder annotation, WebDataBinder
	 * https://www.youtube.com/watch?v=URKgYKzXuVo
	 * http://www.gontu.org/spring-mvc
	 * -tutorials-15-initbinder-annotation-webdatabinder
	 * -customdateeditor-concept/
	 * 
	 */
	@RequestMapping(value = "/submitAdmissionForm", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(
			@Validated @ModelAttribute("student1") Student student1,
			BindingResult result) {
		ModelAndView model;
		if (result.hasErrors()) {
			model = new ModelAndView("AdmissionForm");
			model.addObject("headermsg", "Try again!");
		} else {

			model = new ModelAndView("AdmissionSuccess");
			model.addObject("headermsg", "Congratulations!");
		}

		return model;
	}

}
