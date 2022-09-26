package herencia;

import clases.SmartDevice;

public class SmartPhone extends SmartDevice {
    int resolucionCamara = 50;
    int fotosGuardadas = 0;

    public SmartPhone(String sistemaOperativo, String numeroTelefono, int heightPantalla, int widthPantalla)
    {
        super(sistemaOperativo, numeroTelefono, heightPantalla, widthPantalla);

    }

    public void hacerFoto()
    {
        this.fotosGuardadas ++;
    }
    public void borrarFoto()
    {
        if(this.fotosGuardadas > 0)
            this.fotosGuardadas --;
    }
    public int getFotosGuardadas()
    {
        return this.fotosGuardadas;
    }
    public int getResolucionCamara()
    {
        return this.resolucionCamara;
    }

}
