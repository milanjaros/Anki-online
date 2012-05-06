package com.anki.online;

import com.vaadin.Application;
import com.vaadin.ui.Label;
import com.vaadin.ui.Window;

public class AnkiOnline extends Application {

	private static final long serialVersionUID = -2988046556141824804L;

	@Override
	public void init() {

		Window mainWindow = new Window("Anki Online");
		mainWindow.setWidth("100%");
		mainWindow.setHeight("100%");
		Tabs tabs = new Tabs();
		mainWindow.addComponent(tabs);
		Label label = new Label("Hello!");
		mainWindow.addComponent(label);
		mainWindow.getContent().setSizeFull();
		setMainWindow(mainWindow);
	}

}
