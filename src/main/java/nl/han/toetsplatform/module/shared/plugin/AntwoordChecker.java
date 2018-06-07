package nl.han.toetsplatform.module.shared.plugin;

import nl.han.toetsplatform.module.shared.plugin.exceptions.NietBerekenbaarException;


/**
 * Is verantwoordelijk voor het automatisch nakjken van een vraag zonder een UI
 */
public interface AntwoordChecker {


    /**
     * @param nakijkModel het nakijkmodel van de vraag
     * @param maxPunten de maximaal behaalbare punten
     * @return
     * @throws NietBerekenbaarException
     */
    int getBerekendePunten(String nakijkModel, int maxPunten)  throws NietBerekenbaarException;
}