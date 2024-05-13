package ar.edu.utn.frc.tup.lciii;

import java.math.BigDecimal;

public class Square extends Figure {
    private BigDecimal side;

    public Square(BigDecimal side) {
        this.side = side;
    }

    public BigDecimal getSide() {
        return side;
    }

    public void setSide(BigDecimal side) {
        this.side = side;
    }

    @Override
    public BigDecimal getPerimeter() {
        return side.multiply(BigDecimal.valueOf(4));
    }

    @Override
    public BigDecimal getArea() {
        return side.pow(2);
    }

    @Override
    public boolean isGreater(Figure otherFigure) {
        return this.getArea().compareTo(otherFigure.getArea()) > 0;
    }
}

