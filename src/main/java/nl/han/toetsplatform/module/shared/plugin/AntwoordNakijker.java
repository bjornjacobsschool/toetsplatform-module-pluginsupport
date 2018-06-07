package nl.han.toetsplatform.module.shared.plugin;

import nl.han.toetsplatform.module.shared.plugin.exceptions.NietBerekenbaarException;


/**
 * Is verantwoordelijk voor het automatisch nakjken van een vraag zonder een UI
 */
public interface AntwoordNakijker {

    /**
     * @return de berekende punten
     * @throws NietBerekenbaarException
     */
    int getBerekendePunten()  throws NietBerekenbaarException;
}