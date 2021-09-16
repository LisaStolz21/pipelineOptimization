package de.ee.optimization.game.boundary;

import de.ee.optimization.game.control.GamesRepository;
import de.ee.optimization.game.entity.Games;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class GamesBF {

    @Inject
    private GamesRepository gamesRepository;


    public List<Games> findAllGames() {
        return gamesRepository.findAllGames();
    }
}
