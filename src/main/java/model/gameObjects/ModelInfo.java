/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.gameObjects;

import model.gameObjects.GameObject;
import view.GraphicsDrawer;

/**
 *
 * @author Martin
 */
public class ModelInfo extends GameObject{

    public ModelInfo(int x, int y) {
        super(x, y);
    }

    @Override
    public void accept(GraphicsDrawer d) {
        d.visit(this);
    }
    
}