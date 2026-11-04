
public class SoccerBall {
private double ballX;
private double ballY;
private double ballZ;
private double ballWeight; //in grams

public SoccerBall() {
	ballX = 0;
	ballY = 0;
	setBallZ(0);
	setBallWeight(430);
}

public double getBallX() {
	return ballX;
}

public void setBallX(double ballX) {
	this.ballX = ballX;
}

public double getBallY() {
	return ballY;
}

public void setBallY(double ballY) {
	this.ballY = ballY;
}

public double getBallZ() {
	return ballZ;
}

public void setBallZ(double ballZ) {
	this.ballZ = ballZ;
}

public double getBallWeight() {
	return ballWeight;
}

public void setBallWeight(double ballWeight) {
	this.ballWeight = ballWeight;
}

}
