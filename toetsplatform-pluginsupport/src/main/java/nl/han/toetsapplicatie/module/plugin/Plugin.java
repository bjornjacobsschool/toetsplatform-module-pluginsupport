package nl.han.toetsapplicatie.module.plugin;

public interface Plugin {

    void initialize(String data);

    AntwoordChecker getChecker();
    AntwoordView getAntwoordView();
    VraagGenerator getVraagGenerator();
    VraagView getVraagView();
    VraagCreatorView getVraagCreatorView();
}
