package nl.han.toetsplatform.module.shared.plugin;

import javafx.scene.Node;


/**
 * Is verantwoordelijk voor het opstellen/ aanpassen van een vraag
 */
public interface VraagCreatorView {

    Node getView();


    /**
     * @return Door de gebruiker opgestelde vraag.
     */
    String getQuestionData();

}
