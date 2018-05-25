package nl.han.toetsapplicatie.shared.plugin;

import javafx.scene.Node;

public interface AntwoordView {

    Node getView(String givenAntwoord);

    String getGivenAntwoord();
}
