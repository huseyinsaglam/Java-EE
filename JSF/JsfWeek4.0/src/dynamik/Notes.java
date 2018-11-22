package dynamik;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Notes {
	
	private String name;
	private String password;
        //getters and setters

	private int counter = 0;
	private boolean locked = false; // kilit kapali yap

	public String login() {
		// Do some processing
		if (name.equals("Levent") && password.equals("java")) {
			counter = 0;
			locked = false;
			return "success"; // success=basarili
		}
		counter++;
		if (locked == true) {
			return "locked"; // locked = kilitli
		}
		return "failure"; // failure =basarisiz
	}
	
	public String checkCounter() {

		if (counter > 3) {
			locked = true; // kilit acik yap
			return "locked"; // kilitli
		} else
			return "retry"; // yeniden dene
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public boolean islocked() {
		return locked;
	}

	public void setlocked(boolean locked) {
		this.locked = locked;
	}

	
}


