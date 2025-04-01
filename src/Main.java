import Facades.Facade;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Facade facade = new Facade();
            //A classe Main está sendo como uma Classe "Client" que consome os recurso que o FACADE proporciona
            //Chamadas para testar todas as funcionalidades atráves do Facade

            facade.toggle();
            facade.changeVolume(7); // Para ver as outras interações na mudança de volume basta mudar o parâmetro
            facade.equalize();
            facade.controlIntensity();
        }
    }
