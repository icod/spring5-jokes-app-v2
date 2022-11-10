package nl.icodavids.norris;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeanProvider {

    @Bean
    public ChuckNorrisQuotes getChuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
