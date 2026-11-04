
//Passes from players will be to other players only for now. no through balls for now
public class Player {
	private int mentalStrength; // out of 10
	private int fitnessLevel; // out of 100
	//private String role; -> fuck the player role. will not be in first version
	private int[] ratings = new int[7];
	/*in the order of -> Pace, shooting, passing, dribbling, defending, first touch, and jumping
	 * all between 1-99
	 */
	private String position; // ex: "lb" "cb" "st", etc
	private double xCord;
	private double yCord;
	public Player(int mS, int fL, int[] r, String pos, double x, double y) {
		setMentalStength(mS);
		setFitnessLevel(fL);
		setRatings(r);
		setPosition(pos);
		setxCord(x);
		setyCord(y);
		
	}
	
	
	public void setMentalStength(int mS) {
		mentalStrength = mS;
	}
	
	public int getMentalStrength() {
		return mentalStrength;
	}
	
	public void setFitnessLevel(int fL) {
		fitnessLevel = fL;
	}
	
	public int getFitnessLevel() {
		return fitnessLevel;
	}
	
	public int[] getRatings() {
		return ratings;
	}
	public void setRatings(int[] ratings) {
		this.ratings = ratings;
	}

	public double getxCord() {
		return xCord;
	}


	public void setxCord(double xCord) {
		this.xCord = xCord;
	}


	public double getyCord() {
		return yCord;
	}


	public void setyCord(double yCord) {
		this.yCord = yCord;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}
	
	
	

}
