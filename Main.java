public class Main {
    public static void main(String[] args) {
        //Pruebas de clase Punto:
        Punto punto1 = new Punto();
        Punto punto2 = new Punto(-7,5);
        Punto punto3 = new Punto(punto1);
        Punto punto4 = new Punto(4,-8);

        System.out.println("Los puntos son:\nPunto1: " + punto1 + "\nPunto2: " + punto2 + "\nPunto 3: " + punto3 + "Punto4: " + punto4);
        System.out.println("La coordenada X de punto 1 es: " + punto1.getX());
        System.out.println("La coordenada Y de punto 4 es: " + punto4.getY());
        System.out.println("Los puntos 1 y 3 son iguales?: " + punto1.equals(punto4));
        System.out.println("La distancia entre el punto 2 y el punto 4 es de: " + punto2.distancia(punto4));
        System.out.println("Voy a cambiar la X de punto 3 a x=11");
        punto3.setX(11);
        System.out.println("Los puntos 1 y 3 son iguales?: " + punto1.equals(punto4));

        System.out.println("\n\n");


        //Pruebas de clase Lado:
        Lado lado1 = new Lado(punto1, punto2, "Jotaro");
        Lado lado2 = new Lado(punto3, punto4, "DIO");
        Lado lado3 = new Lado(lado1);

        System.out.println("Los lados son:\nLado1: " + lado1 + "\nLado2: " + lado2 + "\nLado3: " + lado3);
        System.out.println("El punto 1 de lado 1 es: " + lado1.getP1());
        System.out.println("El punto 2 de lado 2 es: " + lado2.getP2());
        System.out.println("El nombre de lado 3 es: " + lado3.getNombre());
        System.out.println("Lado 1 y lado 3 son iguales? " + lado1.equals(lado3));
        System.out.println("Voy a cambiar el <punto 1 de lado 3> a <punto 4> (el que es independiente)");
        System.out.println("Tambien le voy a cambiar el nombre a Josuke xd");
        lado3.setP1(punto4);
        lado3.setNombre("Josuke");
        System.out.println("Lado 1 y lado 3 son iguales? " + lado1.equals(lado3));

        System.out.println("\n\n");


        //Pruebas de clase Recta:
        Recta recta1 = new Recta(lado1);
        Recta recta2 = new Recta(lado2);
        Recta recta3 = new Recta(lado3);

        System.out.println("Las rectas son:\nRecta1: " + recta1 + "\nRecta2: " + recta2 + "\nRecta3: " + recta3);
        //No voy a probar los getters :p

        System.out.println("\n\n");


        //Pruebas de intersecciones:
        System.out.println("La interseccion entre recta1 y recta2 sucede en: " + recta1.interseccion(recta2));
        System.out.println("La interseccion entre recta1 y recta3 sucede en: " + recta1.interseccion(recta3));

        System.out.println("La interseccion entre recta2 y recta1 sucede en: " + recta2.interseccion(recta1));
        System.out.println("La interseccion entre recta2 y recta3 sucede en: " + recta2.interseccion(recta3));

        System.out.println("La interseccion entre recta3 y recta1 sucede en: " + recta3.interseccion(recta1));
        System.out.println("La interseccion entre recta3 y recta2 sucede en: " + recta3.interseccion(recta2));

        System.out.println("Lado 1 y lado 2 intersectan? " + lado1.seIntersecan(lado2));
        System.out.println("Lado 1 y lado 3 intersectan? " + lado1.seIntersecan(lado3));

        System.out.println("Lado 2 y lado 1 intersectan? " + lado2.seIntersecan(lado1));
        System.out.println("Lado 2 y lado 3 intersectan? " + lado2.seIntersecan(lado3));

        System.out.println("Lado 3 y lado 1 intersectan? " + lado3.seIntersecan(lado1));
        System.out.println("Lado 3 y lado 2 intersectan? " + lado3.seIntersecan(lado2));
    }

}
