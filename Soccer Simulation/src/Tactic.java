
public class Tactic {
	private String formation; // ex input: 4-3-3
	private String styleOfPlay;//types(limit of 3 for now)->counter attack,park the bus,tiki taka 
	private String playerInstructions; //delay for now -> not included in first version just yet
	public Tactic(String f, String sop) {
		setFormation(f);
		setStyleOfPlay(sop);
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

	public String getPlayerInstructions() {
		return playerInstructions;
	}

	public void setPlayerInstructions(String playerInstructions) {
		this.playerInstructions = playerInstructions;
	}
}
