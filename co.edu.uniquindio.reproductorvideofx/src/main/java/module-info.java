module co.edu.uniquindio.reproductorvideo.reproductorvideoapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.reproductorvideo.reproductorvideoapp to javafx.fxml;
    exports co.edu.uniquindio.reproductorvideo.reproductorvideoapp;
    opens co.edu.uniquindio.reproductorvideo.reproductorvideoapp.model;
    exports co.edu.uniquindio.reproductorvideo.reproductorvideoapp.model;
}