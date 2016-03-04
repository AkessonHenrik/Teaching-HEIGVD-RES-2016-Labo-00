package ch.heigvd.res.lab00;

public class Flute implements IInstrument {
    public int getSoundVolume() {
        return 1;
    }

    public String getColor() {
        return "brown";
    }
    public String play() {
        return "trilili";
    }
}