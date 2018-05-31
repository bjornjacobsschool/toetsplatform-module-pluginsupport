package nl.han.toetsplatform.module.shared.plugin;

import javafx.scene.Node;

public interface AntwoordView {

    Node getView(String givenAntwoord);

    String getGivenAntwoord();
}
