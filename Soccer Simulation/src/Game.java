
public class Game {
	
public static String venue; // maybe?
public static int matchStakes; //out of 10

public static Team home;

public static Team away;

public static double slice = 0.25;
public static double fullTime = 60 *90;
public static SoccerBall ball = new SoccerBall();
public static SoccerField field;
//referee-> tbd
//uncertain events/randomness ->tbd

public static void readRosterInputFile(Team team, String file){

}

public static void readTacticInputFile(Team team, String file){
    
}

public static void main(String[] args){
    //the setup
    readRosterInputFile(home, "homeRoster");
    readTacticInputFile(home, "homeTactic");
    readRosterInputFile(away, "awayRoster");
    readTacticInputFile(away, "awayTactic");
    field = new SoccerField(away, home, ball);
    field.placeTeam(home);
    field.placeTeam(away);

}


}

