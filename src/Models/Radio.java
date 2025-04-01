package Models;

//Entidade de Radio
public class Radio {
    private int id;
    private String band;
    private int volume;
    private boolean is_on;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isIs_on() {
        return is_on;
    }

    public void setIs_on(boolean is_on) {
        this.is_on = is_on;
    }
}
