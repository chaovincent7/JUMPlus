package model;

public class Account {
	private String email;
	private String password;
	private int reviews;
	
	public Account() {
		
	}
	
	public Account(String email, String password, int reviews) {
		super();
		this.email = email;
		this.password = password;
		this.reviews = reviews;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getReviews() {
		return reviews;
	}
	public void setReviews(int reviews) {
		this.reviews = reviews;
	}

}
