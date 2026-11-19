Soccer Simulator
A headless soccer match simulation engine written in Java. The project aims to simulate realistic soccer matches through player attributes, tactical instructions, spatial positioning, and individual decision-making rather than relying on predetermined scorelines.

The focus is on the logic behind a match: how players move, react to their surroundings, interact with the ball, and make decisions that influence the final result.
Project Status
In active development. The current focus is building and testing the core match environment, including player positioning and team initialization. Full match simulation and statistical outputs are planned features.
Features
Current implementation
- Player attributes, including fitness, mental strength, position, and technical ratings.
- Team and tactical models with configurable formations, playing styles, and pressing intensity.
- A two-dimensional coordinate system representing the soccer field.
- Formation-based starting positions with adjustments for different player positions.
- Kickoff positioning and center-circle restrictions for the team without possession.
- Field boundary checks and coordinate-based debugging.
Planned features
- Time-slice-based match simulation.
- Individual player decision-making based on positioning, attributes, tactics, and match context.
- Player movement and off-ball behavior.
- Passing, shooting, dribbling, tackling, jockeying, and interceptions.
- Probabilistic action outcomes influenced by player attributes and situational factors.
- Full match results, statistics, and chronological event logs.
- Repeatable simulations and statistical validation across multiple matches.
How the Engine Works
Field representation
The engine represents the pitch using a two-dimensional coordinate system:
Field component	Coordinates
Length (X-axis)	-50 to 50
Width (Y-axis)	-35 to 35
Center spot	(0, 0)
Home goal	(-50, 0)
Away goal	(50, 0)
Center-circle radius	9.15


Each half is divided into defensive, midfield, and attacking zones. Each zone is subdivided into seven lateral sections to help distribute players across the field. Positional offsets account for differences between roles such as center backs, wingbacks, defensive midfielders, and wingers.
Player attributes
Each player has seven primary technical and physical ratings on a scale of 1–99:
1. Pace
2. Shooting
3. Passing
4. Dribbling
5. Defending
6. First touch
7. Jumping
Players also have a name, mental strength, fitness level, assigned position, and current field coordinates.
Match simulation model (planned)
A match will progress through discrete time slices. During each slice, eligible players evaluate the match state and select an action. Actions may take multiple slices to complete, preventing players from immediately switching between incompatible actions.

The goal is for match outcomes to emerge from the interaction of individual decisions and team tactics, rather than from a single predetermined result calculation.
Architecture
Component	Responsibility
Game	Coordinates match setup and the planned simulation loop.
SoccerField	Manages field boundaries, starting positions, goals, and ball placement.
Team	Stores the roster, team attributes, tactics, and possession state.
Player	Stores individual attributes, position, and coordinates.
Tactic	Represents formation, playing style, and pressing intensity.
SoccerBall	Represents the ball and its field coordinates.
SoccerGoal	Represents a goal and its location.


A separate player decision component is planned to keep decision-making logic independent of player data.
Input Configuration
The engine is designed around four plain-text input files: a roster and tactics file for each team.
homeRoster.txt
homeTactics.txt
awayRoster.txt
awayTactics.txt
Example roster format (team header followed by 11 starting players):
Home_Test 8 8
Player1 8 100 80 80 80 80 80 80 80 gk
Player2 8 100 80 80 80 80 80 80 80 lb
...
The team header contains the team name, fanbase strength, and morale. Each player row contains their name, mental strength, fitness, seven ratings in the order listed above, and position. Players are ordered by goalkeeper, defenders, midfielders, and attackers.

Example tactics file:
433 possession mid
This represents a 4-3-3 formation, a possession-based playing style, and a medium press. These examples reflect the proposed test input format while input handling is being developed.
Getting Started
The project is developed in Java using Eclipse.
git clone https://github.com/SebLot1297/Soccer-Simulator.git
Open the project in a Java IDE, such as Eclipse, and configure a test match using two rosters and their corresponding tactical configurations. The current development workflow centers on initializing teams and inspecting the coordinates produced by SoccerField. A complete match-running command is not yet documented.
Testing and Validation
The first stage of testing focuses on initial player placement:
- Verify that all 22 players are within the field boundaries.
- Confirm that players are placed according to their formation and position.
- Check that exactly one player occupies the kickoff spot.
- Ensure the team without possession starts outside or on the center circle.
- Check for unintended overlapping coordinates.
- Repeat tests with different formations and with either team starting in possession.
Once full matches can be simulated, validation will focus on aggregate match statistics, tactical and attribute sensitivity, and comparisons with real-world soccer data over multiple simulation runs.
Project Scope
The first version is intended to simulate individual matches between two teams of 11 starting players. The project prioritizes the simulation engine itself rather than graphics, career modes, transfers, or club management.
Technologies
- Java
- Eclipse IDE
- Git and GitHub
