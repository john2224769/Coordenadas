package modelo;

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

    public String toString()
    {
        return "Coordenada: ("+x+","+y+")";
    }
    
    public boolean equals(Object o)
    {
        Coordenadas otra = (Coordenadas)o;
        return (x==otra.x) && (y==otra.y);
    }
}
