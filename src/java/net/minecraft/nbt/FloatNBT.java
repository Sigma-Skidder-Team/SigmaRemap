package net.minecraft.nbt;

import mapped.Class7056;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

import java.io.DataOutput;
import java.io.IOException;

public class FloatNBT extends NumberNBT {
   public static final FloatNBT field60 = new FloatNBT(0.0F);
   public static final INBTType<FloatNBT> field61 = new Class7056();
   private final float field62;

   private FloatNBT(float var1) {
      this.field62 = var1;
   }

   public static FloatNBT valueOf(float var0) {
      return var0 != 0.0F ? new FloatNBT(var0) : field60;
   }

   @Override
   public void write(DataOutput var1) throws IOException {
      var1.writeFloat(this.field62);
   }

   @Override
   public byte getID() {
      return 5;
   }

   @Override
   public INBTType<FloatNBT> getType() {
      return field61;
   }

   @Override
   public String toString() {
      return this.field62 + "f";
   }

   public FloatNBT copy() {
      return this;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof FloatNBT && this.field62 == ((FloatNBT)var1).field62;
   }

   @Override
   public int hashCode() {
      return Float.floatToIntBits(this.field62);
   }

   @Override
   public ITextComponent toFormattedComponent(String indentation, int indentDepth) {
      IFormattableTextComponent var5 = new StringTextComponent("f").mergeStyle(SYNTAX_HIGHLIGHTING_NUMBER_TYPE);
      return new StringTextComponent(String.valueOf(this.field62)).append(var5).mergeStyle(SYNTAX_HIGHLIGHTING_NUMBER);
   }

   @Override
   public long getLong() {
      return (long)this.field62;
   }

   @Override
   public int getInt() {
      return MathHelper.floor(this.field62);
   }

   @Override
   public short getShort() {
      return (short)(MathHelper.floor(this.field62) & 65535);
   }

   @Override
   public byte getByte() {
      return (byte)(MathHelper.floor(this.field62) & 0xFF);
   }

   @Override
   public double getDouble() {
      return (double)this.field62;
   }

   @Override
   public float getFloat() {
      return this.field62;
   }

   @Override
   public Number getAsNumber() {
      return this.field62;
   }
}
