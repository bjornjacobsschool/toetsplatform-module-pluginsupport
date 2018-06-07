package nl.han.toetsplatform.module.shared.plugin;

public interface Plugin {


    /** Initializeerd de plugin
     * @param vraagData De data voor het laten zien van de vraag. Wanneer deze nog niet is opgesteld is dit NULL
     * @param gegevenAntwoordData De data die als antwoord is ingevuld. Wanneer er nog antwoord is gegeven is dit NULL
     */
    void initialize(String vraagData, String gegevenAntwoordData);

    AntwoordChecker getChecker();
    AntwoordView getAntwoordView();
    VraagGenerator getVraagGenerator();
    VraagView getVraagView();
    VraagCreatorView getVraagCreatorView();
    NakijkenVIew getNakijkView();
}
