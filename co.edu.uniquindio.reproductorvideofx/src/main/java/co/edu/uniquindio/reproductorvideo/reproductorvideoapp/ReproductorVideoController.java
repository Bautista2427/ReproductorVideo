package co.edu.uniquindio.reproductorvideo.reproductorvideoapp;

import co.edu.uniquindio.reproductorvideo.reproductorvideoapp.model.Fachada;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ReproductorVideoController {
    Fachada fachada = new Fachada();


    @FXML
    private Button btnReproducirVideo;

    @FXML
    private TextField txtArchivoVideo;

    @FXML
    private TextField txtCodec;

    @FXML
    private TextArea txtSalida;

    @FXML
    void onReproducirVideo(ActionEvent event) {
        String mensaje = fachada.reproducir(txtArchivoVideo.getText());
        txtSalida.setText(mensaje);
    }

    @FXML
    void initialize() {
    }
}
