package nl.han.toetsapplicatie.shared.plugin;

import nl.han.toetsapplicatie.shared.model.Vraag;

public interface Plugin {

    void initialize(String data);

    AntwoordChecker getChecker();
    AntwoordView getAntwoordView();
    VraagGenerator getVraagGenerator();
    VraagView getVraagView();
    VraagCreatorView getVraagCreatorView();
}
