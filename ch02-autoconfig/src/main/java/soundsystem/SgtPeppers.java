package soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by Hao HOU on 2017/5/31.
 */
@Component
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
