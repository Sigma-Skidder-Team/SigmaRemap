// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.nbt;

import mapped.TextFormatting;
import net.minecraft.util.text.ITextComponent;

import java.io.IOException;
import java.io.DataOutput;

public interface INBT
{
    TextFormatting SYNTAX_HIGHLIGHTING_KEY = TextFormatting.AQUA;
    TextFormatting SYNTAX_HIGHLIGHTING_STRING = TextFormatting.GREEN;
    TextFormatting SYNTAX_HIGHLIGHTING_NUMBER = TextFormatting.GOLD;
    TextFormatting SYNTAX_HIGHLIGHTING_NUMBER_TYPE = TextFormatting.RED;
    
    void write(final DataOutput p0) throws IOException;
    
    String toString();
    
    byte getId();
    
    INBTType<?> getType();
    
    INBT copy();
    
    default String getString() {
        return this.toString();
    }
    
    default ITextComponent toFormattedComponent() {
        return this.toFormattedComponent("", 0);
    }
    
    ITextComponent toFormattedComponent(final String p0, final int p1);
}
