package game;

import org.openqa.selenium.WebDriver;

public class GamesOverviewPageTest {

    protected static WebDriver driver;

    public static GamesPage gamesPage;

//    @Before
//    public void setUp() {
//
//        driver = new ChromeDriver();
//        driver.get(GamesPage.URL);
//        gamesPage = PageFactory.initElements(driver, GamesPage.class);
//    }
//
//    @AfterClass
//    public static void quitDriver() {
//        driver.quit();
//    }
//
//    @Test
//    public void tableTest() throws InterruptedException {
//
//        final WebElement webElementTable = gamesPage.getGamesTable();
//        assertThat(webElementTable, is(notNullValue()));
//        GamesSupport.selectPlatform(driver, webElementTable, "Minecraft", Platform.XBOX);
//        Thread.sleep(1500);
//    }


}
