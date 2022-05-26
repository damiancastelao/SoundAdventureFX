module com.dam.soundadventurefx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.dam.soundadventurefx to javafx.fxml;
    exports com.dam.soundadventurefx;
}