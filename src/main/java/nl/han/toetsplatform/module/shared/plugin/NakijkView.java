package nl.han.toetsplatform.module.shared.plugin;

import javafx.scene.Node;
import nl.han.toetsplatform.module.shared.plugin.exceptions.NietBerekenbaarException;



/**
 * Is verantwoordelijk voor het generen van een view waar een vraag nagekeken kan worden met eventueel de antwoordchecker
 * Maakt gebruik van antwoordchecker
 */
public interface NakijkView {

    Node getView();

    /**
     * Berekend de behaalbare punten
     * @return Het aantal punten dat de plugin bepaald heeft
     * @throws NietBerekenbaarException wanneer de plugin niet in staat is om het aantal punten
     */
    int getBerekendePunten() throws NietBerekenbaarException;
}
