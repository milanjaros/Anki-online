package com.anki.online;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.terminal.ThemeResource;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.VerticalLayout;

public class Tabs extends CustomComponent {

	@AutoGenerated
	private AbsoluteLayout mainLayout;
	@AutoGenerated
	private TabSheet tabSheet;
	@AutoGenerated
	private VerticalLayout groups;
	@AutoGenerated
	private Button button_5;
	@AutoGenerated
	private VerticalLayout decks;
	@AutoGenerated
	private Button button_3;
	@AutoGenerated
	private Button button_4;
	@AutoGenerated
	private HorizontalLayout home;
	@AutoGenerated
	private Button button_2;
	@AutoGenerated
	private Button button_1;

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	private static final long serialVersionUID = 1005821002776831985L;

	/**
	 * The constructor should first build the main layout, set the composition
	 * root and then do any custom initialization.
	 * 
	 * The constructor will not be automatically regenerated by the visual
	 * editor.
	 */
	public Tabs() {
		buildMainLayout();
		setCompositionRoot(mainLayout);

		// TODO add user code here
	}

	@AutoGenerated
	private AbsoluteLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new AbsoluteLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("100%");
		mainLayout.setHeight("100%");
		mainLayout.setMargin(false);

		// top-level component properties
		setWidth("100.0%");
		setHeight("100.0%");

		// tabSheet
		tabSheet = buildTabSheet();
		mainLayout.addComponent(tabSheet,
				"top:0.0px;right:2.0px;bottom:-2.0px;left:0.0px;");

		return mainLayout;
	}

	@AutoGenerated
	private TabSheet buildTabSheet() {
		// common part: create layout
		tabSheet = new TabSheet();
		tabSheet.setImmediate(false);
		tabSheet.setWidth("100.0%");
		tabSheet.setHeight("100.0%");

		// home
		home = buildHome();
		tabSheet.addTab(home, "Home", null);

		// decks
		decks = buildDecks();
		tabSheet.addTab(decks, "My Decks", null);

		// groups
		groups = buildGroups();
		tabSheet.addTab(groups, "Groups", null);

		return tabSheet;
	}

	@AutoGenerated
	private HorizontalLayout buildHome() {
		// common part: create layout
		home = new HorizontalLayout();
		home.setImmediate(false);
		home.setDescription("Home page");
		home.setWidth("-1px");
		home.setHeight("-1px");
		home.setMargin(false);

		// button_1
		button_1 = new Button();
		button_1.setCaption("Button");
		button_1.setImmediate(true);
		button_1.setWidth("-1px");
		button_1.setHeight("-1px");
		home.addComponent(button_1);

		// button_2
		button_2 = new Button();
		button_2.setCaption("Button");
		button_2.setImmediate(true);
		button_2.setWidth("-1px");
		button_2.setHeight("-1px");
		home.addComponent(button_2);

		return home;
	}

	@AutoGenerated
	private VerticalLayout buildDecks() {
		// common part: create layout
		decks = new VerticalLayout();
		decks.setImmediate(false);
		decks.setWidth("-1px");
		decks.setHeight("-1px");
		decks.setMargin(false);

		// button_4
		button_4 = new Button();
		button_4.setCaption("Button");
		button_4.setImmediate(true);
		button_4.setWidth("-1px");
		button_4.setHeight("-1px");
		decks.addComponent(button_4);

		// button_3
		button_3 = new Button();
		button_3.setCaption("Button");
		button_3.setImmediate(true);
		button_3.setWidth("-1px");
		button_3.setHeight("-1px");
		decks.addComponent(button_3);

		return decks;
	}

	@AutoGenerated
	private VerticalLayout buildGroups() {
		// common part: create layout
		groups = new VerticalLayout();
		groups.setIcon(new ThemeResource("../runo/icons/32/users.png"));
		groups.setImmediate(false);
		groups.setWidth("-1px");
		groups.setHeight("-1px");
		groups.setMargin(false);

		// button_5
		button_5 = new Button();
		button_5.setCaption("Button");
		button_5.setImmediate(true);
		button_5.setWidth("-1px");
		button_5.setHeight("-1px");
		groups.addComponent(button_5);

		return groups;
	}

}
