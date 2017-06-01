package soundsystem.properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Hao HOU on 2017/5/31.
 */
@Configuration
public class CDPlayerConfig {
    @Bean
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }
    @Bean
    public CDPlayer cdPlayer() {
        return new CDPlayer(compactDisc());
    }
}
