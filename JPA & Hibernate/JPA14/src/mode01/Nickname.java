package mode01;

import javax.persistence.Embeddable;

@Embeddable
public class Nickname {

	
	private String nickname;
	private String nicksurname;
	
	
	public Nickname() {
		super();
	}


	public Nickname(String nickname, String nicksurname) {
		super();
		this.nickname = nickname;
		this.nicksurname = nicksurname;
	}


	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	public String getNicksurname() {
		return nicksurname;
	}


	public void setNicksurname(String nicksurname) {
		this.nicksurname = nicksurname;
	}
	
	
}
