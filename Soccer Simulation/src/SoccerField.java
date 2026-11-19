

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
	Tactic tactic = team.getTactic();
	String formation = tactic.getFormation();
	boolean isHome = team.isHomefield(); 
	boolean startsWithBall = team.inPossesion;
	int sideOffset = 1;
	if(isHome) sideOffset = -1;
	double xOffset = 8.33*sideOffset;//can + or -  EX: cm would be in center of grid square, 
	// dm would be center+xoffset and cam would be center - xoffset

	double yOffset = 5*sideOffset; // difference between center of one subzone and next subzone in y axis 
	// distance between centers = yoffset*2
	tactic.setDefendersMidsAttackers(formation);
	int defendersCount = tactic.getDefenders();
	int midfieldersCount = tactic.getMidfielders();
	//int attackersCount = tactic.getAttackers();

// differences are "attacking", defending, left, right, or a, d, l, r. ex: cdm -> defense offset and no side offset
	
		double defenseXGridCenter = 41.67*sideOffset;
		double midfieldXGridCenter = 25.0033*sideOffset;
		double attackXGridCenter = 8.3367*sideOffset;

		double yGridCenter = 0 ; //they all align so it is same value of 0 for att, def, and mid

		team.teamPlayers.get(0).setyCord(yGridCenter);
		team.teamPlayers.get(0).setxCord(50*sideOffset);
		
		for(int i = 1; i<team.teamPlayers.size(); i++) { //gk is always 0 in teamplayers list
		if(i<=defendersCount){
			Player p = team.teamPlayers.get(i);
			p.setxCord(defenseXGridCenter);
			if(p.getPosition().contains("w")) p.setxCord(p.getxCord()-xOffset);

			p.setyCord(yGridCenter);
			if(p.getPosition().contains("l")){ p.setyCord(p.getyCord()-(yOffset*6));
				if(p.getPosition().contains("c")) p.setyCord(p.getyCord()+(yOffset*4));
			}

			if(p.getPosition().contains("r")){ p.setyCord(p.getyCord()+(yOffset*6));
				if(p.getPosition().contains("c")) p.setyCord(p.getyCord()-(yOffset*4));
			}



		}
		else if(i>defendersCount && i<=midfieldersCount+defendersCount){
			Player p = team.teamPlayers.get(i);
			p.setxCord(midfieldXGridCenter);
			if(p.getPosition().contains("a") || p.getPosition().contains("f")) p.setxCord(p.getxCord()-xOffset);
			else if(p.getPosition().contains("d")) p.setxCord(p.getxCord()+xOffset);

			p.setyCord(yGridCenter);
			if(p.getPosition().contains("l")){ p.setyCord(p.getyCord()-(yOffset*6));
				if(p.getPosition().contains("c")) p.setyCord(p.getyCord()+(yOffset*4));
			}

			if(p.getPosition().contains("r")){ p.setyCord(p.getyCord()+(yOffset*6));
				if(p.getPosition().contains("c")) p.setyCord(p.getyCord()-(yOffset*4));
			}

		}

		else if(i>midfieldersCount+defendersCount){
			Player p = team.teamPlayers.get(i);
			p.setxCord(attackXGridCenter);

			p.setyCord(yGridCenter);
			if(p.getPosition().contains("l")){ p.setyCord(p.getyCord()-(yOffset*4));
				if(p.getPosition().contains("s")) p.setyCord(p.getyCord()+(yOffset*2));
			}

			if(p.getPosition().contains("r")){ p.setyCord(p.getyCord()+(yOffset*4));
				if(p.getPosition().contains("s")) p.setyCord(p.getyCord()-(yOffset*2));
			}
			

			if(startsWithBall && p.getPosition().contains("s") && !spaceIsFilled(i,0, 0, team)){
				p.setxCord(0);
				p.setyCord(0);
	} 
		}
		if(isInCircle(team.teamPlayers.get(i).getxCord(),team.teamPlayers.get(i).getyCord()) && !startsWithBall){
			double x = team.teamPlayers.get(i).getxCord();
			double y = team.teamPlayers.get(i).getyCord();
			team.teamPlayers.get(i).setxCord(findClosestXFromHalfCircle(x, y));
			team.teamPlayers.get(i).setyCord(findClosestYFromHalfCircle(x,y));
		}
		
	}
}


//helper functions
public boolean isInCircle(double x, double y){
	
	//dont have to account for semicircle because zones (att, def, mid) are respective to its own half

	if(findDistance(x,y)<9.15){
		return true;
	}
	return false;
}


public double findDistance(double x, double y){
	
	double distanceFromCenter = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	return distanceFromCenter;
}

public double findClosestXFromHalfCircle(double x, double y){
	
	double radius = 9.15;
	double distance = findDistance(x, y);

	double closestX = (radius/distance) * (x);
	return closestX;

}

public double findClosestYFromHalfCircle(double x, double y){
	double radius = 9.15;
	double distance = findDistance(x, y);

	double closestY = (radius/distance) * (y );
	return closestY;

}

public boolean spaceIsFilled(int index,double x, double y, Team team){
 
	for(int i = index; i<team.teamPlayers.size();i++){
		if(team.teamPlayers.get(i).getxCord() == x && team.teamPlayers.get(i).getyCord() == y)
			return true;
	}
	return false;
}

//test function
public void printPlayerPositions(Team team){
	System.out.println("Home? "+team.isHomefield() );
	System.out.println("Starts with ball? "+ team.inPossesion);
	System.out.println();
	for(int i =0; i<team.teamPlayers.size();i++){
		System.out.println(team.teamPlayers.get(i).getPosition()+": ("+team.teamPlayers.get(i).getxCord()+", "
		+team.teamPlayers.get(i).getyCord()+")");
		
		System.out.println();
	}
}


}
