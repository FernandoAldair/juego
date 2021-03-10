package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class PantallaJuego extends BaseScreen{
    public PantallaJuego(MyGdxGame game) {
        super(game);
    }

    SpriteBatch spriteBatch;
    Texture background, balonrojo, balonverde, baloazul;

    @Override
    public void show() {
        spriteBatch = new SpriteBatch();
        balonrojo = new Texture("ballon_red.png");

    }

    int conX = 0;
    int conY = 0;
    @Override
    public void render ( float delta){

        Gdx.gl.glClearColor(0.5f, 0.7f, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        spriteBatch.begin();

        spriteBatch.draw(balonrojo, conX, conY);
        conX++;
        conY++;
        if (conY > 450){
            conY = 0;
            conX = 0;
        }
        spriteBatch.end();
    }

}
