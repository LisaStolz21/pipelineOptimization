package de.ee.optimization.game.control;

import de.ee.optimization.game.entity.Games;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class GamesRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Games> findAllGames() {
        final TypedQuery<Games> namedQuery = entityManager.createNamedQuery(Games.NQ_FIND_ALL_GAMES, Games.class);
        return namedQuery.getResultList();
    }
}
