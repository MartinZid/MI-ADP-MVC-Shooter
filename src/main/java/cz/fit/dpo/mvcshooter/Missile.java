package cz.fit.dpo.mvcshooter;

import cz.fit.dpo.mvcshooter.view.GraphicsDrawer;

/**
 *
 * @author Martin
 */
public class Missile extends GameObject{
    
    public Missile(int x, int y) {
        super(x, y);
    }

    @Override
    public void accept(GraphicsDrawer d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
