package nl.han.toetsplatform.module.shared.plugin;

import nl.han.toetsplatform.module.shared.plugin.exceptions.VraagGenereerException;


/**
 * Is verantwoordelijk voor het genereren van een nieuwe vraag
 */
public interface VraagGenerator {

    /**Genereert een vraag.
     * @return Een gegenereerde vraag
     * @throws VraagGenereerException wanneer er geen vraag gegenereerd kan worden
     */
    String getVraag() throws VraagGenereerException;
}
