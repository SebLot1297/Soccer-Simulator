import java.util.ArrayList;

public class Team {

private String teamName;
private int fanbaseStrength; // out of 10
private boolean homefield;
private int morale; //out of 10
private Tactic tactic;
public int playerCount; // capped at 11 to not work with substitutions just yet
public ArrayList<Player> teamPlayers; 
public boolean inPossesion;
public Team(String name, int fS, boolean home, int m, Tactic t, ArrayList<Player> tP,boolean inP){
	
	setTeamName(name);
	setFanbaseStrength(fS);
	setHomefield(home);
	setMorale(m);
	setTactic(t);
	playerCount = 11;
	teamPlayers = tP;
	inPossesion = inP;
}
public String getTeamName() {
	return teamName;
}
public void setTeamName(String teamName) {
	this.teamName = teamName;
}
public int getFanbaseStrength() {
	return fanbaseStrength;
}
public void setFanbaseStrength(int fanbaseStrength) {
	this.fanbaseStrength = fanbaseStrength;
}
public boolean isHomefield() {
	return homefield;
}
public void setHomefield(boolean homefield) {
	this.homefield = homefield;
}
public int getMorale() {
	return morale;
}
public void setMorale(int morale) {
	this.morale = morale;
}
public Tactic getTactic() {
	return tactic;
}
public void setTactic(Tactic tactic) {
	this.tactic = tactic;
}


}
