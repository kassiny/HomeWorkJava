package Zoo;

import Zoo.Model.Cage;
import Zoo.Model.Condition;

public class CageImpl implements Cage {
    protected int number;
    protected double area;
    protected Condition condition;
    protected boolean vacant;
    protected CageImpl(int number, double area, Condition condition, boolean vacant) {
            this.number = number;
            this.area = area;
            this.condition = condition;
            this.vacant = vacant;
    }
    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public Condition getCondition() {
        return condition;
    }

    @Override
    public boolean isVacantCage() {
        return vacant;
    }

    public void setVacant(boolean vacant) {
        this.vacant = vacant;
    }
    public static class CageBuilder {
        private int number;
        private double area;
        private Condition condition;
        private boolean vacant;

        public CageBuilder setNumber(int number) {
            this.number = number;
            return this;
        }

        public CageBuilder setArea(double area) {
            this.area = area;
            return this;
        }

        public  CageBuilder setCondition( Condition condition) {
            this.condition = condition;
            return  this;
        }

        public CageBuilder setVacant(boolean vacant) {
            this.vacant = vacant;
            return this;
        }
        public  CageImpl getCage() {
            return  new CageImpl(number, area, condition, vacant);
        }

    }
}
