package Services;

import Services.Interfaces.IRecordPlayerService;
import Models.SoundBar;

import java.util.Scanner;

//Serviços/Funcionalidades oferecidas/implementadas pela Caixa de Som portátil
public class SoundBarService implements IRecordPlayerService {
    SoundBar model;

    public SoundBarService(){
        this.model = new SoundBar();
    }

    @Override
    public boolean toggle() {
        if (!this.model.isIs_on()) {
            this.model.setIs_on(true);
            this.model.setVolume(6);
            System.out.println("Sound Bar is: " +  (this.model.isIs_on() ? "on" : "off") + " on volume : " + this.model.getVolume());

        }else {
            this.model.setIs_on(false);
        }

        return this.model.isIs_on();
    }

    @Override
    public int changeVolume(int amount) {
        if (this.model.getVolume() + amount >= 10) {
            System.out.println("Volume is already on the maximum volume of 10");
            this.model.setVolume(10);
            return this.model.getVolume();
        }else if (this.model.getVolume() + amount <= 0) {
            System.out.println("Volume is already on the minimum volume of 0");
            this.model.setVolume(0);
            return this.model.getVolume();
        }

        this.model.setVolume(this.model.getVolume() + amount);

        if (this.model.getVolume() >= 7) {
            System.out.println("Volume reached the volume 7");
        }
        System.out.println("Sound Bar is on volume: " + this.model.getVolume());
        return this.model.getVolume();
    }

    @Override
    public String equalize() {
        Scanner scan  = new Scanner(System.in);
        String[] options = {
                "Rock",
                "Pop",
                "Samba",
        };


        int option = 0;

        while (true) {
            int counter = 0;
            for (String music : options) {
                System.out.println(counter + " - " + music);
                counter++;
            }

            System.out.println("Enter option: ");
            option = scan.nextInt();

            if (option < 0 || option >= options.length) {
                System.out.println("Invalid option");
            }else{
                break;
            }
        }

        this.model.setMusic_name(options[option]);
        System.out.println("Sound Bar is on: " + this.model.getMusic_name());
        return this.model.getMusic_name();
    }

    public String controlIntensity() {
        String[] dials = {
                "Grave",
                "Médio",
                "Agudo",
        };


        int option = 0;
        Scanner scan  = new Scanner(System.in);

        while (true) {
            int counter = 0;
            for (String dial : dials) {
                System.out.println(counter + " - " + dial);
                counter++;
            }

            System.out.println("Enter option: ");
            option = scan.nextInt();

            if (option < 0 || option >= dials.length) {
                System.out.println("Invalid option");

            }else{
                break;
            }

        }

        System.out.println("Enter control intensity: ");
        int intensity = scan.nextInt();
        System.out.println("Sound Bar: " + dials[option] + "-" + intensity + "%");
        return "Sound Bar: " + dials[option] + "-" + intensity + "%";
    }
}
