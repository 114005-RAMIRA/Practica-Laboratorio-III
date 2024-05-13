package ar.edu.utn.frc.tup.lciii;

import java.math.BigDecimal;

public class Circle extends Figure {
    private BigDecimal radius;
    private final BigDecimal PI = BigDecimal.valueOf(Math.PI);

    public Circle(BigDecimal radius) {
        this.radius = radius;
    }

    public BigDecimal getRadius() {
        return radius;
    }

    public void setRadius(BigDecimal radius) {
        this.radius = radius;
    }

    @Override
    public BigDecimal getPerimeter() {
        return PI.multiply(radius).multiply(BigDecimal.valueOf(2)).setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    @Override
    public BigDecimal getArea() {
        return PI.multiply(radius.pow(2)).setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    @Override
    public boolean isGreater(Figure otherFigure) {
        return this.getArea().compareTo(otherFigure.getArea()) > 0;
    }
}

