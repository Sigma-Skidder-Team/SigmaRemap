// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.settings.impl;

import com.mentalfrostbyte.jello.settings.Setting;
import com.mentalfrostbyte.jello.settings.Type;
import mapped.Class4405;
import mapped.Class8105;

public class TextInputSetting extends Setting<String>
{
    public TextInputSetting(final String s, final String s2, final String s3) {
        super(s, s2, Type.TEXTINPUT, s3);
    }
    
    @Override
    public Class4405 method15186(final Class4405 class4405) {
        this.currentValue = (T) Class8105.method26636(class4405, "value", this.method15203());
        return class4405;
    }
}
