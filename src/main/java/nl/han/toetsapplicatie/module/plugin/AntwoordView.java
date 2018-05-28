package nl.han.toetsapplicatie.module.plugin;

import javafx.scene.Node;

public interface AntwoordView {

    Node getView(String givenAntwoord);

    String getGivenAntwoord();
}
