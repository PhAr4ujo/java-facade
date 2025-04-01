package Facades;

import Services.RadioService;
import Services.RecordPlayerService;
import Services.SoundBarService;

import java.util.Scanner;


/*Classe Facade que faz a chamada de todos os recursos dos aparelhos, qualquer alteração na lógica de uso dos
mesmos deve ser feita aqui, algo como dar um aviso que está ligando seria feito aqui mesmo, caso o contrário
teriamos que mudar em todos os lugares que usam os serviços
*/
public class Facade {

    public boolean toggle(){
        String device = this.getDevice();
        if (device.equals("Radio")) {
            RadioService radioService = new RadioService();
            return radioService.toggle();
        }else if (device.equals("Toca Discos")) {
            RecordPlayerService recordPlayerService = new RecordPlayerService();
            return recordPlayerService.toggle();
        }else{
            SoundBarService soundBarService = new SoundBarService();
            return soundBarService.toggle();
        }
    }

    public int changeVolume(int amount){
        String device = this.getDevice();
        if (device.equals("Radio")) {
            RadioService radioService = new RadioService();
            return radioService.changeVolume(amount);
        }else if (device.equals("Toca Discos")) {
            RecordPlayerService recordPlayerService = new RecordPlayerService();
            return recordPlayerService.changeVolume(amount);
        }else{
            SoundBarService soundBarService = new SoundBarService();
            return soundBarService.changeVolume(amount);
        }
    }

    public String equalize(){
        String device = this.getDevice();
        if (device.equals("Radio")) {
            RadioService radioService = new RadioService();
            return radioService.equalize();
        }else if (device.equals("Toca Discos")) {
            RecordPlayerService recordPlayerService = new RecordPlayerService();
            return recordPlayerService.equalize();
        }else{
            SoundBarService soundBarService = new SoundBarService();
            return soundBarService.equalize();
        }
    }

    public String controlIntensity(){
        String device = this.getDevice();
        if (device.equals("Radio")) {
            RadioService radioService = new RadioService();
            return radioService.controlIntensity();
        }else if (device.equals("Toca Discos")) {
            RecordPlayerService recordPlayerService = new RecordPlayerService();
            return recordPlayerService.controlIntensity();
        }else{
            SoundBarService soundBarService = new SoundBarService();
            return soundBarService.controlIntensity();
        }
    }


    protected String getDevice(){
        Scanner scanner = new Scanner(System.in);

        String[] devices = {
                "Radio",
                "Toca Discos",
                "Caixa de Som Portátil",
        };

        int counter = 0;
        for (String device : devices) {
            System.out.println("Device " + counter + ": " + device);
            counter++;
        }
        System.out.println("Select a device to operate: ");
        int option = scanner.nextInt();

        while(option < 0 || option >= devices.length){
            System.out.println("Invalid option");
            System.out.println("Select a device to operate: ");
            option = scanner.nextInt();
        }

        return devices[option];
    }
}
