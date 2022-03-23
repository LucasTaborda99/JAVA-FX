package ProgramaPricipal;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
	
	@FXML
	public TextField txtInpNome = new TextField();
	
	public void acao() {
		//System.out.println(txtInpNome.getId());
		System.out.println(txtInpNome.getText()); 		
	}
}
