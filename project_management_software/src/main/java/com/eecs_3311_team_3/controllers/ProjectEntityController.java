package com.eecs_3311_team_3.controllers;

import java.io.IOException;

import com.eecs_3311_team_3.App;

import javafx.fxml.FXML;

public class ProjectEntityController {
    @FXML
    private void openProject() throws IOException {
        App.setRoot("Project");
    }
}
