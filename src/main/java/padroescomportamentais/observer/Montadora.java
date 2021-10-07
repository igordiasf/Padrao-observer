package padroescomportamentais.observer;

import java.util.Observable;

public class Montadora extends Observable {

    private Integer ano;
    private Integer semestre;
    private String nomeMontadora;

    public Montadora(Integer ano, Integer semestre, String nomeMontadora) {
        this.ano = ano;
        this.semestre = semestre;
        this.nomeMontadora = nomeMontadora;
    }

    public void lancarNotas() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Montadora{" +
                "ano=" + ano +
                ", semestre=" + semestre +
                ", nomeMontadora='" + nomeMontadora + '\'' +
                '}';
    }
}
