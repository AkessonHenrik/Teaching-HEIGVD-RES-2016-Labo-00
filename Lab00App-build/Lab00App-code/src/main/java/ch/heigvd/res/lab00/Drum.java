package ch.heigvd.res.lab00;

public class Drum implements IInstrument {

    @Override
    public int getSoundVolume() {
        return 3;
    }

    @Override
    public String getColor() {
        return "gray";
    }

    @Override
    public String play() {
        return "badum pss";
    }
}