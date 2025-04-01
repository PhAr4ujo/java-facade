package Models;

//Entidade de Toca Discos
public class RecordPlayer {
    private int id;
    private String record_name;
    private int volume;
    private boolean is_on;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRecord_name() {
        return record_name;
    }

    public void setRecord_name(String record_name) {
        this.record_name = record_name;
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
