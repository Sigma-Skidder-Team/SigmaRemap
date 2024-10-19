package mapped;

import net.minecraft.nbt.NumberNBT;
import net.minecraft.nbt.INBTType;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

import java.io.DataOutput;
import java.io.IOException;

public class DoubleNBT extends NumberNBT {
   public static final DoubleNBT field67 = new DoubleNBT(0.0);
   public static final INBTType<DoubleNBT> field68 = new Class7057();
   private final double field69;

   private DoubleNBT(double var1) {
      this.field69 = var1;
   }

   public static DoubleNBT valueOf(double var0) {
      return var0 != 0.0 ? new DoubleNBT(var0) : field67;
   }

   @Override
   public void write(DataOutput var1) throws IOException {
      var1.writeDouble(this.field69);
   }

   @Override
   public byte getID() {
      return 6;
   }

   @Override
   public INBTType<DoubleNBT> getType() {
      return field68;
   }

   @Override
   public String toString() {
      return this.field69 + "d";
   }

   public DoubleNBT copy() {
      return this;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof DoubleNBT && this.field69 == ((DoubleNBT)var1).field69;
   }

   @Override
   public int hashCode() {
      long var3 = Double.doubleToLongBits(this.field69);
      return (int)(var3 ^ var3 >>> 32);
   }

   @Override
   public ITextComponent toFormattedComponent(String indentation, int indentDepth) {
      IFormattableTextComponent var5 = new StringTextComponent("d").mergeStyle(SYNTAX_HIGHLIGHTING_NUMBER_TYPE);
      return new StringTextComponent(String.valueOf(this.field69)).append(var5).mergeStyle(SYNTAX_HIGHLIGHTING_NUMBER);
   }

   @Override
   public long getLong() {
      return (long)Math.floor(this.field69);
   }

   @Override
   public int getInt() {
      return MathHelper.floor(this.field69);
   }

   @Override
   public short getShort() {
      return (short)(MathHelper.floor(this.field69) & 65535);
   }

   @Override
   public byte getByte() {
      return (byte)(MathHelper.floor(this.field69) & 0xFF);
   }

   @Override
   public double getDouble() {
      return this.field69;
   }

   @Override
   public float getFloat() {
      return (float)this.field69;
   }

   @Override
   public Number method89() {
      return this.field69;
   }
}
