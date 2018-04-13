package com.schoolcloudy.web.mvc.controllers;

import java.io.IOException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.schoolcloudy.model.entities.Administrator;
import com.schoolcloudy.model.entities.Student;
import com.schoolcloudy.model.shared.entities.Contact;
import com.schoolcloudy.model.shared.entities.Gender;
import com.schoolcloudy.model.shared.entities.User;
import com.schoolcloudy.service.administrative.AdministrativeService;



@Controller
public class HomeController {

	@Autowired
	private AdministrativeService administrativeService;
	private static final String ACCESS_KEY =  null;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home(Model model) throws UnirestException, IOException {
		//User user = this.administrativeService.addNewAdministrator(this.addNewAdministrator());
		//this.administrativeService.addNewstudent(this.addNewStudent());
		//User user = administrativeService.getUser("Davis.Ropols", "");
		//System.out.println(user);
		
		HttpResponse<String> response = Unirest.post("https://regosnet.eu.auth0.com/oauth/token")
				  .header("content-type", "application/json")
				  .body("{\"grant_type\":\"client_credentials\",\"client_id\": \"3jkUk3iw7PVsBVJHuduat9JUAv5xnLao\",\"client_secret\": \"SwAfciApBhIdG_LBOEG-FPAX6AUBdTGhnAiBpm7e_PgAi69un3NcGZUOl3Mf3lIL\",\"audience\": \"https://regosnet.eu.auth0.com/api/v2/\"}")
				  .asString();
		ObjectMapper mapper = new ObjectMapper();

		Auth0Token token = mapper.readValue(response.getBody(), Auth0Token.class);
		System.out.println(token.getScope());
		HttpResponse<String> clients = Unirest.get("https://regosnet.eu.auth0.com/api/v2/users")
				  .header("content-type", "application/json")
				  .header("authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6IlFUa3lPREl4UTBORVJVRTNNekZHT0RkRk1VRXpNMEkyUXpGQlJqVkZRek0wUmpRMlJEaEZOZyJ9.eyJpc3MiOiJodHRwczovL3JlZ29zbmV0LmV1LmF1dGgwLmNvbS8iLCJzdWIiOiI2eTBiN0QzYTNYRGdsSTQyeHYzeEI1TThvdXNOOTlIdkBjbGllbnRzIiwiYXVkIjoiaHR0cHM6Ly9yZWdvc25ldC5ldS5hdXRoMC5jb20vYXBpL3YyLyIsImlhdCI6MTUyMzYyMzA4NCwiZXhwIjoxNTIzNzA5NDg0LCJhenAiOiI2eTBiN0QzYTNYRGdsSTQyeHYzeEI1TThvdXNOOTlIdiIsInNjb3BlIjoicmVhZDpjbGllbnRfZ3JhbnRzIGNyZWF0ZTpjbGllbnRfZ3JhbnRzIGRlbGV0ZTpjbGllbnRfZ3JhbnRzIHVwZGF0ZTpjbGllbnRfZ3JhbnRzIHJlYWQ6dXNlcnMgdXBkYXRlOnVzZXJzIGRlbGV0ZTp1c2VycyBjcmVhdGU6dXNlcnMgcmVhZDp1c2Vyc19hcHBfbWV0YWRhdGEgdXBkYXRlOnVzZXJzX2FwcF9tZXRhZGF0YSBkZWxldGU6dXNlcnNfYXBwX21ldGFkYXRhIGNyZWF0ZTp1c2Vyc19hcHBfbWV0YWRhdGEgY3JlYXRlOnVzZXJfdGlja2V0cyByZWFkOmNsaWVudHMgdXBkYXRlOmNsaWVudHMgZGVsZXRlOmNsaWVudHMgY3JlYXRlOmNsaWVudHMgcmVhZDpjbGllbnRfa2V5cyB1cGRhdGU6Y2xpZW50X2tleXMgZGVsZXRlOmNsaWVudF9rZXlzIGNyZWF0ZTpjbGllbnRfa2V5cyByZWFkOmNvbm5lY3Rpb25zIHVwZGF0ZTpjb25uZWN0aW9ucyBkZWxldGU6Y29ubmVjdGlvbnMgY3JlYXRlOmNvbm5lY3Rpb25zIHJlYWQ6cmVzb3VyY2Vfc2VydmVycyB1cGRhdGU6cmVzb3VyY2Vfc2VydmVycyBkZWxldGU6cmVzb3VyY2Vfc2VydmVycyBjcmVhdGU6cmVzb3VyY2Vfc2VydmVycyByZWFkOmRldmljZV9jcmVkZW50aWFscyB1cGRhdGU6ZGV2aWNlX2NyZWRlbnRpYWxzIGRlbGV0ZTpkZXZpY2VfY3JlZGVudGlhbHMgY3JlYXRlOmRldmljZV9jcmVkZW50aWFscyByZWFkOnJ1bGVzIHVwZGF0ZTpydWxlcyBkZWxldGU6cnVsZXMgY3JlYXRlOnJ1bGVzIHJlYWQ6cnVsZXNfY29uZmlncyB1cGRhdGU6cnVsZXNfY29uZmlncyBkZWxldGU6cnVsZXNfY29uZmlncyByZWFkOmVtYWlsX3Byb3ZpZGVyIHVwZGF0ZTplbWFpbF9wcm92aWRlciBkZWxldGU6ZW1haWxfcHJvdmlkZXIgY3JlYXRlOmVtYWlsX3Byb3ZpZGVyIGJsYWNrbGlzdDp0b2tlbnMgcmVhZDpzdGF0cyByZWFkOnRlbmFudF9zZXR0aW5ncyB1cGRhdGU6dGVuYW50X3NldHRpbmdzIHJlYWQ6bG9ncyByZWFkOnNoaWVsZHMgY3JlYXRlOnNoaWVsZHMgZGVsZXRlOnNoaWVsZHMgdXBkYXRlOnRyaWdnZXJzIHJlYWQ6dHJpZ2dlcnMgcmVhZDpncmFudHMgZGVsZXRlOmdyYW50cyByZWFkOmd1YXJkaWFuX2ZhY3RvcnMgdXBkYXRlOmd1YXJkaWFuX2ZhY3RvcnMgcmVhZDpndWFyZGlhbl9lbnJvbGxtZW50cyBkZWxldGU6Z3VhcmRpYW5fZW5yb2xsbWVudHMgY3JlYXRlOmd1YXJkaWFuX2Vucm9sbG1lbnRfdGlja2V0cyByZWFkOnVzZXJfaWRwX3Rva2VucyBjcmVhdGU6cGFzc3dvcmRzX2NoZWNraW5nX2pvYiBkZWxldGU6cGFzc3dvcmRzX2NoZWNraW5nX2pvYiByZWFkOmN1c3RvbV9kb21haW5zIGRlbGV0ZTpjdXN0b21fZG9tYWlucyBjcmVhdGU6Y3VzdG9tX2RvbWFpbnMgcmVhZDplbWFpbF90ZW1wbGF0ZXMgY3JlYXRlOmVtYWlsX3RlbXBsYXRlcyB1cGRhdGU6ZW1haWxfdGVtcGxhdGVzIiwiZ3R5IjoiY2xpZW50LWNyZWRlbnRpYWxzIn0.PmLHUhxG3URTzMu_PaLgPyLcT1xl9Ibxmdwe2xnubr0RMc4aXJjNXH9Pea9WCF8kkSVBiWNhuSnuO2rRs8JJj_7DcMasBbQy-AZqVKQ0WA0tJcqg2g3w09VQQPMLtyCdTtV5Eguft4i64NXiGbqUnbjUvafavtB1lLSjKaX1LFqmtDitNQSUZYK5xzYTpQ-2LFaQ4s5bdqv0PsMl917EDJlyRJuWNDypp1ijRxvTcGLjSdQhIefiswZTCNCrNPkR8vLKZPIMkouxD8HLYnebpH27ZdVsGOcIyGE-WCiGAEXlcHBnVemJrRSynW1H__jlSqh2w-wJDdfWfYgpb9hIlA")
				  .asString();
		System.out.println(clients.getBody());
		
		HttpResponse<String> addUser = Unirest.post("https://regosnet.eu.auth0.com/api/v2/users")
				  .header("content-type", "application/json")
				  .header("authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6IlFUa3lPREl4UTBORVJVRTNNekZHT0RkRk1VRXpNMEkyUXpGQlJqVkZRek0wUmpRMlJEaEZOZyJ9.eyJpc3MiOiJodHRwczovL3JlZ29zbmV0LmV1LmF1dGgwLmNvbS8iLCJzdWIiOiI2eTBiN0QzYTNYRGdsSTQyeHYzeEI1TThvdXNOOTlIdkBjbGllbnRzIiwiYXVkIjoiaHR0cHM6Ly9yZWdvc25ldC5ldS5hdXRoMC5jb20vYXBpL3YyLyIsImlhdCI6MTUyMzYyMzA4NCwiZXhwIjoxNTIzNzA5NDg0LCJhenAiOiI2eTBiN0QzYTNYRGdsSTQyeHYzeEI1TThvdXNOOTlIdiIsInNjb3BlIjoicmVhZDpjbGllbnRfZ3JhbnRzIGNyZWF0ZTpjbGllbnRfZ3JhbnRzIGRlbGV0ZTpjbGllbnRfZ3JhbnRzIHVwZGF0ZTpjbGllbnRfZ3JhbnRzIHJlYWQ6dXNlcnMgdXBkYXRlOnVzZXJzIGRlbGV0ZTp1c2VycyBjcmVhdGU6dXNlcnMgcmVhZDp1c2Vyc19hcHBfbWV0YWRhdGEgdXBkYXRlOnVzZXJzX2FwcF9tZXRhZGF0YSBkZWxldGU6dXNlcnNfYXBwX21ldGFkYXRhIGNyZWF0ZTp1c2Vyc19hcHBfbWV0YWRhdGEgY3JlYXRlOnVzZXJfdGlja2V0cyByZWFkOmNsaWVudHMgdXBkYXRlOmNsaWVudHMgZGVsZXRlOmNsaWVudHMgY3JlYXRlOmNsaWVudHMgcmVhZDpjbGllbnRfa2V5cyB1cGRhdGU6Y2xpZW50X2tleXMgZGVsZXRlOmNsaWVudF9rZXlzIGNyZWF0ZTpjbGllbnRfa2V5cyByZWFkOmNvbm5lY3Rpb25zIHVwZGF0ZTpjb25uZWN0aW9ucyBkZWxldGU6Y29ubmVjdGlvbnMgY3JlYXRlOmNvbm5lY3Rpb25zIHJlYWQ6cmVzb3VyY2Vfc2VydmVycyB1cGRhdGU6cmVzb3VyY2Vfc2VydmVycyBkZWxldGU6cmVzb3VyY2Vfc2VydmVycyBjcmVhdGU6cmVzb3VyY2Vfc2VydmVycyByZWFkOmRldmljZV9jcmVkZW50aWFscyB1cGRhdGU6ZGV2aWNlX2NyZWRlbnRpYWxzIGRlbGV0ZTpkZXZpY2VfY3JlZGVudGlhbHMgY3JlYXRlOmRldmljZV9jcmVkZW50aWFscyByZWFkOnJ1bGVzIHVwZGF0ZTpydWxlcyBkZWxldGU6cnVsZXMgY3JlYXRlOnJ1bGVzIHJlYWQ6cnVsZXNfY29uZmlncyB1cGRhdGU6cnVsZXNfY29uZmlncyBkZWxldGU6cnVsZXNfY29uZmlncyByZWFkOmVtYWlsX3Byb3ZpZGVyIHVwZGF0ZTplbWFpbF9wcm92aWRlciBkZWxldGU6ZW1haWxfcHJvdmlkZXIgY3JlYXRlOmVtYWlsX3Byb3ZpZGVyIGJsYWNrbGlzdDp0b2tlbnMgcmVhZDpzdGF0cyByZWFkOnRlbmFudF9zZXR0aW5ncyB1cGRhdGU6dGVuYW50X3NldHRpbmdzIHJlYWQ6bG9ncyByZWFkOnNoaWVsZHMgY3JlYXRlOnNoaWVsZHMgZGVsZXRlOnNoaWVsZHMgdXBkYXRlOnRyaWdnZXJzIHJlYWQ6dHJpZ2dlcnMgcmVhZDpncmFudHMgZGVsZXRlOmdyYW50cyByZWFkOmd1YXJkaWFuX2ZhY3RvcnMgdXBkYXRlOmd1YXJkaWFuX2ZhY3RvcnMgcmVhZDpndWFyZGlhbl9lbnJvbGxtZW50cyBkZWxldGU6Z3VhcmRpYW5fZW5yb2xsbWVudHMgY3JlYXRlOmd1YXJkaWFuX2Vucm9sbG1lbnRfdGlja2V0cyByZWFkOnVzZXJfaWRwX3Rva2VucyBjcmVhdGU6cGFzc3dvcmRzX2NoZWNraW5nX2pvYiBkZWxldGU6cGFzc3dvcmRzX2NoZWNraW5nX2pvYiByZWFkOmN1c3RvbV9kb21haW5zIGRlbGV0ZTpjdXN0b21fZG9tYWlucyBjcmVhdGU6Y3VzdG9tX2RvbWFpbnMgcmVhZDplbWFpbF90ZW1wbGF0ZXMgY3JlYXRlOmVtYWlsX3RlbXBsYXRlcyB1cGRhdGU6ZW1haWxfdGVtcGxhdGVzIiwiZ3R5IjoiY2xpZW50LWNyZWRlbnRpYWxzIn0.PmLHUhxG3URTzMu_PaLgPyLcT1xl9Ibxmdwe2xnubr0RMc4aXJjNXH9Pea9WCF8kkSVBiWNhuSnuO2rRs8JJj_7DcMasBbQy-AZqVKQ0WA0tJcqg2g3w09VQQPMLtyCdTtV5Eguft4i64NXiGbqUnbjUvafavtB1lLSjKaX1LFqmtDitNQSUZYK5xzYTpQ-2LFaQ4s5bdqv0PsMl917EDJlyRJuWNDypp1ijRxvTcGLjSdQhIefiswZTCNCrNPkR8vLKZPIMkouxD8HLYnebpH27ZdVsGOcIyGE-WCiGAEXlcHBnVemJrRSynW1H__jlSqh2w-wJDdfWfYgpb9hIlA")
				  .body("{\"email\": \"ihechukwudere@gmail.com\", \"username\": \"Tochukwu\", \"password\": \"Faith4lifeamen\", \"connection\": \"Username-Password-Authentication\", \"user_metadata\": {\"hobby\": \"surfing\", \"id\": \"AE001\", \"name\": \"Tochukwu\"}, \"app_metadata\": {\"plan\": \"full\"}}")
				  .asString();
		System.out.println(addUser.getBody());
		return "home";
	}
	
