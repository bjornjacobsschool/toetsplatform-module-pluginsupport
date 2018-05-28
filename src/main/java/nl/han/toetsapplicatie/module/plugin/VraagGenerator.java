package nl.han.toetsapplicatie.module.plugin;

import nl.han.toetsapplicatie.module.model.Vraag;

public interface VraagGenerator {

    Vraag getVraag(String params);

}
