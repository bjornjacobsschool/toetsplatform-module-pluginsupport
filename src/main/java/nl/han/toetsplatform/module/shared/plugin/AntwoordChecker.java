package nl.han.toetsplatform.module.shared.plugin;

public interface AntwoordChecker {

    int getPunten(String gegevenAntwoord, String goedAntwoord);
    String getCheckedAntwoord();
    boolean hasCheckedAntwoord();
    boolean checkAntwoord(String gegevenAntwoord, String goedAntwoord);

}
