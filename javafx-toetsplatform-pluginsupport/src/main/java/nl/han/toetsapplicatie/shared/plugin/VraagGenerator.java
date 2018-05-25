package nl.han.toetsapplicatie.shared.plugin;

import nl.han.toetsapplicatie.shared.model.Vraag;

public interface VraagGenerator {

    Vraag getVraag(String params);
}
