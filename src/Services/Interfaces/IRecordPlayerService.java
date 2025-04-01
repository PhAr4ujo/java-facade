package Services.Interfaces;

//Serviços/Funcionalidades declarados pelo Toca Discos
public interface IRecordPlayerService {
    public boolean toggle();
    public int changeVolume(int amount);
    public String equalize();
    public String controlIntensity();
}
