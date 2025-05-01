package ar.edu.unlp.oo2.tres;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MediaPlayerTest {

    MediaPlayer mediaPlayer;

    @BeforeEach
    public void setUp() {
        mediaPlayer = new MediaPlayer();
        mediaPlayer.addMedia(new Audio());
        mediaPlayer.addMedia(new VideoFile());
        mediaPlayer.addMedia(new VideoStreamAdapter());
    }

    @Test
    public void play() {
        mediaPlayer.playAll();
    }
}
