package de.ee.optimization;

import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ManagedBean
@SessionScoped
public class NavigationController implements Serializable {
    private static final long serialVersionUID = 1L;


    public String processPage1() {
        return "page";
    }

    public String processPage2() {
        return "page";
    }

}
