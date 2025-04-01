package Services.Interfaces;

//Serviços/Funcionalidades declarados pelo Radio
public interface IRadioService {
    public boolean toggle();
    public int changeVolume(int amount);
    public String equalize();
    public String controlIntensity();
}
