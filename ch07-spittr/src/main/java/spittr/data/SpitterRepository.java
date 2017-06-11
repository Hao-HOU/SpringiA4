package spittr.data;

import spittr.Spitter;

/**
 * Created by Hao HOU on 2017/6/11.
 */
public interface SpitterRepository {
    Spitter save(Spitter spitter);
    Spitter findByUsername(String username);
}
