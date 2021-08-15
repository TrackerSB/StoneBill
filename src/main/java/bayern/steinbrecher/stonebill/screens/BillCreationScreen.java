package bayern.steinbrecher.stonebill.screens;

import bayern.steinbrecher.screenswitcher.Screen;

import java.util.ResourceBundle;

public class BillCreationScreen extends Screen<BillCreationScreenController> {
    public BillCreationScreen() {
        super(
                BillCreationScreen.class.getResource("BillCreationScreen.fxml"),
                ResourceBundle.getBundle("bayern.steinbrecher.stonebill.screens.BillCreationScreen"));
    }
}
