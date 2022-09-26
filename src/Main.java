import herencia.SmartPhone;
import herencia.SmartWatch;

public class Main {
    public static void main(String[] args) {


        SmartWatch smartDevice = new SmartWatch("android 5", "+666 66 66 66", 14, 10, "sintética");

        System.out.println(smartDevice.showHour());
        System.out.println(smartDevice.getSistemaOperativo());
        System.out.println(smartDevice.getNumeroTelefono());
        smartDevice.ajustaCorrea();
        System.out.println(smartDevice.getTensionCorrea());
        System.out.println(smartDevice.getPantallaToString());

        SmartPhone smartPhone = new SmartPhone("android 5", "+6555 55 55 55", 5, 9);

        System.out.println(smartPhone.showHour());
        System.out.println(smartPhone.getSistemaOperativo());
        System.out.println(smartPhone.getNumeroTelefono());
        smartPhone.borrarFoto();
        smartPhone.borrarFoto();
        smartPhone.hacerFoto();
        System.out.println(smartPhone.getPantallaToString());


    }
}