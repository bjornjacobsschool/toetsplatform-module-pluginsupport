package nl.han.toetsplatform.module.shared.plugin;

import javafx.scene.Node;

/**
 * Is verantwoordelijk voor het maken van een view waar de gebruiker antwoord kan geven
 */
public interface AntwoordView {

    Node getView();

    /**
     * @return Geeft het door de gebruiken gegeven antwoord terug
     */
    String getGivenAntwoord();
}
