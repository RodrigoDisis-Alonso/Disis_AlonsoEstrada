//package VENTA;

import java.util.*;

public class EMPLEADO
{
    public static void main (String[] args)
    {
        Scanner entrada = new Scanner (System.in);
        int horas;
        int precio;
        int sueldo;

        System.out.println("Cuantas horas trabajo al dia");
        horas = entrada.nextInt();
        System.out.println("Cual es el precio por hora trabajada");
        precio = entrada.nextInt();

        sueldo = horas*precio;

        System.out.println("El sueldo del trabajador es:" +sueldo);
    }
}