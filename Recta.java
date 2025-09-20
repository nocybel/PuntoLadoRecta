public class Recta {
    double a, b, c;

    public Recta(Lado l) { //Este constructor estaba todo revuelto, ya la arregle uwu
        //ax + by + c = 0
        a = l.getP1().getY() - l.getP2().getY();
        b = l.getP2().getX() - l.getP1().getX();
        c = ( l.getP1().getX() * l.getP2().getY() ) - ( l.getP2().getX() * l.getP1().getY() );
    }

    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }

    @Override
    public String toString() {
        return a + "x + " + b + "y + " + c + " = 0";
    }

    public Punto interseccion(Recta r) {
        double a1, b1, c1, a2, b2, c2; //Elementos de las ecuaciones de recta en forma: aX + bY = c
        a1 = a; b1 = b; c1 = -c; //Ecuacion de esta recta
        a2 = r.getA(); b2 = r.getB(); c2 = -(r.getC()); //Ecuacion de recta r

        double D = (a1 * b2) - (b1 * a2);
        double Dx = (c1 * b2) - (b1 * c2);
        double Dy = (a1 * c2) - (c1 * a2);

        double x = Dx / D;
        double y = Dy / D;

        return new Punto(x, y);
    }
}
