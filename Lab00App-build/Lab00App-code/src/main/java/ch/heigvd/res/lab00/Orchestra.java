package ch.heigvd.res.lab00;

import java.util.LinkedList;

public class Orchestra {
    private LinkedList<IInstrument> instruments = new LinkedList<>();
    public void addInstrument(IInstrument i) {
        instruments.add(i);
    }
    public int size() {
        return instruments.size();
    }
    public String play() {
        String music = "";
        for(IInstrument i : instruments) {
            music += i.play() + (i == instruments.getLast() ? "" : " ");
        }
        return music;
    }
}