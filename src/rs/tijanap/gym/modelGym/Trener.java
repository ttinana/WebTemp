/**
 * 
 */
package rs.tijanap.gym.modelGym;

/**
 * @author tijana.pavicic
 *
 */
public class Trener {
	int IdTrener;
	String JMBG;
	String ime;
	String prezime;
	int tip; /* 1 admin, 2 zaposleni*/
	
	public Trener() {
		super();
	}

	public Trener(int idTrener, String jMBG, String ime, String prezime, int tip) {
		super();
		IdTrener = idTrener;
		JMBG = jMBG;
		this.ime = ime;
		this.prezime = prezime;
		this.tip = tip;
	}
	

	public int getIdTrener() {
		return IdTrener;
	}

	public void setIdTrener(int idTrener) {
		IdTrener = idTrener;
	}

	public String getJMBG() {
		return JMBG;
	}

	public void setJMBG(String jMBG) {
		JMBG = jMBG;
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

	public int getTip() {
		return tip;
	}

	public void setTip(int tip) {
		this.tip = tip;
	}

	@Override
	public String toString() {
		return "Trener [ime=" + ime + ", prezime=" + prezime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + IdTrener;
		result = prime * result + ((JMBG == null) ? 0 : JMBG.hashCode());
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
		Trener other = (Trener) obj;
		if (IdTrener != other.IdTrener)
			return false;
		if (JMBG == null) {
			if (other.JMBG != null)
				return false;
		} else if (!JMBG.equals(other.JMBG))
			return false;
		return true;
	}



}
