/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.view;

import app.model.TableManagement;
import javafx.fxml.FXML;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebEvent;
import javafx.scene.web.WebView;
import model.logic.Interpreter;

/**
 *
 * @author milder
 */
public class RootLayoutController {
    
    @FXML
    private TextField commandField;
    
    @FXML
    private WebView webView;

    public RootLayoutController() {
    }
    
    @FXML
    private void initialize() {
        final WebView browser = new WebView();
        final WebEngine webEngine = browser.getEngine();

        browser.getEngine().setOnAlert((WebEvent<String> wEvent) -> {
          System.out.println("Alert Event  -  Message:  " + wEvent.getData());
        });

        webEngine.load("http://www.facebook.com");
    }
    
    @FXML
    private void runCommand () {
        Interpreter.runCommand("create table usuario (id int, edad int)");
    }
}
