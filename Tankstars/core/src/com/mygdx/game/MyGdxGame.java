package com.mygdx.game;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.game.Screens.MainScreen;
import com.mygdx.game.Screens.menuscreen;

public class MyGdxGame extends Game {
	public SpriteBatch batch;
	public static final int V_width=800;
	public static final int V_Height=480;
//	Menuscreen Menuscreen=new Menuscreen(this);
	@Override
	public void create () {
		batch = new SpriteBatch();
		setScreen(new MainScreen(this));
//		setScreen(new menuscreen(this));
	}

//	public void changescreen(){
//		setScreen(Menuscreen);
//	}
	@Override
	public void render () {
		super.render();
//		if(Gdx.input.isKeyPressed(66)){
//			Menuscreen.show();
//		}
	}
	
	@Override
	public void dispose () {
		super.dispose();
	}
}
