// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.settings.impl;

import com.mentalfrostbyte.jello.settings.Setting;
import com.mentalfrostbyte.jello.settings.Type;
import mapped.Class4405;
import mapped.Class8105;

public class ButtonSetting extends Setting<Integer> {
    private String[] field21521;

    public ButtonSetting(final String s, final String s2, final Integer n, final String... field21521) {
        super(s, s2, Type.BUTTON, n);
        this.field21521 = field21521;
    }

    @Override
    public Class4405 method15186(final Class4405 class4405) {
        this.currentValue = Integer.valueOf(Class8105.method26632(class4405, "value", this.method15203()));
        return class4405;
    }

    public String[] method15223() {
        return this.field21521;
    }
}
