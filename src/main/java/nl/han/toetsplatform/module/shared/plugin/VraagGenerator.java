package nl.han.toetsplatform.module.shared.plugin;

import nl.han.toetsplatform.module.shared.model.Vraag;

public interface VraagGenerator {

    Vraag getVraag(String params);

}
