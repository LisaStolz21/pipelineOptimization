package de.ee.optimization.game.boundary;

import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class Controller implements Serializable {

    private String text;
    private int firstOperand;
    private int secondOperand;
    private int total;

    public void calculateTotal(final ActionEvent actionEvent) {
        total = firstOperand + secondOperand;

    }

    public int getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(final int firstOperand) {
        this.firstOperand = firstOperand;
    }

    public int getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(final int secondOperand) {
        this.secondOperand = secondOperand;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(final int total) {
        this.total = total;
    }

    public String getText() {
        return text;
    }

    public void setText(final String text) {
        this.text = text;
    }


}
