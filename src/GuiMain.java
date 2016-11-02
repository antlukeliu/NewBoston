import javax.swing.JFrame;

public class GuiMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Gui go = new Gui();
		//GuiJCheckBox go = new GuiJCheckBox();
		//GuiJRadio go = new GuiJRadio();
		GuiJList go = new GuiJList();
		
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		go.setSize(300, 200);
		go.setVisible(true);
	}

}
