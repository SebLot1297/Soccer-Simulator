
public class Move {
	private boolean hasBall;
	private String type; // attacking or defending
	private int executionTime;//in simulated seconds
	private boolean isCancelable; 
public Move(boolean hasBall, String type,  int executionTime, boolean isCancelable) {
	setHasBall(hasBall);
	setType(type);
	setExecutionTime(executionTime);
	setCancelable(isCancelable);
}

public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getExecutionTime() {
	return executionTime;
}
public void setExecutionTime(int executionTime) {
	this.executionTime = executionTime;
}
public boolean isCancelable() {
	return isCancelable;
}
public void setCancelable(boolean isCancelable) {
	this.isCancelable = isCancelable;
}

public boolean isHasBall() {
	return hasBall;
}

public void setHasBall(boolean hasBall) {
	this.hasBall = hasBall;
}



}