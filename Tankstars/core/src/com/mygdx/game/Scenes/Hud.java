package com.mygdx.game.Scenes;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.MyGdxGame;

public class Hud {
    public Stage stage;
//    Image img=new Image("P")
    private Viewport viewport;

    private int p1_health,p2_health;
    private int fuel1,fuel2;


    Label p1_health_label,p2_health_label;
    public Hud(SpriteBatch sb){
        p1_health=100;
        p2_health=100;
        viewport= new FitViewport(MyGdxGame.V_width,MyGdxGame.V_Height,new OrthographicCamera());
        stage = new Stage(viewport,sb);
        Table table = new Table();
        table.setFillParent(true);
//        p1_health_label=new Label(String.format("%03d",p1_health),new Label.LabelStyle(new BitmapFont(), Color.WHITE));
//        p2_health_label=new Label(String.format("%03d",p1_health),new Label.LabelStyle(new BitmapFont(), Color.WHITE));
//        table.add(p1_health_label).expandX().padTop(400).expandY().padTop(-200);
//        table.add(p2_health_label).expandX().padTop(-200)/;
        stage.addActor(table);
    }
}
