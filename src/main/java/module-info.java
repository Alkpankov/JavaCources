module ru.qeekbrains.courses.java_2021_2.HW_4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.qeekbrains.courses.java_2021_2.HW_4 to javafx.fxml;
    exports ru.qeekbrains.courses.java_2021_2.HW_4;
}