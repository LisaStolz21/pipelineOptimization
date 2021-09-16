package primefaces;

import de.ee.optimization.game.entity.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GamesSupport {

    public static void selectPlatform(final WebDriver driver, final WebElement table, final String game,
                                      final Platform platform) {
        final WebElement row = PrimefacesSupport.findRowByValueAndCellNumber(table, game, 0);
        final WebElement platformCell = PrimefacesSupport.findCellsOfDataRow(row).get(2);
        PrimefacesSupport.findSelectOneMenuAndSelectValue(platformCell, platform.getName(), driver);
    }
}
