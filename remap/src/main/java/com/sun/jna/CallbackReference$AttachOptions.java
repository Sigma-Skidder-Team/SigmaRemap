// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.util.List;

public class CallbackReference$AttachOptions extends Structure
{
    public static final List<String> FIELDS;
    public boolean daemon;
    public boolean detach;
    public String name;
    
    public CallbackReference$AttachOptions() {
        this.setStringEncoding("utf8");
    }
    
    @Override
    public List<String> getFieldOrder() {
        return CallbackReference$AttachOptions.FIELDS;
    }
    
    static {
        FIELDS = Structure.createFieldsOrder("daemon", "detach", "name");
    }
}
