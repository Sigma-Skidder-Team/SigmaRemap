package net.minecraft.nbt;

import mapped.Class7059;
import mapped.Class9087;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

import java.io.DataOutput;
import java.io.IOException;

public class ShortNBT extends NumberNBT {
   public static final INBTType<ShortNBT> field75 = new Class7059();
   private final short field76;

   private ShortNBT(short var1) {
      this.field76 = var1;
   }

   public static ShortNBT valueOf(short var0) {
      return var0 >= -128 && var0 <= 1024 ? Class9087.field41600[var0 + 128] : new ShortNBT(var0);
   }

   @Override
   public void write(DataOutput var1) throws IOException {
      var1.writeShort(this.field76);
   }

   @Override
   public byte getID() {
      return 2;
   }

   @Override
   public INBTType<ShortNBT> getType() {
      return field75;
   }

   @Override
   public String toString() {
      return this.field76 + "s";
   }

   public ShortNBT copy() {
      return this;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof ShortNBT && this.field76 == ((ShortNBT)var1).field76;
   }

   @Override
   public int hashCode() {
      return this.field76;
   }

   @Override
   public ITextComponent toFormattedComponent(String indentation, int indentDepth) {
      IFormattableTextComponent var5 = new StringTextComponent("s").mergeStyle(SYNTAX_HIGHLIGHTING_NUMBER_TYPE);
      return new StringTextComponent(String.valueOf(this.field76)).append(var5).mergeStyle(SYNTAX_HIGHLIGHTING_NUMBER);
   }

   @Override
   public long getLong() {
      return (long)this.field76;
   }

   @Override
   public int getInt() {
      return this.field76;
   }

   @Override
   public short getShort() {
      return this.field76;
   }

   @Override
   public byte getByte() {
      return (byte)(this.field76 & 255);
   }

   @Override
   public double getDouble() {
      return (double)this.field76;
   }

   @Override
   public float getFloat() {
      return (float)this.field76;
   }

   @Override
   public Number getAsNumber() {
      return this.field76;
   }

   // $VF: synthetic method
   public ShortNBT(short var1, Class7059 var2) {
      this(var1);
   }
}
