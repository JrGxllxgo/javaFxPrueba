module javafxPrueba.SeminarioPrueba {
    requires javafx.controls;
    requires javafx.fxml;

    opens javafxPrueba.SeminarioPrueba to javafx.fxml;
    exports javafxPrueba.SeminarioPrueba;
}