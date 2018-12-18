package configuraFacil.presentation.controllers;


import configuraFacil.presentation.controllers.SceneManager;
import configuraFacil.business.ConfiguraFacil;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class FabricanteController  {


    ConfiguraFacil cf;

    public void init(ConfiguraFacil cfo) {
        cf = cfo;
    }

    public void handleBtnSair(ActionEvent actionEvent) throws IOException {
        URL url =  getClass().getResource("../views/login.fxml");
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        SceneManager sm = new SceneManager(url, window);
        sm.newScene(-1, cf);
    }

    public void handleBtnConfiguracoes(ActionEvent actionEvent) throws IOException {
        //new presentation
        URL url = getClass().getResource("../views/configuracoesFabricantes.fxml");
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        SceneManager sm = new SceneManager(url, window);
        sm.newScene(5, cf);
    }

    public void handleBtnStock(ActionEvent actionEvent) throws IOException {
        //new presentation
        URL url = getClass().getResource("../views/stockFabrica.fxml");
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        SceneManager sm = new SceneManager(url, window);
        sm.newScene(8, cf);
    }
}