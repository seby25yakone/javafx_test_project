package org.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private Circle myCircle;
    @FXML
    private ColorPicker cp;
    private Color c;
    private double x;
    private double y;

    public void up(ActionEvent e){
        myCircle.setCenterY(y-=10);
    }
    public void down(ActionEvent e){
        myCircle.setCenterY(y+=10);
    }
    public void right(ActionEvent e){
        myCircle.setCenterX(x+=10);
    }
    public void left(ActionEvent e){
        myCircle.setCenterX(x-=10);
    }

    public void setColor(ActionEvent e){
        c = cp.getValue();
    }
    public void setCircleColor(ActionEvent e){
        myCircle.setFill(c);
    }

}