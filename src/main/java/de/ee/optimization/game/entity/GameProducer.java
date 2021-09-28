package de.ee.optimization.game.entity;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import java.time.LocalDateTime;

@RequestScoped
public class GameProducer {

    private final LocalDateTime localDateTime = LocalDateTime.now();

    @Produces
    @Chosen
    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

}
