package com.watson.libgdx.example.html;

import com.watson.libgdx.example.core.MyGame;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;

public class MyGameHtml extends GwtApplication {
	@Override
	public ApplicationListener getApplicationListener () {
		return new MyGame();
	}
	
	@Override
	public GwtApplicationConfiguration getConfig () {
		return new GwtApplicationConfiguration(480, 320);
	}
}
