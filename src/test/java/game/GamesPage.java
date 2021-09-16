package game;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GamesPage {

    private final WebDriver driver;

    public static final String URL = "http://localhost:8080/pipelineOptimization/jsf/pages/gamesOverviewPage" +
            ".jsf";
    public static final String GAMES_FORM = "gamesForm:";
    public static final String GAMES_TABLE = "gamesTable:";

    public GamesPage(final WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = GAMES_FORM + "gamesTable")
    private WebElement gamesTable;

    @FindBy(id = GAMES_FORM + GAMES_TABLE + "selectPlatformMenu")
    private WebElement platformSelection;

    public WebElement getGamesTable() {
        return gamesTable;
    }
}
