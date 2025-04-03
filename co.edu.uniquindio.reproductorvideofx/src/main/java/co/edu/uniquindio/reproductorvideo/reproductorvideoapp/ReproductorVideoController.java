package co.edu.uniquindio.reproductorvideo.reproductorvideoapp;

import co.edu.uniquindio.reproductorvideo.reproductorvideoapp.model.Fachada;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import java.io.File;


public class ReproductorVideoController {
    Fachada fachada = new Fachada();


    @FXML
    private Button btnReproducirVideo;

    @FXML
    private Button btnCargarArchivo;

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
    void onCargarArchivo(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();

        fileChooser.setTitle("Seleccionar un archivo");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Archivos de video", "*.mp4", "*.avi", "*.mkv"),
                new FileChooser.ExtensionFilter("Todos los archivos", "*.*")
        );

        File archivoSeleccionado = fileChooser.showOpenDialog(null);

        if (archivoSeleccionado != null) {
            txtArchivoVideo.setText(archivoSeleccionado.getAbsolutePath());
        } else {
            txtArchivoVideo.setText("No se seleccionó ningún archivo");
        }
    }

    @FXML
    void initialize() {
    }
}