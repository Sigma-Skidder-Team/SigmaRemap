// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.settings.impl;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.settings.Setting;
import com.mentalfrostbyte.jello.settings.Type;
import mapped.*;

public class BooleanSetting extends Setting<Boolean>
{
    public boolean field21516;
    
    public BooleanSetting(final String name, final String desc, final boolean b) {
        super(name, desc, Type.BOOLEAN, b);
        this.field21516 = false;
    }
    
    public BooleanSetting method15206() {
        this.field21516 = true;
        return this;
    }
    
    @Override
    public void method15201() {
        this.field21516 = false;
    }
    
    @Override
    public boolean getValue() {
        return this.field21516;
    }
    
    public void method15207(final Boolean b, final boolean b2) {
        if (this.field21516) {
            if (b2) {
                Client.method35173().method35197().method25776(new Class6224("Premium", "Not yet available for free version"));
            }
        }
        super.method15200(b, b2);
    }
    
    public Boolean method15208() {
        if (!this.field21516) {
            return (Boolean)this.currentValue;
        }
        return (Boolean)this.value;
    }
    
    @Override
    public Class4405 method15186(final Class4405 class4405) {
        this.currentValue = Boolean.valueOf(Class8105.method26630(class4405, "value", this.method15203()));
        return class4405;
    }
}
