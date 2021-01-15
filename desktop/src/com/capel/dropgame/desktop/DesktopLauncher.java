package com.capel.dropgame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.capel.dropgame.DropGameLauncher;
import com.capel.dropgame.DropGameMain;
import com.capel.dropgame.MainMenuScreen;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Drop";
		config.width = 800;
		config.height = 480;
		new LwjglApplication(new DropGameLauncher(), config);
	}
}
