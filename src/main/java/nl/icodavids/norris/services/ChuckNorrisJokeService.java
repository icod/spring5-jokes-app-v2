package nl.icodavids.norris.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokeService implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
