package Default;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * The class contains some default constants that will be used if 
 * the client plugin doesn't specify the values.
 * 
 * @author Gautham Nagaraju, Akash Kulkarni, Victor Dong, Prakhar Dubey
 *
 */
public class Constants {
	public static final int DEFAULT_GRID_WIDTH = 4;
	public static final int DEFAULT_GRID_HEIGHT = 5;
	public static final Color[] DEFAULT_COLOR_MAP = {Color.black, Color.blue, Color.red};
	public static final Icon[] DEFAULT_ICON_MAP = {new ImageIcon("C:\\Users\\aakulkar\\Desktop\\dirt.jpg"),new ImageIcon("C:\\Users\\aakulkar\\Desktop\\alive.gif"), new ImageIcon("C:\\Users\\aakulkar\\Desktop\\Dead_Face.jpg")};
}
