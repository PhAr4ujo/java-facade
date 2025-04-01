package Services;

import Models.Radio;
import Services.Interfaces.IRadioService;

import java.util.Scanner;

//Serviços/Funcionalidades oferecidas/implementadas pelo Radio
public class RadioService implements IRadioService {
    Radio model;

    public RadioService() {
        this.model = new Radio();
    }

    @Override
    public boolean toggle() {
        if (!this.model.isIs_on()) {
            this.model.setIs_on(true);
            this.model.setVolume(3);
            System.out.println("Radio is: " +  (this.model.isIs_on() ? "on" : "off") + " on volume : " + this.model.getVolume());

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
        System.out.println("Radio is on volume: " + this.model.getVolume());
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

            if (option < 0 || option > options.length) {
                System.out.println("Invalid option");
            }else{
                break;
            }
        }

        this.model.setBand(options[option]);
        System.out.println("Radio is on: " + this.model.getBand());
        return this.model.getBand();
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
        System.out.println("Radio: " + dials[option] + "-" + intensity + "%");
        return "Radio: " + dials[option] + "-" + intensity + "%";
    }
}
