module bayern.steinbrecher.StoneBill {
    requires bayern.steinbrecher.CheckedElements;
    requires bayern.steinbrecher.ScreenSwitcher;
    requires java.logging;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires lombok;

    exports bayern.steinbrecher.stonebill to javafx.graphics;

    opens bayern.steinbrecher.stonebill.screens to javafx.fxml;
    exports bayern.steinbrecher.stonebill.data to javafx.graphics;
}