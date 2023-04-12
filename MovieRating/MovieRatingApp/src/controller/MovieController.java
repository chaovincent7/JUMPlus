package controller;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import model.*;

public class MovieController {
	private List<Account> accList;
	private List<Movies> movieList;
	private int currentUserIndex = 0;

	
	public void addAccount(Account a) {
		accList.add(a);
	}
	
	public boolean checkCredentials(String accountEmail, String accountPassword) {
		for(int i =0;i< accList.size();i++) {
			if(accList.get(i).getEmail().equals(accountEmail)) {
				for(int j =0;j< accList.size();j++) {
					if(accList.get(j).getEmail().equals(accountEmail)) {
						if(accList.get(j).getPassword().equals(accountPassword)) {
							currentUserIndex = i;
							return true;
						}
				}
			}
		}
	}
		return false;
	}
	
	public boolean doesAccountEmailExist() {
		return false;
	}
	
	public boolean doesAccountPasswordExist() {
		return false;
	}
	
	public boolean isPasswordSame(String password, String cPassword) {
		 if(password.equals(cPassword)) {
			 return true;
		 }
		 return false;
	}
	
	
	public boolean isEmailValid(String email) {
		String emailPattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        if(email.matches(emailPattern)) {
        	return true;
        }
        return false;
		 
	}
	
	public boolean isPassValid(String pw) {
		boolean hasUpper = false;
		boolean hasLower = false;
		boolean hasSpecial = false;
		if(pw.length()<8) {
			return false;
		}
		
		for(int i =0;i<pw.length();i++) {
			if(Character.isUpperCase(pw.charAt(i))){
				hasUpper=true;
			}
			if(Character.isLowerCase(pw.charAt(i))){
				hasLower=true;
			}
		}
		
		Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
	    Matcher m = special.matcher(pw);
	    if(m.find()) {
	    	hasSpecial = true;
	    }
	    
	    if(hasUpper && hasLower && hasSpecial) {
	    	return true;
	    }
	    return false;
	}
}