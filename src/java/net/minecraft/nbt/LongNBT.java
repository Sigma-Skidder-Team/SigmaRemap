package net.minecraft.nbt;

import mapped.Class7055;
import mapped.Class9153;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

import java.io.DataOutput;
import java.io.IOException;

public class LongNBT extends NumberNBT {
   public static final INBTType<LongNBT> field70 = new Class7055();
   private final long field71;

   private LongNBT(long var1) {
      this.field71 = var1;
   }

   public static LongNBT valueOf(long var0) {
      return var0 >= -128L && var0 <= 1024L ? Class9153.field42033[(int)var0 + 128] : new LongNBT(var0);
   }

   @Override
   public void write(DataOutput var1) throws IOException {
      var1.writeLong(this.field71);
   }

   @Override
   public byte getID() {
      return 4;
   }

   @Override
   public INBTType<LongNBT> getType() {
      return field70;
   }

   @Override
   public String toString() {
      return this.field71 + "L";
   }

   public LongNBT copy() {
      return this;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof LongNBT && this.field71 == ((LongNBT)var1).field71;
   }

   @Override
   public int hashCode() {
      return (int)(this.field71 ^ this.field71 >>> 32);
   }

   @Override
   public ITextComponent toFormattedComponent(String indentation, int indentDepth) {
      IFormattableTextComponent var5 = new StringTextComponent("L").mergeStyle(SYNTAX_HIGHLIGHTING_NUMBER_TYPE);
      return new StringTextComponent(String.valueOf(this.field71)).append(var5).mergeStyle(SYNTAX_HIGHLIGHTING_NUMBER);
   }

   @Override
   public long getLong() {
      return this.field71;
   }

   @Override
   public int getInt() {
      return (int)(this.field71 & -1L);
   }

   @Override
   public short getShort() {
      return (short)((int)(this.field71 & 65535L));
   }

   @Override
   public byte getByte() {
      return (byte)((int)(this.field71 & 255L));
   }

   @Override
   public double getDouble() {
      return (double)this.field71;
   }

   @Override
   public float getFloat() {
      return (float)this.field71;
   }

   @Override
   public Number getAsNumber() {
      return this.field71;
   }

   // $VF: synthetic method
   public LongNBT(long var1, Class7055 var3) {
      this(var1);
   }
}
