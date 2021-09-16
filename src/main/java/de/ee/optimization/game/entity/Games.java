package de.ee.optimization.game.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "games")
@NamedQueries({@NamedQuery(name = Games.NQ_FIND_ALL_GAMES, query = "SELECT vg FROM Games vg")})
public class Games implements Serializable {

    public static final String NQ_FIND_ALL_GAMES = "game.findAll";

    @Id
    @Column(name = "id", length = 50, columnDefinition = "VARCHAR(50)")
    private String id;

    @Column(name = "name", length = 50, columnDefinition = "VARCHAR(50)")
    private String name;

    @Column(name = "genre", nullable = false, columnDefinition = "VARCHAR(25)")
    @Enumerated(EnumType.STRING)
    private GamesGenre gamesGenre;

    @Temporal(TemporalType.DATE)
    @Column(name = "release", nullable = false)
    private Date release;

    @Column(name = "platform", nullable = false, columnDefinition = "VARCHAR(25)")
    @Enumerated(EnumType.STRING)
    private PlatformPackage platform;

    @Column(name = "developer", length = 25, columnDefinition = "VARCHAR(25)")
    private String developer;

    @Column(name = "engine", length = 25, columnDefinition = "VARCHAR(25)")
    private String engine;

    public void setId(final String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public GamesGenre getGamesGenre() {
        return gamesGenre;
    }

    public void setGamesGenre(final GamesGenre gamesGenre) {
        this.gamesGenre = gamesGenre;
    }

    public Date getRelease() {
        return release;
    }

    public void setRelease(final Date release) {
        this.release = release;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(final String developer) {
        this.developer = developer;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(final String engine) {
        this.engine = engine;
    }

    public PlatformPackage getPlatform() {
        return platform;
    }

    public void setPlatform(final PlatformPackage platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "Games{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gamesGenre=" + gamesGenre +
                ", release=" + release +
                ", developer='" + developer + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }


}
