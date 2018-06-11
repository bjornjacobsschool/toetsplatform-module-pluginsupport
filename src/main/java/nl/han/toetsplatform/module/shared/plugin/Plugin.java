package nl.han.toetsplatform.module.shared.plugin;

public interface Plugin {

    /**
     * @param vraagData De vraagdata
     * @param gegevenAntwoord Het gegeven antwoord
     * @param nakijkModel Het nakijkmodel
     * @param maxPunten Het maximaal aantal punten dat je voor de vraag kunt krijgen
     * @return een object waarmee de vraag nagekijken kan worden
     */
    AntwoordNakijker getAntwoordNakijker(String vraagData, String gegevenAntwoord, String nakijkModel, int maxPunten);

    /**
     * @return de antwoord view
     */
    AntwoordView getAntwoordView();

    /**
     * @param gegevenAntwoord Het gegeven antwoord
     * @return de antwoord view
     */
    AntwoordView getAntwoordView(String vraagData, String gegevenAntwoord);

    /**
     * @param params De parameters die bepalen hoe een vraag eruit ziet
     * @return Een object dat een vraag kan genereren
     */
    VraagGenerator getVraagGenerator(String params);

    /**
     * @param vraagData De vraag data
     * @return De vraag view
     */
    VraagView getVraagView(String vraagData);

    /**
     * @return een view waarmee een vraag opgesteld kan worden
     */
    VraagCreatorView getVraagCreatorView();

    /**
     * @param vraagData Al bestaande vraag data
     * @return een view waarmee een vraag opgesteld kan worden
     */
    VraagCreatorView getVraagCreatorView(String vraagData);

    /**
     * @param vraagData De vraagdata
     * @param gegevenAntwoord Het gegeven antwoord
     * @param nakijkModel Het nakijkmodel
     * @return een view die gebruikt word om een vraag na te kijken
     */
    NakijkView getNakijkView(String vraagData, String gegevenAntwoord, String nakijkModel, int maxPunten);
}
