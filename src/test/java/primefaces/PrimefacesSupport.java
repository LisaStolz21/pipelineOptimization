package primefaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PrimefacesSupport {

    public static List<WebElement> findAllRows(final WebElement table) {
        return table.findElements(By.tagName("tr"));
    }

    public static WebElement findDataRow(final WebElement table, final int row) {
        return table.findElements(By.tagName("tr")).get(row);
    }

    public static WebElement findHeaderRow(final WebElement table) {
        return findDataRow(table, 0);
    }

    public static List<WebElement> findCellsOfDataRow(final WebElement row) {
        return row.findElements(By.tagName("td"));
    }

    public static WebElement findRowByValueAndCellNumber(final WebElement table, final String value,
                                                         final int cellNumber) {
        final List<WebElement> dataRows = findAllRows(table);
        dataRows.remove(0);
        for (final WebElement row : dataRows) {
            final WebElement cell = findCellsOfDataRow(row).get(cellNumber);
            if (cell.getText().equals(value)) {
                return row;
            }
        }
        return null;
    }

    public static WebElement findSelectOneMenuAndSelectValue(final WebElement cell, final String value,
                                                             final WebDriver driver) {
        final WebElement selectOneMenu = cell.findElement(By.className("ui-selectonemenu"));
        if (selectOneMenu.isEnabled()) {
            selectElementSelectOneMenu(driver, selectOneMenu, value);
        }
        return null;
    }

    public static void selectElementSelectOneMenu(final WebDriver driver, final WebElement selectOneMenu,
                                                  final String valueToSelect) {

        final WebElement selectOneMenuPanel = driver.findElement(By.id(selectOneMenu.getAttribute("id") + "_panel"));
        click(driver, selectOneMenu, selectOneMenuPanel);
        final List<WebElement> selectItems = selectOneMenuPanel.findElements(By.tagName("li"));
        for (final WebElement element : selectItems) {
            if (element.getText().equals(valueToSelect)) {
                click(driver, element, null);
            }
        }
    }

    public static void click(final WebDriver driver, final WebElement elementToClick,
                             final WebElement elementToWaitFor) {
        elementToClick.click();
        if (elementToWaitFor != null) {
            final WebDriverWait webDriverWait = new WebDriverWait(driver, 1);
            webDriverWait.until(ExpectedConditions.visibilityOf(elementToWaitFor));

        }
    }
}
