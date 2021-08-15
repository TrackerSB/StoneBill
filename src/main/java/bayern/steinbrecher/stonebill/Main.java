package bayern.steinbrecher.stonebill;

import bayern.steinbrecher.screenswitcher.ScreenManager;
import bayern.steinbrecher.screenswitcher.ScreenSwitchFailedException;
import bayern.steinbrecher.stonebill.screens.BillCreationScreen;
import javafx.application.Application;
import javafx.stage.Stage;
import lombok.NonNull;

public class Main extends Application {
    @Override
    public void start(@NonNull Stage primaryStage) throws ScreenSwitchFailedException {
        var screenManager = new ScreenManager(primaryStage);
        screenManager.switchTo(new BillCreationScreen());

        primaryStage.setMaximized(true);
        primaryStage.show();
    }
}
