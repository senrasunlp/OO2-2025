package ar.edu.unlp.oo2.tres;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {
    private List<Media> medias;

    public MediaPlayer() {
        medias = new ArrayList<Media>();
    }

    public void addMedia(Media media){
        medias.add(media);
    }

    public void playAll() {
        medias.forEach(Media::play);
    }
}
