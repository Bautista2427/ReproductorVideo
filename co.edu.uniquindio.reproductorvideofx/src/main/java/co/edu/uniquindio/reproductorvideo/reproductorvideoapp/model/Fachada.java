package co.edu.uniquindio.reproductorvideo.reproductorvideoapp.model;

public class Fachada {
    private Codec codec = new Codec();
    private VideoDecoder videoDecorder = new VideoDecoder();
    private VideoFile videoFile = new VideoFile();
    private VideoPlayer videoPlayer = new VideoPlayer();

    public Fachada() {
    }

    public String obtenerCodec(String texto) {
        return "";
    }

    public String reproducir(String texto) {
        String codecTexto = obtenerCodec(texto);
        String mensaje = videoFile.videoFile(texto);
        mensaje+="\n"+codec.codec(codecTexto);
        mensaje+="\n"+videoDecorder.decode(texto,codecTexto);
        mensaje+="\n"+videoPlayer.play(texto);
        return mensaje;
    }
}
