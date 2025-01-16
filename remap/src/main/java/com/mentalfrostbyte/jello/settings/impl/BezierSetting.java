// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.settings.impl;

import com.mentalfrostbyte.jello.settings.Setting;
import com.mentalfrostbyte.jello.settings.Type;
import mapped.Class4405;
import mapped.Class8105;
import mapped.Class8531;

public class BezierSetting extends Setting<Class8531> {
    public BezierSetting(final String s, final String s2, final float n, final float n2, final float n3, final float n4) {
        super(s, s2, Type.BEZIER, new Class8531(n, n2, n3, n4));
    }

    @Override
    public Class4405 method15186(final Class4405 class4405) {
        this.currentValue = new Class8531(Class8105.method26638(class4405, "value"));
        return class4405;
    }

    @Override
    public Class4405 method15193(final Class4405 class4405) {
        class4405.method13301("name", this.method15204());
        class4405.method13301("value", this.method15198().method28615());
        return class4405;
    }

    public void method15216(final float n, final float n2, final float n3, final float n4) {
        this.method15218(n, n2, n3, n4, true);
    }

    public float[] method15217() {
        final Class8531 class8531 = this.method15198();
        return new float[]{class8531.field35807, class8531.field35808, class8531.field35809, class8531.field35810};
    }

    public void method15218(final float n, final float n2, final float n3, final float n4, final boolean b) {
        final Class8531 field21511 = new Class8531(n, n2, n3, n4);
        if (!((Class8531) this.currentValue).equals(field21511)) {
            this.currentValue = field21511;
            if (b) {
                this.method15196();
            }
        }
    }
}
