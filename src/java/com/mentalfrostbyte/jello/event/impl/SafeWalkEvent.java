package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.Class4416;
import mapped.Class1893;

public class SafeWalkEvent extends Class4416 {
    private static String[] field21544;
    public boolean field21545;
    public Class1893 field21546;

    public SafeWalkEvent(boolean var1) {
        this.field21545 = var1;
        this.field21546 = Class1893.field11097;
    }

    public Class1893 method13965() {
        return this.field21546;
    }

    public void setSafe(boolean var1) {
        this.field21546 = !var1 ? Class1893.field11099 : Class1893.field11098;
    }

    public boolean method13967() {
        return this.field21545;
    }
}
