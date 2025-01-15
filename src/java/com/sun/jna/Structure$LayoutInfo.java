// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Structure$LayoutInfo
{
    private int size;
    private int alignment;
    private final Map<String, Structure$StructField> fields;
    private int alignType;
    private TypeMapper typeMapper;
    private boolean variable;
    private Structure$StructField typeInfoField;
    
    private Structure$LayoutInfo() {
        this.size = -1;
        this.alignment = 1;
        this.fields = Collections.synchronizedMap(new LinkedHashMap<String, Structure$StructField>());
        this.alignType = 0;
    }
}
