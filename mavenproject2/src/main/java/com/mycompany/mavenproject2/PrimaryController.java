package com.mycompany.mavenproject2;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    public void test(){
        int a=20;
        int b=6;
    }
}
