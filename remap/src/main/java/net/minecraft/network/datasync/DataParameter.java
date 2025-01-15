// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.network.datasync;

import mapped.Class4410;

public class DataParameter<T>
{
    private final int field37017;
    private final Class4410<T> field37018;
    
    public DataParameter(final int field37017, final Class4410<T> field37018) {
        this.field37017 = field37017;
        this.field37018 = field37018;
    }
    
    public int method30737() {
        return this.field37017;
    }
    
    public Class4410<T> method30738() {
        return this.field37018;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.field37017 == ((DataParameter)o).field37017);
    }
    
    @Override
    public int hashCode() {
        return this.field37017;
    }
    
    @Override
    public String toString() {
        return "<entity data: " + this.field37017 + ">";
    }
}
