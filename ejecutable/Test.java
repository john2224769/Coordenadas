package ejecutable;

import modelo.Coordenadas;

public class Test
{
    public static void main(String[] args) 
    {
        Coordenadas c1 = new Coordenadas();
        Coordenadas c2 = new Coordenadas(1.3, 5.3);
        Coordenadas c3 = c1;
        Coordenadas c4 = c2;

        System.out.println(c1+"\n");
        System.out.println(c2+"\n");
        System.out.println(c3+"\n");
        System.out.println(c4+"\n");

        System.out.println(c1.equals(c3) ? "Las coordenadas son iguales" : "Las coordenadas son distintas");

    }

}