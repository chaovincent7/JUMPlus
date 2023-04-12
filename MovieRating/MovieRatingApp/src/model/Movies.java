package model;

public class Movies {
	private String movieName; 
	private double avgRatings;
	private int numOfRatings;
	
	public Movies() {
		
	}
	
	public Movies(String movieName, double avgRatings, int numOfRatings) {
		super();
		this.movieName = movieName;
		this.avgRatings = avgRatings;
		this.numOfRatings = numOfRatings;
	}
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	public double getAvgRatings() {
		return avgRatings;
	}

	public void setAvgRatings(double avgRatings) {
		this.avgRatings = avgRatings;
	}

	public int getNumOfRatings() {
		return numOfRatings;
	}
	public void setNumOfRatings(int numOfRatings) {
		this.numOfRatings = numOfRatings;
	}
}
