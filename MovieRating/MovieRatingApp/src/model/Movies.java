package model;

public class Movies {
	private String movieName; 
	private double ratings;
	private int numOfRatings;
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public double getRatings() {
		return ratings;
	}
	public void setRatings(double ratings) {
		this.ratings = ratings;
	}
	public int getNumOfRatings() {
		return numOfRatings;
	}
	public void setNumOfRatings(int numOfRatings) {
		this.numOfRatings = numOfRatings;
	}
}
