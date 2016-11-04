package personenverwaltung.view;

import global.MainFrame;

public class PersonenverwaltungMainFrame extends MainFrame {

	public PersonenverwaltungMainFrame() {
		PersonenverwaltungDetailPanel personenverwaltungDetailPanel = new PersonenverwaltungDetailPanel();
		this.add(personenverwaltungDetailPanel);
		this.setVisible(true);
	}
	
	public static void main(String args[]) {
		PersonenverwaltungMainFrame personenverwaltungMainFrame = new PersonenverwaltungMainFrame();
	}

}
