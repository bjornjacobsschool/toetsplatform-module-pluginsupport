package nl.han.toetsplatform.module.shared.model;

import java.util.List;

@Deprecated
public class Toets {

    private int id;
    private String naam;
    private List<Vraag> vragen;

    public List<Vraag> getVragen() {
        return vragen;
    }

    public void setVragen(List<Vraag> vragen) {
        this.vragen = vragen;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
