

//length(x axis) runs from -50 to 50
// width(y axis) runs from -35 to 35
//center circle is located at 0,0


public class SoccerField {
	private SoccerGoal negativeCordGoal;
	private SoccerGoal positiveCordGoal;
	private Team away;
	private Team home;
	private SoccerBall ball;
	private double minX = -50;
	private double maxX = 50;
	private double minY = -35;
	private double maxY = 35;
public SoccerField(Team a, Team h, SoccerBall b) {
	away = a;
	home = h;
	this.setBall(b);
	placeTeam(away);
	placeTeam(home);
	setNegativeCordGoal();
	setPositiveCordGoal();
}
public SoccerGoal getNegativeCordGoal() {
	return negativeCordGoal;
}
public void setNegativeCordGoal() {
	this.negativeCordGoal = new SoccerGoal(-50, 0); 
}
public SoccerGoal getPositiveCordGoal() {
	return positiveCordGoal;
}
public void setPositiveCordGoal() {
	this.positiveCordGoal = new SoccerGoal(50, 0);
}

public SoccerBall getBall() {
	return ball;
}
public void setBall(SoccerBall ball) {
	this.ball = ball;
}
public boolean isInBounds(SoccerBall ball) {
	if((ball.getBallX()>=minX && ball.getBallX()<=maxX) &&
			(ball.getBallY()>=minY && ball.getBallY()<=maxY)) {
		return true;
	}
	
	return false;
}

public boolean playerInBounds(Player player) {
	if((player.getxCord()>=minX && player.getxCord()<=maxX) &&
			(player.getyCord()>=minY && player.getyCord()<=maxY)) {
		return true;
	}
	return false;
}


public void placeTeam(Team team) {
	String formation = team.getTactic().getFormation();
	boolean isHome = team.isHomefield();
	for(int i = 0; i<team.teamPlayers.size(); i++) {
		
		
	}
}

}
