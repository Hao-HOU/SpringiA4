package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Hao HOU on 2017/5/31.
 */
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }
}
