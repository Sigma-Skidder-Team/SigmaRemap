// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.lang.reflect.Field;

public class StructureWriteContext extends ToNativeContext
{
    private Structure struct;
    private Field field;
    
    public StructureWriteContext(final Structure struct, final Field field) {
        this.struct = struct;
        this.field = field;
    }
    
    public Structure getStructure() {
        return this.struct;
    }
    
    public Field getField() {
        return this.field;
    }
}
