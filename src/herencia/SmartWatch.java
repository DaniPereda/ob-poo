package herencia;

import clases.SmartDevice;

public class SmartWatch extends SmartDevice {
    String tipoCorrea = new String();
    int tensionCorrea = 5;

    public SmartWatch(String sistemaOperativo, String numeroTelefono, int heightPantalla, int widthPantalla, String tipoCorrea)
    {
        super(sistemaOperativo, numeroTelefono, heightPantalla, widthPantalla);
        this.tipoCorrea = tipoCorrea;

    }

    public int getTensionCorrea()
    {
        return this.tensionCorrea;
    }

    public void ajustaCorrea()
    {
        this.tensionCorrea ++;
    }
    public void desajustaCorrea()
    {
        this.tensionCorrea --;
    }

}
