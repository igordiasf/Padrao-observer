package padroescomportamentais.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotoTest {

    @Test
    void deveNotificarUmMoto() {
        Montadora Montadora = new Montadora(2021, 1, "Honda");
        Moto Moto = new Moto("Fan");
        Moto.matricular(Montadora);
        Montadora.lancarNotas();
        assertEquals("Fan, moto fabricada na Montadora{ano=2021, semestre=1, nomeMontadora='Honda'}", Moto.getUltimaNotificacao());
    }

    @Test
    void deveNotificarMotos() {
        Montadora Montadora = new Montadora(2021, 1,"Honda");
        Moto Fan = new Moto("Fan");
        Moto Titan = new Moto("Titan");
        Fan.matricular(Montadora);
        Titan.matricular(Montadora);
        Montadora.lancarNotas();
        assertEquals("Titan, moto fabricada na Montadora{ano=2021, semestre=1, nomeMontadora='Honda'}", Titan.getUltimaNotificacao());
        assertEquals("Fan, moto fabricada na Montadora{ano=2021, semestre=1, nomeMontadora='Honda'}", Fan.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarMoto() {
        Montadora Montadora = new Montadora(2021, 1, "Honda");
        Moto Moto = new Moto("Fan");
        Montadora.lancarNotas();
        assertEquals(null, Moto.getUltimaNotificacao());
    }

    @Test
    void deveNotificarMotoHonda() {
        Montadora Honda = new Montadora(2021, 1,  "Honda");
        Montadora Yamaha = new Montadora(2021, 1, "Yamaha");
        Moto Fan = new Moto("Fan");
        Moto Titan = new Moto("Titan");
        Fan.matricular(Honda);
        Titan.matricular(Yamaha);
        Honda.lancarNotas();
        assertEquals("Fan, moto fabricada na Montadora{ano=2021, semestre=1, nomeMontadora='Honda'}", Fan.getUltimaNotificacao());
        assertEquals(null, Titan.getUltimaNotificacao());
    }
}