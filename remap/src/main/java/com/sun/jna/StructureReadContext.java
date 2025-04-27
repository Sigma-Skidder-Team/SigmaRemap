// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.lang.reflect.Field;

public class StructureReadContext extends FromNativeContext
{
    private final Structure structure;
    private final Field field;
    
    public StructureReadContext(final Structure struct, final Field field) {
        super(field.getType());
        this.structure = struct;
        this.field = field;
    }
    
    public Structure getStructure() {
        return this.structure;
    }
    
    public Field getField() {
        return this.field;
    }
}
