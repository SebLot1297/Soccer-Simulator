
public class Tactic {
	private String formation; // ex input: 433 or 4231
	private int defenders;
	private int midfielders;
	private int attackers;
	private String styleOfPlay;//types(limit of 3 for now)->counter attack,park the bus,tiki taka 

	private String press; //high, mid, low
	//private String playerInstructions; //delay for now -> not included in first version just yet
	public Tactic(String f, String sop, String p) {
		setFormation(f);
		setStyleOfPlay(sop);
		setPress(p);
	}

	public String getFormation() {
		return formation;
	}

	public void setFormation(String formation) {
		this.formation = formation;
	}

	public String getStyleOfPlay() {
		return styleOfPlay;
	}

	public void setStyleOfPlay(String styleOfPlay) {
		this.styleOfPlay = styleOfPlay;
	}

	public String getPress() {
		return press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public void setDefendersMidsAttackers(String formation){
		int length = formation.length();
		this.defenders = Integer.parseInt(formation.substring(0,1));
		for(int i = 1; i<length;i++){ 
			if(length>3){
				if(i >2) this.attackers = Integer.parseInt(formation.substring(i,i+1));
				else{
					this.midfielders += Integer.parseInt(formation.substring(i,i+1));
				}
			}
			else{
				if(i == 1) this.midfielders = Integer.parseInt(formation.substring(i,i+1));

				else if(i == 2) this.attackers = Integer.parseInt(formation.substring(i,i+1));
			}

	
	}

	
}
public int getDefenders(){
	return defenders;
}

public int getMidfielders(){
	return midfielders;

}

public int getAttackers(){
	return attackers;
}
}
