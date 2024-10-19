package mapped;

import net.minecraft.nbt.NumberNBT;
import net.minecraft.nbt.INBTType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

import java.io.DataOutput;
import java.io.IOException;

public class IntNBT extends NumberNBT {
   private static String[] field72;
   public static final INBTType<IntNBT> field73 = new Class7065();
   private final int field74;

   private IntNBT(int var1) {
      this.field74 = var1;
   }

   public static IntNBT valueOf(int var0) {
      return var0 >= -128 && var0 <= 1024 ? Class8136.field34975[var0 + 128] : new IntNBT(var0);
   }

   @Override
   public void write(DataOutput var1) throws IOException {
      var1.writeInt(this.field74);
   }

   @Override
   public byte getID() {
      return 3;
   }

   @Override
   public INBTType<IntNBT> getType() {
      return field73;
   }

   @Override
   public String toString() {
      return String.valueOf(this.field74);
   }

   public IntNBT copy() {
      return this;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof IntNBT && this.field74 == ((IntNBT)var1).field74;
   }

   @Override
   public int hashCode() {
      return this.field74;
   }

   @Override
   public ITextComponent toFormattedComponent(String indentation, int indentDepth) {
      return new StringTextComponent(String.valueOf(this.field74)).mergeStyle(SYNTAX_HIGHLIGHTING_NUMBER);
   }

   @Override
   public long getLong() {
      return (long)this.field74;
   }

   @Override
   public int getInt() {
      return this.field74;
   }

   @Override
   public short getShort() {
      return (short)(this.field74 & 65535);
   }

   @Override
   public byte getByte() {
      return (byte)(this.field74 & 0xFF);
   }

   @Override
   public double getDouble() {
      return (double)this.field74;
   }

   @Override
   public float getFloat() {
      return (float)this.field74;
   }

   @Override
   public Number method89() {
      return this.field74;
   }

   // $VF: synthetic method
   public IntNBT(int var1, Class7065 var2) {
      this(var1);
   }
}
