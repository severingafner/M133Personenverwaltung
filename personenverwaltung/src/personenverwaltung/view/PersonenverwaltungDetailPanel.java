package personenverwaltung.view;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import global.TableLayoutDefinition;
import layout.TableLayout;
import layout.TableLayoutConstants;

public class PersonenverwaltungDetailPanel extends JPanel implements TableLayoutDefinition {

	public static final double IMAGE_WIDTH = COMPONENT_HEIGHT + COMPONENT_SPACE_VERTICAL + COMPONENT_HEIGHT + COMPONENT_SPACE_VERTICAL + 
			COMPONENT_HEIGHT + COMPONENT_SPACE_VERTICAL + COMPONENT_HEIGHT;
	
	private JLabel surnameLabel;
	private JLabel prenameLabel;
	private JLabel mobileLabel;
	private JLabel phoneLabel;
	private JLabel emailLabel;
	private JLabel altEmailLabel;
	private JLabel streetLabel;
	private JLabel houseNrLabel;
	private JLabel plzLabel;
	private JLabel ortLabel;
	private JTextField surnameField;
	private JTextField prenameField;
	private JTextField mobileField;
	private JTextField phoneField;
	private JTextField emailField;
	private JTextField altEmailField;
	private JTextField streetField;
	private JTextField houseNrField;
	private JTextField plzField;
	private JTextField ortField;
	private JLabel imageLabel;
	private JLabel imageDesLabel;
	
	
	public PersonenverwaltungDetailPanel() {
		initPanel();
	}
	
	public void initPanel() {
		
		double size[][] = {
				{LEFT, COMPONENT_WIDTH, COMPONENT_SPACE_HORIZONTAL, FIELD_WIDTH, COMPONENT_SPACE_HORIZONTAL, COMPONENT_WIDTH, COMPONENT_SPACE_HORIZONTAL, IMAGE_WIDTH, FIELD_WIDTH - IMAGE_WIDTH, FILL, RIGHT},
				{TOP, COMPONENT_HEIGHT, COMPONENT_SPACE_VERTICAL, COMPONENT_HEIGHT, COMPONENT_SPACE_VERTICAL, 
					COMPONENT_HEIGHT, COMPONENT_SPACE_VERTICAL, COMPONENT_HEIGHT, COMPONENT_SPACE_VERTICAL, 
					COMPONENT_HEIGHT, COMPONENT_SPACE_VERTICAL, COMPONENT_HEIGHT, COMPONENT_SPACE_VERTICAL, 
					COMPONENT_HEIGHT, COMPONENT_SPACE_VERTICAL, BOTTOM}
		};
		surnameLabel = new JLabel("Nachname");
		surnameField = new JTextField();
		prenameLabel = new JLabel("Vorname");
		prenameField = new JTextField();
		mobileLabel = new JLabel("Mobile");
		mobileField = new JTextField();
		phoneLabel = new JLabel("Festnetz");
		phoneField = new JTextField();
		emailLabel = new JLabel("E-Mail");
		emailField = new JTextField();
		altEmailLabel = new JLabel("Alt. E-Mail");
		altEmailField = new JTextField();
		streetLabel = new JLabel("Strasse");
		streetField = new JTextField();
		houseNrLabel = new JLabel("Hausnr.");
		houseNrField = new JTextField();
		plzLabel = new JLabel("PLZ");
		plzField = new JTextField();
		ortLabel = new JLabel("Ort");
		ortField = new JTextField();
		
		imageDesLabel = new JLabel("Foto");
		imageLabel = new JLabel();
		imageLabel.setOpaque(true);
		imageLabel.setBackground(Color.RED);
		
		TableLayout tableLayout = new TableLayout(size);
		
		this.setLayout(tableLayout);
		this.add(surnameLabel, "1,1");
		this.add(surnameField, "3,1");
		this.add(imageDesLabel, "5,1");
		this.add(imageLabel, "7,1,7,7");
		this.add(prenameLabel, "1,3");
		this.add(prenameField, "3,3");
		this.add(mobileLabel, "1,5");
		this.add(mobileField, "3,5");
		this.add(phoneLabel, "1,7");
		this.add(phoneField, "3,7");
		this.add(emailLabel, "1,9");
		this.add(emailField, "3,9");
		this.add(altEmailLabel, "5,9");
		this.add(altEmailField, "7,9,8,9");
		this.add(streetLabel, "1,11");
		this.add(streetField, "3,11");
		this.add(houseNrLabel, "5,11");
		this.add(houseNrField, "7,11,8,9");
		this.add(plzLabel, "1,13");
		this.add(plzField, "3,13");
		this.add(ortLabel, "5,13");
		this.add(ortField, "7,13,8,9");
	}

}
