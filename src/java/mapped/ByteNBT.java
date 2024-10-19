package mapped;

import net.minecraft.nbt.NumberNBT;
import net.minecraft.nbt.INBTType;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

import java.io.DataOutput;
import java.io.IOException;

public class ByteNBT extends NumberNBT {
   public static final INBTType<ByteNBT> field63 = new Class7063();
   public static final ByteNBT field64 = valueOf((byte)0);
   public static final ByteNBT field65 = valueOf((byte)1);
   private final byte field66;

   private ByteNBT(byte var1) {
      this.field66 = var1;
   }

   public static ByteNBT valueOf(byte var0) {
      return Class8383.method29376()[128 + var0];
   }

   public static ByteNBT valueOf(boolean var0) {
      return !var0 ? field64 : field65;
   }

   @Override
   public void write(DataOutput var1) throws IOException {
      var1.writeByte(this.field66);
   }

   @Override
   public byte getID() {
      return 1;
   }

   @Override
   public INBTType<ByteNBT> getType() {
      return field63;
   }

   @Override
   public String toString() {
      return this.field66 + "b";
   }

   public ByteNBT copy() {
      return this;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof ByteNBT && this.field66 == ((ByteNBT)var1).field66;
   }

   @Override
   public int hashCode() {
      return this.field66;
   }

   @Override
   public ITextComponent toFormattedComponent(String indentation, int indentDepth) {
      IFormattableTextComponent var5 = new StringTextComponent("b").mergeStyle(SYNTAX_HIGHLIGHTING_NUMBER_TYPE);
      return new StringTextComponent(String.valueOf(this.field66)).append(var5).mergeStyle(SYNTAX_HIGHLIGHTING_NUMBER);
   }

   @Override
   public long getLong() {
      return (long)this.field66;
   }

   @Override
   public int getInt() {
      return this.field66;
   }

   @Override
   public short getShort() {
      return (short)this.field66;
   }

   @Override
   public byte getByte() {
      return this.field66;
   }

   @Override
   public double getDouble() {
      return (double)this.field66;
   }

   @Override
   public float getFloat() {
      return (float)this.field66;
   }

   @Override
   public Number method89() {
      return this.field66;
   }

   // $VF: synthetic method
   public ByteNBT(byte var1, Class7063 var2) {
      this(var1);
   }
}
