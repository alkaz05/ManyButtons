package com.example.manybuttons;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.util.Random;

public class HelloController {
   @FXML
    AnchorPane rootPane;

   public void initialize(){
       Random random = new Random();
       for (int i = 0; i < 10; i++) {
           Button but = new Button();
           rootPane.getChildren().add(but);
           int x = random.nextInt((int) rootPane.getPrefWidth());
           int y = random.nextInt((int) rootPane.getPrefHeight());
           but.setLayoutX(x);
           but.setLayoutY(y);
           String st = "кнопка "+i;
           but.setOnAction(actionEvent -> onButClick(but, st));

       }
   }

   public void onButClick(Button but, String s){
       System.out.println(s);
   }
}