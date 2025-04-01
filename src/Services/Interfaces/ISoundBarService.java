package Services.Interfaces;

//Serviços/Funcionalidades declarados pela Caixa de Som Portátil
public interface ISoundBarService {
    public boolean toggle();
    public int changeVolume(int amount);
    public String equalize();
    public String controlIntensity();
}
