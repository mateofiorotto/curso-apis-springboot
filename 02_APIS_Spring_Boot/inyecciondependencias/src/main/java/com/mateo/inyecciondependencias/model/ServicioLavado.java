package com.mateo.inyecciondependencias.model;

public class ServicioLavado {
    //Generar relacion - dependencia entre las clases.
    private ServicioNormal servNorm;
    private ServicioPremium servPrem;

    //X CONSTRUCTOR. Recibimos un servicio normal y un servicio premium.
    // Estan creados pero no instanciados. No busca usar new todo el tiempo, sino
    // recibir objetos y reasignarlos segun necesite.
    public ServicioLavado(ServicioNormal servNorm, ServicioPremium servPrem) {
        this.servNorm = servNorm;
        this.servPrem = servPrem;
    }

    //X SETTER. IntelliJ lo hace por nosotros.
    public void setServNorm(ServicioNormal servNorm) {
        this.servNorm = servNorm;
    }

    public void setServPrem(ServicioPremium servPrem) {
        this.servPrem = servPrem;
    }
}
