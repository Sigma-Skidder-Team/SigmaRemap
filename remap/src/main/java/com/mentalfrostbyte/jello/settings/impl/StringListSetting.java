// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.settings.impl;

import com.mentalfrostbyte.jello.settings.Setting;
import com.mentalfrostbyte.jello.settings.Type;
import mapped.Class4405;
import mapped.Class8105;
import mapped.Class88;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Arrays;
import java.util.List;

public class StringListSetting extends Setting<List<String>> {
    private boolean field21517;

    public StringListSetting(final String s, final String s2, final boolean b, final String... a) {
        super(s, s2, Type.field11988, Arrays.asList(a));
        this.method15210(b);
    }

    @Override
    public Class4405 method15193(final Class4405 class4405) {
        class4405.method13301("name", this.method15204());
        class4405.method13301("value", new Class88((Collection<?>) this.currentValue));
        return class4405;
    }

    @Override
    public Class4405 method15186(final Class4405 class4405) {
        final Class88 method26638 = Class8105.method26638(class4405, "value");
        this.currentValue = new ArrayList();
        if (method26638 != null) {
            for (int i = 0; i < method26638.method462(); ++i) {
                ((List) this.currentValue).add(method26638.method459(i));
            }
        }
        return class4405;
    }

    public boolean method15209() {
        return this.field21517;
    }

    public void method15210(final boolean field21517) {
        this.field21517 = field21517;
    }
}
