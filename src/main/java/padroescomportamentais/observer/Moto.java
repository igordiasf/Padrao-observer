package padroescomportamentais.observer;

import java.util.Observable;
import java.util.Observer;

public class Moto implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Moto(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void matricular(Montadora Montadora) {
        Montadora.addObserver(this);
    }

    public void update(Observable Montadora, Object arg1) {
        this.ultimaNotificacao = this.nome + ", moto fabricada na " + Montadora.toString();
        // System.out.println(this.ultimaNotificacao);
    }
}
