package sample;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.SimpleFloatProperty;

import java.util.Random;

public class Numberus {
    FloatProperty c1;
    FloatProperty c2;
    FloatProperty c3;
    FloatProperty c4;
    FloatProperty c5;
    Random r;

    public Numberus() {
        r = new Random();
        this.c1 = new SimpleFloatProperty(r.nextFloat());
        this.c2 = new SimpleFloatProperty(r.nextFloat());
        this.c3 = new SimpleFloatProperty(r.nextFloat());
        this.c4 = new SimpleFloatProperty(r.nextFloat());
        this.c5 = new SimpleFloatProperty(r.nextFloat());
    }

    public float getC1() {
        return c1.get();
    }

    public FloatProperty c1Property() {
        return c1;
    }

    public void setC1(float c1) {
        this.c1.set(c1);
    }

    public float getC2() {
        return c2.get();
    }

    public FloatProperty c2Property() {
        return c2;
    }

    public void setC2(float c2) {
        this.c2.set(c2);
    }

    public float getC3() {
        return c3.get();
    }

    public FloatProperty c3Property() {
        return c3;
    }

    public void setC3(float c3) {
        this.c3.set(c3);
    }

    public float getC4() {
        return c4.get();
    }

    public FloatProperty c4Property() {
        return c4;
    }

    public void setC4(float c4) {
        this.c4.set(c4);
    }

    public float getC5() {
        return c5.get();
    }

    public FloatProperty c5Property() {
        return c5;
    }

    public void setC5(float c5) {
        this.c5.set(c5);
    }


    public float[] getNums(){
        return new float[]{c1.get(), c2.get(), c3.get(), c4.get(), c5.get()};
    }
}
