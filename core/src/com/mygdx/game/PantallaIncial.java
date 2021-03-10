package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class PantallaIncial extends BaseScreen {

    public PantallaIncial(MyGdxGame game) { super(game); }
    private Stage stage; // Detectar clicks

    @Override
    public void show() {
        //añadir botton
//        ImageButton.ImageButtonStyle botonStart = new ImageButton.ImageButtonStyle();
//        botonStart.up = new TextureRegionDrawable(new TextureRegion(new Texture("button_start_up.png")));
//        botonStart.over = new TextureRegionDrawable(new TextureRegion(new Texture("button_start_over.png")));
//
//        ImageButton buttonStart = new ImageButton(botonStart);
//        buttonStart.setPosition(280, 200);
//        buttonStart.setSize(24*3, 10*3);
//        buttonStart.addListener(new InputListener(){
//
//        });

        BaseButton botonStart = new BaseButton("button_start_up.png","button_start_over.png",10,10,100,50, new InputListener(){
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                setScreen(new PantallaJuego(game));
                return true;
            }
        });

//        BaseButton botonStart2 = new BaseButton("button_start_up.png","button_start_over.png",10,10,100,50, (event, x, y, pointer, button) -> {
//                setScreen(new PantallaJuego(game));
//            }
//        );

        Gdx.input.setInputProcessor(stage = new Stage());
        stage.addActor(botonStart);
    }

    @Override
    public void render(float delta) {
        stage.act();
        stage.draw();

    }
}
