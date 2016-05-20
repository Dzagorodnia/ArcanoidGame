import javax.swing.JButton;

public class Main {

	public static void main(String[] args) {
	    GameController controller = new GameController();
	    
	    controller.addCloseListener(e->{
	        System.exit(0);
	    });

	    controller.startGame();

	}

}
