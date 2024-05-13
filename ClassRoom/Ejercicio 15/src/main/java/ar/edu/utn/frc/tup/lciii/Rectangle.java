package ar.edu.utn.frc.tup.lciii;

import java.math.BigDecimal;

public class Rectangle extends Figure {
    private BigDecimal base;
    private BigDecimal height;

    public Rectangle(BigDecimal base, BigDecimal height) {
        this.base = base;
        this.height = height;
    }

    public BigDecimal getBase() {
        return base;
    }

    public void setBase(BigDecimal base) {
        this.base = base;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    @Override
    public BigDecimal getPerimeter() {
        return base.multiply(BigDecimal.valueOf(2)).add(height.multiply(BigDecimal.valueOf(2)));
    }

    @Override
    public BigDecimal getArea() {
        return base.multiply(height);
    }

    @Override
    public boolean isGreater(Figure otherFigure) {
        return this.getArea().compareTo(otherFigure.getArea()) > 0;
    }
}
