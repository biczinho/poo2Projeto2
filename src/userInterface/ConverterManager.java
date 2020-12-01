package userInterface;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import converters.AbstractConverter;

/**
 * @author Gabriel
 * @since November 20th
 * @version 1.1 {@summary Class responsible for finding Converters and initializing them.}
 */
public class ConverterManager {
	private final static String path = System.getProperty("user.dir") + "\\bin\\converters";

	public ConverterManager() {

	}

//  suggested by https://stackoverflow.com/questions/42978617/avoid-instantiating-objects-in-loops-sonar-complaince
	/**
	 * {@summary Method to instantialize a AbstractConverter object}
	 * 
	 * @param base : Class reference to be instantialized
	 * @return AbstractConverter object
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public AbstractConverter instantializeConverter(Class base) {
		AbstractConverter object;
		try {
			object = (AbstractConverter) base.getDeclaredConstructor().newInstance();
			return object;
		} catch (InstantiationException e) {
			JOptionPane.showMessageDialog(null, "Are you trying to instantiate an Abstract Class?", "ERROR",
					JOptionPane.ERROR_MESSAGE);
//			e.printStackTrace();
		} catch (IllegalAccessException e) {
			JOptionPane.showMessageDialog(null, "Are you trying to instantiate a private Class?", "ERROR",
					JOptionPane.ERROR_MESSAGE);
//			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			JOptionPane.showMessageDialog(null, e, "ERROR", JOptionPane.ERROR_MESSAGE);
//			e.printStackTrace();
		} catch (InvocationTargetException e) {
			JOptionPane.showMessageDialog(null, e, "ERROR", JOptionPane.ERROR_MESSAGE);
//			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			JOptionPane.showMessageDialog(null, "Does the Converter Class has an no-argument Constructor?", "ERROR",
					JOptionPane.ERROR_MESSAGE);
//			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e, "ERROR", JOptionPane.ERROR_MESSAGE);
//			e.printStackTrace();
		}
		return null;
	}

	/**
	 * {@summary Method to find all converters in the Package.}
	 * 
	 * @return &lt;List&lt;Class&gt;AbstractConverter&gt; of all Converters found in Package.
	 */
	@SuppressWarnings("unchecked")
	public List<Class<AbstractConverter>> getConverters() {
		List<Class<AbstractConverter>> classes = new ArrayList<Class<AbstractConverter>>();
		File a = new File(path);
		File[] files = a.listFiles();

		for (int i = 0; i < files.length; i++) {
			String aux = files[i].getName();
			aux = aux.replace(".class", ""); // needed to remove .class extension in order to match forName() needs
			if (!aux.equals("AbstractConverter") && !aux.equals("MeasureType"))
				try {
					classes.add((Class<AbstractConverter>) Class.forName("converters." + aux));
				} catch (ClassNotFoundException e) {
					JOptionPane.showMessageDialog(null, "Could not find Converter Class in: " + path, "ERROR",
							JOptionPane.ERROR_MESSAGE);
//					e.printStackTrace();
				}
		}
		return classes;
	}

	/**
	 * {@summary Overloaded method <br>
	 * Finds Converters filtered by measureType.}
	 * 
	 * @param measureType : String to filter Converters.
	 * @return List&lt;Class&lt;AbstractConverter&gt;&gt; of Converter found in package, and filtered.
	 */
	public List<Class<AbstractConverter>> getConverters(String measureType) {
		List<Class<AbstractConverter>> classes = new ArrayList<Class<AbstractConverter>>();
		List<Class<AbstractConverter>> classesFiltered = new ArrayList<Class<AbstractConverter>>();
		classes = getConverters();
		for (Class<AbstractConverter> aux : classes) {
			//if the object's measureType match the parameter, the Class<AbstractConverter> definetely does. 
			AbstractConverter obj = instantializeConverter(aux);
			if (obj.getBasicUnit().equals(measureType))
				classesFiltered.add(aux);
		}

		return classesFiltered;
	}
}
