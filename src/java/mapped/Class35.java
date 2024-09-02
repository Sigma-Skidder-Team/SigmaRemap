package mapped;

import net.minecraft.nbt.NumberNBT;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

import java.io.DataOutput;
import java.io.IOException;

public class Class35 extends NumberNBT {
   public static final Class7052<Class35> field70 = new Class7055();
   private final long field71;

   private Class35(long var1) {
      this.field71 = var1;
   }

   public static Class35 method94(long var0) {
      return var0 >= -128L && var0 <= 1024L ? Class9153.field42033[(int)var0 + 128] : new Class35(var0);
   }

   @Override
   public void write(DataOutput var1) throws IOException {
      var1.writeLong(this.field71);
   }

   @Override
   public byte getId() {
      return 4;
   }

   @Override
   public Class7052<Class35> method75() {
      return field70;
   }

   @Override
   public String toString() {
      return this.field71 + "L";
   }

   public Class35 method79() {
      return this;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof Class35 && this.field71 == ((Class35)var1).field71;
   }

   @Override
   public int hashCode() {
      return (int)(this.field71 ^ this.field71 >>> 32);
   }

   @Override
   public ITextComponent method78(String var1, int var2) {
      IFormattableTextComponent var5 = new StringTextComponent("L").mergeStyle(field59);
      return new StringTextComponent(String.valueOf(this.field71)).append(var5).mergeStyle(field58);
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
   public Number method89() {
      return this.field71;
   }

   // $VF: synthetic method
   public Class35(long var1, Class7055 var3) {
      this(var1);
   }
}
