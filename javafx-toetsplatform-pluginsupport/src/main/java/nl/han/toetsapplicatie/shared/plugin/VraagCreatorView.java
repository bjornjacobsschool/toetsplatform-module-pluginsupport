package nl.han.toetsapplicatie.shared.plugin;

import javafx.scene.Node;
import nl.han.toetsapplicatie.shared.model.Vraag;

public interface VraagCreatorView {

    Node getView();

    Vraag getVraag();
}
