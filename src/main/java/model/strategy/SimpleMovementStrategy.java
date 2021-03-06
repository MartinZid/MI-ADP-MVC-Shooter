package model.strategy;

import model.Config;
import model.gameObjects.Missile;

/**
 *
 * @author Martin
 */
public class SimpleMovementStrategy implements MovementStrategy {

    @Override
    public void move(int gravity, Missile m) 
    {
        int x = (int) Math.ceil(m.getStartX() + m.getForce() * (double)m.getTime()/10 * Math.cos(Math.toRadians(m.getAngle())));
        int y = (int) Math.ceil(m.getStartY() + m.getForce() * (double)m.getTime()/10 * Math.sin(Math.toRadians(m.getAngle())));
        m.setX(x);
        m.setY(y);
    }

}
