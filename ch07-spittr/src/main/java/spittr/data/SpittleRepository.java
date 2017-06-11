package spittr.data;

import spittr.Spittle;

import java.util.List;

/**
 * Created by Hao HOU on 2017/6/11.
 */
public interface SpittleRepository {
    List<Spittle> findRecentSpittles();
    List<Spittle> findSpittles(long max, int count);
    Spittle findOne(long id);
    void save(Spittle spittle);
}
