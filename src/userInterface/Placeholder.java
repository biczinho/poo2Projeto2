package userInterface;

import javax.swing.JOptionPane;

import converters.AbstractConverter;

public class Placeholder {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		double r = Double.parseDouble(JOptionPane.showInputDialog("Number")); // later on this number input will be replaced with a textfield reading

		String selectedType = JOptionPane.showInputDialog("Type"); // later on this decision will be replace with a combobox option
		try {
			String classpath = "converters." + selectedType + "Converter";
			Class base = Class.forName(classpath);
			AbstractConverter polimorphing = (AbstractConverter) base.newInstance();
			r = polimorphing.toBaseUnit(r);
			JOptionPane.showMessageDialog(null, r + " " + polimorphing.getBasicUnit());
		} catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
