
//Passes from players will be to other players only for now. no through balls for now
public class Player {
	private String name;
	private int mentalStrength; // out of 10
	private int fitnessLevel; // out of 100
	//private String role; -> fuck the player role. will not be in first version
	private int[] ratings = new int[7];
	/*in the order of -> Pace, shooting, passing, dribbling, defending, first touch, and jumping
	 * all between 1-99
	 */
	private String position; // ex: "lb" "rcb" "st",  etc include left and right ex: rcb = right center back
 	private double xCord;
	private double yCord;
	public Player(String n,int mS, int fL, int[] r, String pos) {
		
		setMentalStength(mS);
		setFitnessLevel(fL);
		setRatings(r);
		setPosition(pos);
		
	}
	
	public void setName(String n){
		name = n;
	}
	public String getName(){
		return name;
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
	
	public String toString(){
		return "";
	}
	

}
