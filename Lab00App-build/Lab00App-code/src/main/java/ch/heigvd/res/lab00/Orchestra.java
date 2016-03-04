package ch.heigvd.res.lab00;

import java.util.LinkedList;
import java.util.List;

public class Orchestra {
    private LinkedList<IInstrument> instruments = new LinkedList<>();
    public void addInstrument(IInstrument i) {
        instruments.add(i);
    }
    public int getNumberOfInstruments() {
        return instruments.size();
    }
    public List<String> makeMusic() {
        LinkedList<String> music = new LinkedList<>();
        for(IInstrument i : instruments) {
            music.add(i.play());
        }
        return music;
    }
}