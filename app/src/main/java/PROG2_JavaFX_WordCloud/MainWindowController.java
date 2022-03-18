package PROG2_JavaFX_WordCloud;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.checkerframework.common.value.qual.MinLenFieldInvariant;

public class MainWindowController {

    @FXML
    private TextArea textHistory;

    @FXML
    private Label lableTitel;

    @FXML
    private TextField textEingabe;

    @FXML
    private void hinzufuegenText(ActionEvent event){
        lableTitel.setText(textEingabe.getText());
        String oldText = textHistory.getText();
        textHistory.setText(oldText+System.lineSeparator()+textEingabe.getText());



    }

    @FXML
    private void leerenTextEingabe(ActionEvent event){
        textHistory.clear();

    }
}
