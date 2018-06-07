package nl.han.toetsplatform.module.shared.plugin;

import nl.han.toetsplatform.module.shared.plugin.exceptions.NietBerekenbaarException;


/**
 * Is verantwoordelijk voor het automatisch nakjken van een vraag zonder een UI
 */
public interface AntwoordNakijker {


    /** voor het ophalen van de punten van een vraag
     * @return integer van het aantal punten
     */
    int getPunten();

    /**
     * Haal het nagekeken antwoord op, als het antwoord nagekeken wordt door het bijvoorbeeld te aceren, kan het hier opgehaald worden
     * @return String wat een JSON object kan representeren van het nagekeken antwoord
     */
    String getCheckedAntwoord();

    /**
     * Hiermee kan gecheckt worden of er een nagekeken antwoord is opgeslagen, zodat hij vervolgens opgehaald kan worden
     * @return True als er een antwoord is, False als het niet zo is.
     */
    boolean hasCheckedAntwoord();

    /**
     * Deze call is voor het nakijken van een antwoord. Hierbij wordt er een boolean teruggegeven of het antwoord goed is of niet.
     * @param gegevenAntwoord Dit is het gegeven antwoord object als JSON string van de toetsuitvoerder
     * @param goedAntwoord Dit is het correcte antwoord waaraan het gegeven antwoord moet voldoen, dit kan optioneel zijn.
     * @return True als de vraag goed is beantwoord, False als hij fout is beantwoord.
     */
    boolean checkAntwoord(String gegevenAntwoord, String goedAntwoord);

}