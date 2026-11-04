import java.util.ArrayList;

public class Passing extends Move{
	
	private Player playerWithBall;
	private SoccerBall ball;
	public ArrayList<Long> passingOptions;
	
	public Passing(boolean hasBall, String type, int executionTime, boolean isCancelable) {
		super(true, "attacking", executionTime, true);
		
	}

	public boolean passSuccess() {
		return false;
	}
	
	public ArrayList<Long> passingOptions() {
		
		return passingOptions;
		
	}
	
	public void executePass() {
		
	}
	

}
