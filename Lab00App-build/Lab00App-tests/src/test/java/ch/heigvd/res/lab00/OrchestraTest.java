package ch.heigvd.res.lab00;

import org.junit.*;

import static org.junit.Assert.assertNotNull;

public class OrchestraTest {
    @Test
    public void thereShouldBeAnOrchestraClass() {
        Orchestra orchestra = new Orchestra();
        assertNotNull(orchestra);
    }

    @Test
    public void itShouldBePossibleToAddAnInstrument() {
        Orchestra orchestra = new Orchestra();
        orchestra.addInstrument(new Flute());
        Assert.assertEquals(orchestra.size(), 1);
    }

    @Test
    public void itShouldBePossibleToPlayAllInstruments() {
        Orchestra orchestra = new Orchestra();
        orchestra.addInstrument(new Flute());
        orchestra.addInstrument(new Trumpet());
        orchestra.addInstrument(new Drum());
        Assert.assertEquals("fuuuu pouet badum pss", orchestra.play());
    }
}