package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Touchable;

public class Tank extends Actor {
    Sprite sprite=new Sprite(new Texture("Helios.png"));
    public Tank(){
        setBounds(sprite.getX(),sprite.getY(),sprite.getWidth(),sprite.getHeight());
        setTouchable(Touchable.enabled);
        addListener(new InputListener()){
            
        }
    }

}
