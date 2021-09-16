package de.ee.optimization;

import javax.faces.annotation.ManagedProperty;
import javax.inject.Named;
import java.io.Serializable;

@Named
public class NavigationController implements Serializable {
    @ManagedProperty(value = "#{param.pageId}")
    private String pageId;

    public String showPage() {
        if (pageId == null) {
            return "home";
        }

        if (pageId.equals("1")) {
            return "gamesOverviewPage";
        } else if (pageId.equals("2")) {
            return "engineKnowledgePage";
        } else {
            return "home";
        }
    }
}