	/*
	 * School school = new School();
		school.setExternalId("A10293");
		school.setSchoolName("Ahuru University");
		school.setSchoolFaculties(new HashSet<>());
		
		Faculty faculty = new Faculty();
		faculty.setExternalId("AEE29308");
		faculty.setSchool(school);
		faculty.setFacultyName("Faculty Of Electrical Engineering");
		school.getSchoolFaculties().add(faculty);
		
		Faculty faculty2 = new Faculty();
		faculty2.setExternalId("AME80392");
		faculty2.setSchool(school);
		faculty2.setFacultyName("Faculty Of Mechanical Engineering");
		school.getSchoolFaculties().add(faculty2);
		
		Faculty faculty3 = new Faculty();
		faculty3.setExternalId("ACS80392");
		faculty3.setSchool(school);
		faculty3.setFacultyName("Faculty Of Software Engineering");
		school.getSchoolFaculties().add(faculty3);
		
		facultyRepository.save(faculty);
		
		
		School school = new School();
		school.setExternalId("A10293");
		school.setSchoolName("MAdonna University");
		school.setSchoolFaculties(new HashSet<>());
		
		Faculty faculty = new Faculty();
		faculty.setExternalId("AEE29308");
		faculty.setSchool(school);
		faculty.setFacultyName("Faculty Of Electrical Engineering");
		school.getSchoolFaculties().add(faculty);
		
		schoolRepository.save(school);
		
		
		schoolRepository.getSchool().forEach(x -> System.out.println(x.getInternalId() + " " + " " + x.getExternalId() + " " +x.getSchoolName()));
		schoolRepository.getFaculties().forEach(x -> System.out.println(x.getInternalId() + " " + " " + x.getExternalId() + " " +x.getFacultyName()));
	 */
	
