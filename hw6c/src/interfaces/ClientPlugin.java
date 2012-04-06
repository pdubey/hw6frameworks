package interfaces;

/**
 * 
 * @author Gautham Nagaraju, Prakhar Dubey, Akash Kulkarni, Victor Dong.
 * 
 * The class instantiates the plugin and creates the default
 * circular automata. 
 *
 */
public class ClientPlugin {

	public void main(){
		Framework f = new FrameworkImpl();
		f.init();
		f.setColor(null);
		f.setRule(null);
		f.run();
	}
}