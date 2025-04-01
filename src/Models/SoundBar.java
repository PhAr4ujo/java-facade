package Models;

//Entidade de SoundBar
public class SoundBar {
    private int id;
    private String music_name;
    private int volume;
    private boolean is_on;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMusic_name() {
        return music_name;
    }

    public void setMusic_name(String music_name) {
        this.music_name = music_name;
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
