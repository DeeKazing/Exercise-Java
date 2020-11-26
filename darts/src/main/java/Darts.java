class Darts {
    private double x;
    private double y;
    private double hypotenuse;

    Darts(double x, double y) {
        this.x = x;
        this.y = y;
        if (x != 0 || y != 0)this.hypotenuse = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
        if (x == 0)this.hypotenuse = y;
        if (y == 0)this.hypotenuse = x;
    }

    int score() {
        if (hypotenuse < 1 && hypotenuse >= -1) return 10;
        if (hypotenuse >= -5 && hypotenuse < 5) return 5;
        if (hypotenuse >= -10 && hypotenuse <= 10) return 1;
        return 0;
    }
}