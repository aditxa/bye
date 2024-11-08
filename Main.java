package com.aditya.angrybirdsclone;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.aditya.angrybirdsclone.screen.HomeScreen;
import com.aditya.angrybirdsclone.screen.LevelsScreen;
/////////////////
import com.aditya.angrybirdsclone.screen.GameScreen;

public class Main extends Game {
    public SpriteBatch batch;
    private LevelsScreen levelsScreen;

    @Override
    public void create() {
        //////////////////////////////
        batch = new SpriteBatch();
        levelsScreen = new LevelsScreen(this);  // Initialize LevelsScreen
        this.setScreen(new HomeScreen(this));// Start at the HomeScreen
        ///////////////////////////
//        setScreen(new GameScreen(this, 1));
    }

    // Method to access LevelsScreen
    public LevelsScreen getLevelsScreen() {
        return levelsScreen;
    }

    @Override
    public void dispose() {
        batch.dispose();
        levelsScreen.dispose(); // Ensure resources are disposed
    }
}
