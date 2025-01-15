// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.lang.reflect.Field;

public class Structure$StructField
{
    public String name;
    public Class<?> type;
    public Field field;
    public int size;
    public int offset;
    public boolean isVolatile;
    public boolean isReadOnly;
    public FromNativeConverter readConverter;
    public ToNativeConverter writeConverter;
    public FromNativeContext context;
    
    public Structure$StructField() {
        this.size = -1;
        this.offset = -1;
    }
    
    @Override
    public String toString() {
        return this.name + "@" + this.offset + "[" + this.size + "] (" + this.type + ")";
    }
}
