package nl.han.toetsplatform.module.shared.plugin;

import nl.han.toetsplatform.module.shared.plugin.exceptions.VraagGenereerException;


/**
 * Is verantwoordelijk voor het genereren van een nieuwe vraag
 */
public interface VraagGenerator {


    /**Genereert een vraag.
     * @param params parameters om de gegenereerde vraag te veranderen
     * @return Een gegenereerde vraag
     * @throws VraagGenereerException wanneer er geen vraag gegenereerd kan worden
     */
    String getVraag(String params) throws VraagGenereerException;
}
