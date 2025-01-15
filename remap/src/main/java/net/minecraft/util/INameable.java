// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.util;

import net.minecraft.util.text.ITextComponent;

import javax.annotation.Nullable;

public interface INameable
{
    ITextComponent getName();
    
    default boolean hasCustomName() {
        return this.getCustomName() != null;
    }
    
    default ITextComponent getDisplayName() {
        return this.getName();
    }
    
    @Nullable
    default ITextComponent getCustomName() {
        return null;
    }
}
