package modelo;

import ejecutable.Test;

public class Coordenadas
{
    private double x, y;

    public Coordenadas ()
    {

    }

    public Coordenadas (double x, double y)
    {
        this.x=x;
        this.y=y;
    }

    public double getX() 
    {
        return x;
    }

    public void setX(double x) 
    {
        this.x = x;
    }

    public double getY() 
    {
        return y;
    }

    public void setY(double y) 
    {
        this.y = y;
    }

    // modificacion de metodo toString()
    public String toString()
    {
        return "Coordenada: ("+x+","+y+")";
    }
    
    //Modificacion del metodo equals()
    public boolean equals(Object o)
    {
        Coordenadas otra = (Coordenadas)o;
        return (x==otra.x) && (y==otra.y);
    }

    //Metodo para calcular distancia entre dos puntos
    public double calcularDistancia(Object c)
    {
        Coordenadas comp = (Coordenadas)c;

        double d = Math.sqrt(Math.pow((getX()-comp.getX()),2)+Math.pow((getY()-comp.getY()),2));
        return d;
    }
}
