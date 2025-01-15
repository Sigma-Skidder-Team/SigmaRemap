// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.nbt;

import java.util.AbstractList;

public abstract class CollectionNBT<T extends INBT> extends AbstractList<T> implements INBT
{
    @Override
    public abstract T set(final int p0, final T p1);
    
    @Override
    public abstract void add(final int p0, final T p1);
    
    @Override
    public abstract T remove(final int p0);
    
    public abstract boolean func_218659_a(final int p0, final INBT p1);
    
    public abstract boolean func_218660_b(final int p0, final INBT p1);
}
