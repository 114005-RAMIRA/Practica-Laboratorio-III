package ar.edu.utn.frc.tup.lciii;

import java.math.BigDecimal;

public abstract class Figure {

    public abstract BigDecimal getPerimeter();

    public abstract BigDecimal getArea();

    public abstract boolean isGreater(Figure otherFigure);

}