	public Administrator addNewAdministrator() {
		User administrator = new Administrator();
		administrator.setFirstName("Chima");
		administrator.setLastName("Okonkon");
		administrator.setContact(new Contact()); // set by the ContactRepository. Takes in the current object as argument and return a contact object
		administrator.setGender(Gender.Male);
		administrator.setStartDate(new Date()); // use a function that takes in a date in string format and return a date object
		administrator.setEndDate(new Date());
		administrator.setLanguage("English");
		administrator.setStatus("Administrator");
		administrator.setDateOfBirth(new Date());
		return (Administrator) administrator;
	}
	
	public Student addNewStudent() {
		User student = new Student();
		student.setFirstName("Adanna");
		student.setLastName("Vincent");
		student.setMiddleName("Eucaria");
		student.setGender(Gender.Female);
		student.setLanguage("english");
		student.setStatus("Student");
		student.setContact(new Contact());
		student.getContact().setCity("United Kingdom");
		student.getContact().setEmail(student.getFirstName()+ "." +student.getLastName());
		student.getContact().setHouseNumber(213);
		student.getContact().setStreet("Bridge Street");
		student.getContact().setState("London");
		student.getContact().setTelephone("+032345453634");
		student.setDateOfBirth(new Date());
		student.setStartDate(new Date());
		student.setEndDate(new Date());
		return (Student) student;
	}
}
