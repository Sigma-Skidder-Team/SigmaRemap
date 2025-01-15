// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.util.Set;

public final class Structure$2 extends ThreadLocal<Set<Structure>>
{
    public synchronized Set<Structure> initialValue() {
        return new Structure$StructureSet();
    }
}
