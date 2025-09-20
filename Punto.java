public class Punto {
    double cX, cY;

    public Punto(double x, double y) {
        cX = x;
        cY = y;
    }
    public Punto() {
        cX = 0;
        cY = 0;
    }
    public Punto(Punto p) {
        cX = p.getX();
        cY = p.getY();
    }

    public double getX() {
        return cX;
    }
    public double getY() {
        return cY;
    }

    public void setX(double newX) {
        cX = newX;
    }
    public void setY(double newY) {
        cY = newY;
    }

    public double distancia(Punto p) {
        double distancia = Math.sqrt(
                                        Math.pow((p.getX() - cX), 2) +
                                        Math.pow((p.getY() - cY), 2)
                                    ); //Raiz( (x2 - x1)^2 + (y2 - y1)^2 )
        return distancia;
    }

    @Override
    public String toString() {
        return "( " + cX + "," + cY + " )";
    }

    public boolean equals(Punto p) {
        /*
        if ((cX == p.getX()) && (cY == p.gety())) {
            return true;
        } else { return false;}
         */
        return (cX == p.getX()) && (cY == p.getY()); //No sabia que podias hacer eso :o
    }
}
