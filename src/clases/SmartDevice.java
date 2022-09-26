package clases;

import java.time.LocalDateTime;

public abstract class SmartDevice {
    String sistemaOperativo = new String();
    String numeroTelefono = new String();
    Pantalla pantalla = new Pantalla();

    public SmartDevice(String sistemaOperativo, String numeroTelefono, int heightPantalla, int widthPantalla)
    {
        setPantalla(heightPantalla, widthPantalla);
        this.numeroTelefono = numeroTelefono;
        this.sistemaOperativo = sistemaOperativo;

    }

    public void setPantalla(int height, int width) {
        this.pantalla = new Pantalla(width, height);
    }

    public String getPantallaToString() {
        return pantalla.height + " * " + pantalla.width;
    }

    public int showHour()
    {
        return LocalDateTime.now().getHour();
    }

    public String getSistemaOperativo()
    {
        return this.sistemaOperativo;
    }
    public String getNumeroTelefono()
    {
        return this.numeroTelefono;
    }
}
