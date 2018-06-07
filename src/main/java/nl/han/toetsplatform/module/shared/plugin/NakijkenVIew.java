package nl.han.toetsplatform.module.shared.plugin;

import nl.han.toetsplatform.module.shared.plugin.exceptions.NietBerekenbaarException;

import javax.xml.soap.Node;

/**
 * Is verantwoordelijk voor het generen van een view waar een vraag nagekeken kan worden met eventueel de antwoordchecker
 * Maakt gebruik van antwoordchecker
 */
public interface NakijkenVIew {

    Node getView();

    /**
     * Berekend de behaalbare punten
     * @return Het aantal punten dat de plugin bepaald heeft
     * @throws NietBerekenbaarException wanneer de plugin niet in staat is om het aantal punten
     */
    int getBerekendePunten() throws NietBerekenbaarException;
}
