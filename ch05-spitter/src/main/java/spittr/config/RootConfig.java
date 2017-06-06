package spittr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.core.type.filter.RegexPatternTypeFilter;

import javax.sql.DataSource;
import java.util.regex.Pattern;

/**
 * Created by Hao HOU on 2017/6/6.
 */

@Configuration
@Import(DataSource.class)
@ComponentScan(basePackages = {"spittr"}, excludeFilters = {
        @ComponentScan.Filter(type = FilterType.CUSTOM, value = RootConfig.WebPackage.class)
})
public class RootConfig {
    public static class WebPackage extends RegexPatternTypeFilter {
        public WebPackage() {
            super(Pattern.compile("spitter\\.web"));
        }
    }
}
