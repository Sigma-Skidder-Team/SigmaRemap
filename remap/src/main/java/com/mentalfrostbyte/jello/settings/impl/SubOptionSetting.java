// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.settings.impl;

import com.mentalfrostbyte.jello.settings.Setting;
import com.mentalfrostbyte.jello.settings.Type;
import mapped.Class4405;
import mapped.Class8105;
import mapped.Class88;

import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

public abstract class SubOptionSetting extends Setting<Boolean> {
    public List<Setting> field21522;

    public SubOptionSetting(final String s, final String s2, final Type class2076, final boolean b, final List<Setting> field21522) {
        super(s, s2, class2076, b);
        this.field21522 = field21522;
    }

    public SubOptionSetting(final String s, final String s2, final Type class2076, final boolean b, final Setting... a) {
        this(s, s2, class2076, b, (List<Setting>) Arrays.asList((Setting[]) a));
    }

    @Override
    public Class4405 method15186(final Class4405 class4405) {
        final Class88 method26638 = Class8105.method26638(class4405, this.method15204());
        if (method26638 != null) {
            for (int i = 0; i < method26638.method462(); ++i) {
                final Class4405 method26639 = method26638.method457(i);
                final String method26640 = Class8105.method26636(class4405, "name", null);
                for (final Setting class4406 : this.method15224()) {
                    if (!class4406.method15204().equals(method26640)) {
                        continue;
                    }
                    class4406.method15186(method26639);
                    break;
                }
            }
        }
        this.currentValue = Boolean.valueOf(Class8105.method26630(class4405, "value", this.method15203()));
        return class4405;
    }

    @Override
    public Class4405 method15193(final Class4405 class4405) {
        final Class88 class4406 = new Class88();
        final Iterator<Setting> iterator = (Iterator<Setting>) this.method15224().iterator();
        while (iterator.hasNext()) {
            class4406.method486(iterator.next().method15193(new Class4405()));
        }
        class4405.method13301("children", class4406);
        class4405.method13301("name", this.method15204());
        return super.method15193(class4405);
    }

    public List<Setting> method15224() {
        return this.field21522;
    }
}
