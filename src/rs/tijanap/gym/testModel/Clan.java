package rs.tijanap.gym.testModel;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;

public class Clan {

	int id;
	String ime;
	String prezime;
	String email;
	int status; // 0 admin 1 zaposleni
	@Past
	private Date clanDOB;
	private ArrayList<String> clanSkills;

	@Min(60000000)
	@Max(699999999)
	private Long clanMobile;

	@Min(011000000)
	@Max(119999999)
	private Long clanFixni;

	String user;
	String password;

	public Clan() {
		super();
	}

	public Clan(int id, String ime, String prezime, String email, int status,
			Long clanMobile, Long clanFixni, String user, String password) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.email = email;
		this.status = status;
		this.clanMobile = clanMobile;
		this.clanFixni = clanFixni;
		this.user = user;
		this.password = password;
	}

	public Clan(int id, String ime, String prezime, String email, int status,
			Date clanDOB, ArrayList<String> clanSkills, Long clanMobile,
			Long clanFixni, String user, String password) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.email = email;
		this.status = status;
		this.clanDOB = clanDOB;
		this.clanSkills = clanSkills;
		this.clanMobile = clanMobile;
		this.clanFixni = clanFixni;
		this.user = user;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Long getClanMobile() {
		return clanMobile;
	}

	public void setClanMobile(Long clanMobile) {
		this.clanMobile = clanMobile;
	}

	public Long getClanFixni() {
		return clanFixni;
	}

	public void setClanFixni(Long clanFixni) {
		this.clanFixni = clanFixni;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getClanDOB() {
		return clanDOB;
	}

	public void setClanDOB(Date clanDOB) {
		this.clanDOB = clanDOB;
	}

	public ArrayList<String> getClanSkills() {
		return clanSkills;
	}

	public void setClanSkills(ArrayList<String> clanSkills) {
		this.clanSkills = clanSkills;
	}

	@Override
	public String toString() {
		return "Clan [user=" + user + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clan other = (Clan) obj;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

}
