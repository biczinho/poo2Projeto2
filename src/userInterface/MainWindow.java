package userInterface;

import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import converters.AbstractConverter;

/**
 * @author Veronica
 * @since November 25th
 * @version 2.0 {@summary Class responsible for Graphic User Interface and executing conversions}
 */
public class MainWindow {
	private JFrame frmMain;
	private JTextField txfInput;
	private JTextField txfOutput;
	AbstractConverter fromConverter;
	AbstractConverter intoConverter;
	static ConverterManager cM = new ConverterManager();

	/**
	 * Launch the application. <br>
	 * Code generated by WindowBuilder extension.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frmMain.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application. <br>
	 * Code generated by WindowBuilder extension.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * {@summary Method responsible for generically calling Converters}
	 * 
	 * @param A : Converter selected by the User.
	 * @param B : Converter related to the Output unit.
	 * @return Converted value
	 */
	public double convert(AbstractConverter A, AbstractConverter B) {
		double r = A.toBaseUnit(Double.parseDouble(txfInput.getText()));
		return B.fromBaseUnit(r);
	}

	/**
	 * Initialize the contents of the frame. <br>
	 * gUI built using gridBagLayout and JPanels
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize() {
		frmMain = new JFrame();
		frmMain.setTitle(Messages.getString("frame_title"));
		frmMain.setResizable(false);
		frmMain.getContentPane().setBackground(new Color(0x161616));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 367, 487, 0 };
		gridBagLayout.rowHeights = new int[] { 311, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		frmMain.getContentPane().setLayout(gridBagLayout);

		JPanel pnlRight = new JPanel();
		pnlRight.setBackground(new Color(0x161616));
		GridBagConstraints gbc_pnlRight = new GridBagConstraints();
		gbc_pnlRight.fill = GridBagConstraints.BOTH;
		gbc_pnlRight.gridx = 1;
		gbc_pnlRight.gridy = 0;
		frmMain.getContentPane().add(pnlRight, gbc_pnlRight);
		pnlRight.setLayout(new GridLayout(3, 1, 0, 25));

		JPanel pnlRightFix = new JPanel();
		pnlRightFix.setBackground(new Color(0x161616));
		pnlRight.add(pnlRightFix);

		JPanel pnlInput = new JPanel();
		pnlInput.setBorder(null);
		pnlInput.setBackground(new Color(0x161616));
		pnlRight.add(pnlInput);
		GridBagLayout gbl_pnlInput = new GridBagLayout();
		gbl_pnlInput.columnWidths = new int[] { 90, 90, 290 };
		gbl_pnlInput.rowHeights = new int[] { 30, 30, 0 };
		gbl_pnlInput.columnWeights = new double[] { 0.0, 0.0, 1.0 };
		gbl_pnlInput.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		pnlInput.setLayout(gbl_pnlInput);

		JComboBox cbxOutput = new JComboBox();
		cbxOutput.setFont(new Font("Lato", Font.PLAIN, 12));
		cbxOutput.setBorder(null);
		cbxOutput.setBackground(Color.WHITE);
		GridBagConstraints gbc_cbbResult = new GridBagConstraints();
		gbc_cbbResult.insets = new Insets(5, 0, 0, 10);
		gbc_cbbResult.fill = GridBagConstraints.BOTH;
		gbc_cbbResult.gridx = 2;
		gbc_cbbResult.gridy = 1;
		pnlInput.add(cbxOutput, gbc_cbbResult);
		// event responsible for setting Output text on Item Change
		cbxOutput.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					intoConverter = (AbstractConverter) e.getItem();
					txfOutput.setText("" + convert(fromConverter, intoConverter));
				}
			}
		});

		JComboBox cbxInput = new JComboBox();
		cbxInput.setFont(new Font("Lato", Font.PLAIN, 12));
		cbxInput.setBorder(null);
		cbxInput.setBackground(Color.WHITE);
		GridBagConstraints gbc_cbbConversor = new GridBagConstraints();
		gbc_cbbConversor.insets = new Insets(0, 0, 5, 10);
		gbc_cbbConversor.fill = GridBagConstraints.BOTH;
		gbc_cbbConversor.gridx = 2;
		gbc_cbbConversor.gridy = 0;
		pnlInput.add(cbxInput, gbc_cbbConversor);

//		populating combobox with all converters found
//		this couldve been a separate Method: populateWithConverters(comboBox, List<Class<AbstractConverter>>)
		for (Class<AbstractConverter> conv : cM.getConverters()) {
			cbxInput.addItem(cM.instantializeConverter(conv));
		}
		cbxInput.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					cbxOutput.removeAllItems();
					fromConverter = (AbstractConverter) e.getItem();
//					populating combobox with converters filtered
//					populateWithConverters(cbxOutput, cM.getConverters(fromConverter.getBasicUnit()))
					for (Class<AbstractConverter> conv : cM.getConverters(fromConverter.getBasicUnit())) {
						cbxOutput.addItem(cM.instantializeConverter(conv));
					}
					txfOutput.setText("" + convert(fromConverter, intoConverter));
				}
			}
		});

		JPanel pnlLeft = new JPanel();
		pnlLeft.setBackground(new Color(0x7F5AF0));
		GridBagConstraints gbc_pnlLeft = new GridBagConstraints();
		gbc_pnlLeft.fill = GridBagConstraints.BOTH;
		gbc_pnlLeft.insets = new Insets(0, 0, 0, 5);
		gbc_pnlLeft.gridx = 0;
		gbc_pnlLeft.gridy = 0;
		frmMain.getContentPane().add(pnlLeft, gbc_pnlLeft);
		pnlLeft.setLayout(new GridLayout(0, 1, 0, 25));

		JPanel pnlMenu = new JPanel();
		pnlMenu.setBackground(new Color(0x7F5AF0));
		pnlLeft.add(pnlMenu);
		GridBagLayout gbl_pnlMenu = new GridBagLayout();
		gbl_pnlMenu.columnWidths = new int[] { 299, 0 };
		gbl_pnlMenu.rowHeights = new int[] { 22, 0 };
		gbl_pnlMenu.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_pnlMenu.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		pnlMenu.setLayout(gbl_pnlMenu);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setMinimumSize(new Dimension(0, 30));
		menuBar.setMaximumSize(new Dimension(0, 4));
		menuBar.setFont(new Font("Lato", Font.PLAIN, 14));
		menuBar.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		GridBagConstraints gbc_menuBar = new GridBagConstraints();
		gbc_menuBar.insets = new Insets(0, 5, 0, 0);
		gbc_menuBar.anchor = GridBagConstraints.NORTH;
		gbc_menuBar.fill = GridBagConstraints.HORIZONTAL;
		gbc_menuBar.gridx = 0;
		gbc_menuBar.gridy = 0;
		pnlMenu.add(menuBar, gbc_menuBar);
		menuBar.setBorder(null);
		menuBar.setBackground(new Color(0x7F5AF0));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0x7F5AF0));
		panel.setPreferredSize(new Dimension(200, 10));
		menuBar.add(panel);

		JMenuItem menuHelp = new JMenuItem(Messages.getString("menuBar_Help")); //t
		menuHelp.setFont(new Font("Lato", Font.PLAIN, 14));
		menuHelp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuHelp.setBorder(null);
		menuHelp.setBackground(new Color(0x7F5AF0));
		menuBar.add(menuHelp);
		menuHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(Messages.getString("text_Help"));
			}
		});

		JMenuItem menuAbout = new JMenuItem(Messages.getString("menuBar_About")); //t
		menuAbout.setFont(new Font("Lato", Font.PLAIN, 14));
		menuAbout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuAbout.setBorder(null);
		menuAbout.setBackground(new Color(0x7F5AF0));
		menuBar.add(menuAbout);
		menuAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(Messages.getString("text_About"));
			}
		});

		JPanel pnlTitle = new JPanel();
		pnlTitle.setBackground(new Color(0x7F5AF0));
		pnlLeft.add(pnlTitle);
		GridBagLayout gbl_pnlTitle = new GridBagLayout();
		gbl_pnlTitle.columnWidths = new int[] { 294, 0 };
		gbl_pnlTitle.rowHeights = new int[] { 29, 29, 0 };
		gbl_pnlTitle.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_pnlTitle.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		pnlTitle.setLayout(gbl_pnlTitle);

		JLabel lblGroup = new JLabel(Messages.getString("lbl_Team")); //t
		lblGroup.setForeground(Color.WHITE);
		lblGroup.setFont(new Font("Lato", Font.BOLD, 24));
		GridBagConstraints gbc_lblGroup = new GridBagConstraints();
		gbc_lblGroup.fill = GridBagConstraints.BOTH;
		gbc_lblGroup.insets = new Insets(0, 10, 0, 0);
		gbc_lblGroup.gridx = 0;
		gbc_lblGroup.gridy = 0;
		pnlTitle.add(lblGroup, gbc_lblGroup);

		JLabel lblTitle = new JLabel(Messages.getString("lbl_Conversor")); //t
		lblTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblTitle.setForeground(new Color(0x161616));
		lblTitle.setFont(new Font("Lato", Font.BOLD, 24));
		GridBagConstraints gbc_lblTitle = new GridBagConstraints();
		gbc_lblTitle.insets = new Insets(0, 10, 0, 0);
		gbc_lblTitle.fill = GridBagConstraints.BOTH;
		gbc_lblTitle.gridx = 0;
		gbc_lblTitle.gridy = 1;
		pnlTitle.add(lblTitle, gbc_lblTitle);

		JPanel panel_4 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_4.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_4.setBackground(new Color(0x7F5AF0));
		pnlLeft.add(panel_4);

		JLabel lblLogo = new JLabel(new ImageIcon(MainWindow.class.getResource("/assets/uniLogo.png")));
		panel_4.add(lblLogo);

		JLabel lblConversor = new JLabel(Messages.getString("lbl_Input")); //t
		lblConversor.setForeground(Color.WHITE);
		lblConversor.setFont(new Font("Lato", Font.BOLD, 17));
		GridBagConstraints gbc_lblConversor = new GridBagConstraints();
		gbc_lblConversor.fill = GridBagConstraints.BOTH;
		gbc_lblConversor.insets = new Insets(0, 0, 5, 5);
		gbc_lblConversor.gridx = 0;
		gbc_lblConversor.gridy = 0;
		pnlInput.add(lblConversor, gbc_lblConversor);

		txfInput = new JTextField();
		txfInput.setFont(new Font("Lato", Font.PLAIN, 14));
		txfInput.setBorder(new LineBorder(new Color(192, 192, 192)));
		GridBagConstraints gbc_txtValue = new GridBagConstraints();
		gbc_txtValue.fill = GridBagConstraints.BOTH;
		gbc_txtValue.insets = new Insets(0, 0, 5, 0);
		gbc_txtValue.gridx = 1;
		gbc_txtValue.gridy = 0;
		pnlInput.add(txfInput, gbc_txtValue);
		txfInput.setColumns(10);
		txfInput.setText("" + 0);
		txfInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txfOutput.setText("" + convert(fromConverter, intoConverter));
			}
		});

		JLabel lblTo = new JLabel(Messages.getString("lbl_Output")); //t
		lblTo.setForeground(Color.WHITE);
		lblTo.setFont(new Font("Lato", Font.BOLD, 17));
		GridBagConstraints gbc_lblTo = new GridBagConstraints();
		gbc_lblTo.fill = GridBagConstraints.BOTH;
		gbc_lblTo.insets = new Insets(5, 0, 0, 5);
		gbc_lblTo.gridx = 0;
		gbc_lblTo.gridy = 1;
		pnlInput.add(lblTo, gbc_lblTo);

		txfOutput = new JTextField();
		txfOutput.setBackground(UIManager.getColor("ComboBox.disabledBackground"));
		txfOutput.setFont(new Font("Lato", Font.PLAIN, 14));
		txfOutput.setBorder(new LineBorder(new Color(192, 192, 192)));
		txfOutput.setEnabled(false);
		GridBagConstraints gbc_txtResult = new GridBagConstraints();
		gbc_txtResult.insets = new Insets(5, 0, 0, 0);
		gbc_txtResult.fill = GridBagConstraints.BOTH;
		gbc_txtResult.gridx = 1;
		gbc_txtResult.gridy = 1;
		pnlInput.add(txfOutput, gbc_txtResult);
		txfOutput.setColumns(10);

		JPanel pnlButton = new JPanel();
		pnlButton.setBackground(new Color(0x161616));
		pnlRight.add(pnlButton);
		GridBagLayout gbl_pnlButton = new GridBagLayout();
		gbl_pnlButton.columnWidths = new int[] { 90, 90, 90, 0 };
		gbl_pnlButton.rowHeights = new int[] { 25, 0 };
		gbl_pnlButton.columnWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlButton.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		pnlButton.setLayout(gbl_pnlButton);

		JPanel pnlButtonFix = new JPanel();
		pnlButtonFix.setBackground(new Color(0x161616));
		GridBagConstraints gbc_pnlButtonFix = new GridBagConstraints();
		gbc_pnlButtonFix.fill = GridBagConstraints.BOTH;
		gbc_pnlButtonFix.insets = new Insets(0, 0, 0, 5);
		gbc_pnlButtonFix.gridx = 0;
		gbc_pnlButtonFix.gridy = 0;
		pnlButton.add(pnlButtonFix, gbc_pnlButtonFix);

		JButton btnCalc = new JButton(Messages.getString("btn_Convert")); //t
		btnCalc.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnCalc.setForeground(Color.WHITE);
		btnCalc.setBackground(new Color(0x2CB67D));
		btnCalc.setFont(new Font("Lato", Font.BOLD, 12));
		btnCalc.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		GridBagConstraints gbc_btnCalc = new GridBagConstraints();
		gbc_btnCalc.fill = GridBagConstraints.BOTH;
		gbc_btnCalc.insets = new Insets(0, 0, 0, 5);
		gbc_btnCalc.gridx = 1;
		gbc_btnCalc.gridy = 0;
		pnlButton.add(btnCalc, gbc_btnCalc);
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if ((fromConverter != null) && (intoConverter != null))
					txfOutput.setText("" + convert(fromConverter, intoConverter));
			}
		});

		JButton btnClear = new JButton(Messages.getString("btn_Clear")); //t
		btnClear.setForeground(Color.WHITE);
		btnClear.setBackground(new Color(0xF25F4C));
		btnClear.setFont(new Font("Lato", Font.BOLD, 12));
		btnClear.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnClear.setAlignmentX(Component.CENTER_ALIGNMENT);
		GridBagConstraints gbc_btnClear = new GridBagConstraints();
		gbc_btnClear.fill = GridBagConstraints.BOTH;
		gbc_btnClear.gridx = 2;
		gbc_btnClear.gridy = 0;
		pnlButton.add(btnClear, gbc_btnClear);
		frmMain.setBounds(100, 100, 802, 350);
		frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txfInput.setText("0");
				txfOutput.setText("");

			}
		});
	}

}
