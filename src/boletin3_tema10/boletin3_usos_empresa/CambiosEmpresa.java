package boletin3_tema10.boletin3_usos_empresa;

import boletin3_tema10.Programador;

public interface CambiosEmpresa {
    /**
     * Metodo para cambiar la tecnologia, hace un equals a traves de la clase tecnologia, si es la misma, sale mensaje correspondiente
     * si no, realiza el cambio
     * @param tecnologia
     */
    void cambioTecnologia(Programador.Tecnologia tecnologia);

    /**
     * Metodo para cambiar el portatil, hace un equals a traves de el numero de serie, si es el mismo, no se puede cambiar,
     * pero si
     * @param portatil
     */
    void cambiarPortatil(Portatil portatil);
}