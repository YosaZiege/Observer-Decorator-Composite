package com.school.designpatterns.decorator;

import com.school.designpatterns.decorator.composant.Boisson;
import com.school.designpatterns.decorator.composant.Espresso;
import com.school.designpatterns.decorator.composant.Sumatra;
import com.school.designpatterns.decorator.decorateur.Caramel;
import com.school.designpatterns.decorator.decorateur.Chantilly;
import com.school.designpatterns.decorator.decorateur.Chocolat;
import com.school.designpatterns.decorator.decorateur.Noisette;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecorateurTest {

    @Test
    void composantSimple() {
        Boisson sumatra = new Sumatra();
        assertEquals("Sumatra", sumatra.getDescription());
        assertEquals(6.0, sumatra.cout(), 0.0001);
    }

    @Test
    void boissonAvecUnDecorateur() {
        Boisson b = new Chocolat(new Sumatra());
        assertEquals("Sumatra au chocolat", b.getDescription());
        assertEquals(7.2, b.cout(), 0.0001);
    }

    @Test
    void boissonAvecPlusieursDecorateurs() {
        Boisson b = new Noisette(new Chocolat(new Caramel(new Sumatra())));
        assertEquals("Sumatra au caramel au chocolat à la noisette", b.getDescription());
        assertEquals(8.5, b.cout(), 0.0001);
    }

    @Test
    void doubleSupplement() {
        Boisson b = new Chocolat(new Chocolat(new Sumatra()));
        assertEquals("Sumatra au chocolat au chocolat", b.getDescription());
        assertEquals(8.4, b.cout(), 0.0001);
    }

    @Test
    void espressoAvecCaramelEtChantilly() {
        Boisson b = new Chantilly(new Caramel(new Espresso()));
        assertEquals("Espresso au caramel à la chantilly", b.getDescription());
        assertEquals(9.3, b.cout(), 0.0001);
    }
}
