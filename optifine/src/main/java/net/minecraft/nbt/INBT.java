package net.minecraft.nbt;

import java.io.DataOutput;
import java.io.IOException;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;

public interface INBT
{
    TextFormatting SYNTAX_HIGHLIGHTING_KEY = TextFormatting.AQUA;
    TextFormatting SYNTAX_HIGHLIGHTING_STRING = TextFormatting.GREEN;
    TextFormatting SYNTAX_HIGHLIGHTING_NUMBER = TextFormatting.GOLD;
    TextFormatting SYNTAX_HIGHLIGHTING_NUMBER_TYPE = TextFormatting.RED;

    void write(DataOutput output) throws IOException;

    String toString();

    byte getId();

    INBTType<?> getType();

    INBT copy();

default String getString()
    {
        return this.toString();
    }

default ITextComponent toFormattedComponent()
    {
        return this.toFormattedComponent("", 0);
    }

    ITextComponent toFormattedComponent(String indentation, int indentDepth);
}
