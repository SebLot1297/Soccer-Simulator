

//goal coordinates are coordinates for the center of the goal
//7.32 meters long(y axis) and 2.44 meters tall(z axis)
public class SoccerGoal {
private double goalX;
private double goalY;
public SoccerGoal(double x, double y) {
	setGoalX(x);
	setGoalY(y);
}
public double getGoalX() {
	return goalX;
}
public void setGoalX(double goalX) {
	this.goalX = goalX;
}
public double getGoalY() {
	return goalY;
}
public void setGoalY(double goalY) {
	this.goalY = goalY;
}
public boolean isGoal(SoccerField field, SoccerBall ball) { //function for now because i cannot calculate the ball traveling yet
	if( (ball.getBallZ()<2.44 && ball.getBallZ()>=0)
		&&(ball.getBallY()<3.66 && ball.getBallY()>-3.66) && field.isInBounds(ball) == false) {
		return true;
	}
	return false;
}
}
