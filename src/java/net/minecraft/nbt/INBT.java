package net.minecraft.nbt;

import mapped.Class7052;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;

import java.io.DataOutput;
import java.io.IOException;

public interface INBT {
   TextFormatting field56 = TextFormatting.AQUA;
   TextFormatting field57 = TextFormatting.GREEN;
   TextFormatting field58 = TextFormatting.GOLD;
   TextFormatting field59 = TextFormatting.RED;

   void write(DataOutput var1) throws IOException;

   @Override
   String toString();

   byte getId();

   Class7052<?> method75();

   INBT method79();

   default String getString() {
      return this.toString();
   }

   default ITextComponent method82() {
      return this.method78("", 0);
   }

   ITextComponent method78(String var1, int var2);
}
