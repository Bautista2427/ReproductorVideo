package co.edu.uniquindio.reproductorvideo.reproductorvideoapp.model;

public class VideoFile {
    private String fileName;
    public VideoFile() {
    }
    public String videoFile(String fileName) {
        return "Archivo de video: " + fileName + " Cargando";
    }
}