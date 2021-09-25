package com.app.limitservice.models;

/**
 * @author t0k02w6 on 25/09/21
 * @project limit-service
 */
public class Limits {
    private int minimum;
    private int maximum;

    public Limits() {

    }

    public Limits(int minimum, int maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }
}
