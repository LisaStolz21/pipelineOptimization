package de.ee.optimization.game.boundary;

import de.ee.optimization.game.entity.*;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Named
public class GamesController {

    @Inject
    GamesBF gamesBF;

    @Inject
    @Chosen
    LocalDateTime localDateTime;


    private transient List<Games> listedGames;

    private String selectedPlatform;

    @PostConstruct
    public void init() {
        listedGames = gamesBF.findAllGames();
    }

    public List<Games> getGames() {
        return listedGames;
    }

    public String getReleaseDate(final Date releaseDate) {
        return SimpleDateFormat.getDateInstance().format(releaseDate);
    }


    public List<String> getPlatformsString(final PlatformPackage platformPackage) {
        final Set<Platform> platformSet = PlatformMapper.getPlatforms(platformPackage);
        final List<String> listOfPlatforms = new ArrayList<String>();
        for (final Platform platform : platformSet) {

            listOfPlatforms.add(platform.getName());
        }
        return listOfPlatforms;
    }

    public String getSelectedPlatform() {
        return selectedPlatform;
    }

    public void setSelectedPlatform(final String selectedPlatform) {
        this.selectedPlatform = selectedPlatform;
    }


    public String getLocalDateTimeString() {
        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyy_HH'h'mm'm'ss");
        return localDateTime.format(dtf);
    }
}
