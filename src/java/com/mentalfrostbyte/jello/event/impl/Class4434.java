package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;
import mapped.Vector3d;

public class Class4434 extends CancellableEvent {
    private static String[] field21581;
    private final double field21582;
    private final Vector3d field21583;

    public Class4434(double var1, Vector3d var3) {
        this.field21582 = var1;
        this.field21583 = var3;
    }

    public double method13988() {
        return this.field21582;
    }

    public void method13989(double var1) {
        this.method13900(true);
        this.field21583.field18049 = var1;
    }

    public double method13990() {
        return this.field21583.field18049;
    }

    public Vector3d method13991() {
        return this.field21583;
    }
}
