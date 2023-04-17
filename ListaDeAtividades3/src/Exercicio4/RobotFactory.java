package Exercicio5;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    private Map<String, Robo> robotPrototypes;

    public RobotFactory() {
        this.robotPrototypes = new HashMap<>();
        this.robotPrototypes.put("FastRobot", new RoboVeloz());
        this.robotPrototypes.put("SmallRobot", new RoboPequeno());
        this.robotPrototypes.put("CargoRobot", new CargoRobot());
    }

    public Robo getRobot(String robotType) {
        Robo robot = robotPrototypes.get(robotType);
        return (robot != null) ? robot.clone() : null;
    }

    public void addRobotPrototype(String robotType, Robo robot) {
        robotPrototypes.put(robotType, robot);
    }
}
