// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.settings;

import mapped.Class4405;
import mapped.Class7655;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public abstract class Setting<T>
{
    public final Type field21510;
    public T currentValue;
    public T value;
    public final String field21513;
    public final String field21514;
    private final List<Class7655> field21515;
    
    public Setting(final String name, final String field21514, final Type field21515, final T value) {
        this.field21515 = new ArrayList<Class7655>();
        this.field21510 = field21515;
        this.value = value;
        this.currentValue = value;
        this.field21513 = name;
        this.field21514 = field21514;
    }
    
    public abstract Class4405 method15186(final Class4405 p0);
    
    public Class4405 method15193(final Class4405 class4405) {
        class4405.method13301("name", this.method15204());
        class4405.method13301("value", this.currentValue);
        return class4405;
    }
    
    public void method15194() {
        this.currentValue = this.value;
    }
    
    public final Setting method15195(final Class7655 class7655) {
        this.field21515.add(class7655);
        return this;
    }
    
    public final void method15196() {
        final Iterator<Class7655> iterator = this.field21515.iterator();
        while (iterator.hasNext()) {
            iterator.next().method24257(this);
        }
    }
    
    public Type method15197() {
        return this.field21510;
    }
    
    public T method15198() {
        return this.currentValue;
    }
    
    public void method15199(final T t) {
        this.method15200(t, true);
    }
    
    public void method15200(final T field21511, final boolean b) {
        if (this.currentValue != field21511) {
            this.currentValue = field21511;
            if (b) {
                this.method15196();
            }
        }
    }
    
    public void method15201() {
    }
    
    public boolean getValue() {
        return false;
    }
    
    public T method15203() {
        return this.value;
    }
    
    public String method15204() {
        return this.field21513;
    }
    
    public String method15205() {
        return this.field21514;
    }
    
    @Override
    public String toString() {
        return this.method15198().toString();
    }
}
