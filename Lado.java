public class Lado {
    Punto p1, p2;
    String nombre;

    public Lado(Punto extremo1, Punto extremo2, String name) {
        p1 = extremo1;
        p2 = extremo2;
        nombre = name;
    }
    public Lado(Lado l) {
        p1 = l.getP1();
        p2 = l.getP2();
        nombre = l.getNombre();
    }

    public Punto getP1() {
        return p1;
    }
    public Punto getP2() {
        return p2;
    }
    public String getNombre(){
        return nombre;
    }

    public void setP1(Punto newP1) {
        p1 = newP1;
    }
    public void setP2(Punto newP2) {
        p2 = newP2;
    }
    public void setNombre(String newNombre) {
        nombre = newNombre;
    }

    @Override
    public String toString() {
        return nombre + ": [ " + p1 + "--" + p2 + " ]";
    }

    public boolean equals(Lado l) {
        return (
                  (p1.equals(l.getP1()) && p2.equals(l.getP2()))
                  ||
                  (p2.equals(l.getP1()) && p1.equals(l.getP2()))
               ); //la indentacion esta rara pero me resulta mas claro asi uwu
    }

    public boolean seIntersecan(Lado l) {
        Recta r1 = new Recta(this);
        Recta r2 = new Recta(l);

        Punto puntoInterseccion = r1.interseccion(r2);

        /**
         * Este if esta medio confuso xd
         * 
         * El primer if dice:
         * Si (x1 esta a la izquierda de x2) y
         *    (la interseccion sucede a la derecha de x1) y
         *    (la interseccion sucede a la izquierda de x2)
         * Entonces: La interseccion sucede entre x1 y x2, es decir, sucede dentro del segmento (lado)
         * 
         * El segundo if dice:
         * Si (x2 esta a la izquierda de x1) y
         *    (la interseccion esta a la derecha de x2) y
         *    (la interseccion esta a la izquierda de x1)
         * Entonces: La interseccion sucede entre x2 y x1, es decir, sucede dentro del segmento (lado)
         * 
         * Si ningun if se cumple, quiere decir que la interseccion no sucede dentro del segmento, entonces parteX es falso
         * 
         * Se repite eso con ambos lados para estar seguros y listop :3
         */

        boolean parte1, parte2;
        if ( (p1.getX() <= p2.getX()) && (puntoInterseccion.getX() >= p1.getX()) && (puntoInterseccion.getX() <= p2.getX()) ) {
            parte1 = true;
        } else
        if ( (p2.getX() <= p1.getX()) && (puntoInterseccion.getX() >= p2.getX()) && (puntoInterseccion.getX() <= p1.getX()) ) {
            parte1 = true;
        } else { parte1 = false; }

        if ((l.getP1().getX() <= l.getP2().getX()) && (puntoInterseccion.getX() >= l.getP1().getX()) && (puntoInterseccion.getX() <= l.getP2().getX())) {
            System.out.println("Hola");
            parte2 = true;
        } else
        if ( (l.getP2().getX() <= l.getP1().getX()) && (puntoInterseccion.getX() >= l.getP2().getX()) && (puntoInterseccion.getX() <= l.getP1().getX()) ) {
            parte2 = true;
        } else { parte2 = false; }
        
        return (parte1 && parte2);
    }
}
