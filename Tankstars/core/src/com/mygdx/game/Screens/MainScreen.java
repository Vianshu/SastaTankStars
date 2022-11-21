package com.mygdx.game.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.MyGdxGame;
import com.mygdx.game.Scenes.Hud;

import javax.management.StandardEmitterMBean;

public class MainScreen implements Screen {


    private MyGdxGame game;
    Texture texture;
    private OrthographicCamera gamecam;
    private Viewport gameport;
    private Hud hud;
    private TmxMapLoader maploader;
    private TiledMap map;
    private OrthogonalTiledMapRenderer renderer;
    private Texture tank1,tank2;
    public MainScreen(MyGdxGame game){
        this.game=game;
        texture=new Texture("TS_LP.png");
        gamecam=new OrthographicCamera();
//        gameport=new StretchViewport(800,480,gamecam);
//        gameport=new ScreenViewport();
        gameport=new FitViewport(game.V_width,game.V_Height,gamecam);
        hud = new Hud(game.batch);
        tank1=new Texture("Helios.png");
        tank2=new Texture("Blazer.png");
        maploader=new TmxMapLoader();
        map=maploader.load("Map2.tmx");
        renderer= new OrthogonalTiledMapRenderer(map);
        gamecam.position.set(+400,+240,0);
    }
//        gamecam.position.set(0,0,0);}
    @Override
    public void show() {

    }
    public void handleInput(float dt){
        if(Gdx.input.isKeyPressed(66) && gamecam.position.x <100 ){
            gamecam.position.x+=100*dt;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.DOWN)){
            gamecam.position.y-=100*dt;
        }

        if (Gdx.input.isKeyPressed(Input.Keys.UP)){
            gamecam.position.y+=100*dt;
        }
    }

    public void controlp1(){

    }
//    public void controltank(float dt){
//        if(Gdx.input.isKeyPressed(Input.Keys.W)){
//            ;
//        }
//    }
    public void update(float dt){
        handleInput(dt);
        gamecam.update();
        renderer.setView(gamecam);
     }

    @Override
    public void render(float delta) {
        update(delta);
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        hud.stage.draw();
        game.batch.setProjectionMatrix(hud.stage.getCamera().combined);
        game.batch.begin();
        game.batch.draw(tank1,160,250,50,50);
        game.batch.draw(tank2,600,220,50,50);
        game.batch.setProjectionMatrix(gamecam.combined);
//        game.batch.begin();
//        game.batch.draw(texture,-400,-200);
//        game.batch.end();
        renderer.render();

        game.batch.end();
    }

    @Override
    public void resize(int width, int height) {
        gameport.update(800,480);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
    }
}
