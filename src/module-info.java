module ProjectJavaFx {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens ProgramaPricipal to javafx.graphics, javafx.fxml;
}
