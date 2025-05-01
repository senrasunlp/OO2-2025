package ar.edu.unlp.oo2.tres;

public class VideoStreamAdapter implements Media{
    private VideoStream videoStream;

    public VideoStreamAdapter() {
        videoStream = new VideoStream();
    }
    public void play() {
        videoStream.reproduce();
    }
}
