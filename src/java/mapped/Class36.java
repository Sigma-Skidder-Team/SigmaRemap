package mapped;

import net.minecraft.nbt.NumberNBT;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

import java.io.DataOutput;
import java.io.IOException;

public class Class36 extends NumberNBT {
   private static String[] field72;
   public static final Class7052<Class36> field73 = new Class7065();
   private final int field74;

   private Class36(int var1) {
      this.field74 = var1;
   }

   public static Class36 method95(int var0) {
      return var0 >= -128 && var0 <= 1024 ? Class8136.field34975[var0 + 128] : new Class36(var0);
   }

   @Override
   public void write(DataOutput var1) throws IOException {
      var1.writeInt(this.field74);
   }

   @Override
   public byte getId() {
      return 3;
   }

   @Override
   public Class7052<Class36> method75() {
      return field73;
   }

   @Override
   public String toString() {
      return String.valueOf(this.field74);
   }

   public Class36 method79() {
      return this;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof Class36 && this.field74 == ((Class36)var1).field74;
   }

   @Override
   public int hashCode() {
      return this.field74;
   }

   @Override
   public ITextComponent method78(String var1, int var2) {
      return new StringTextComponent(String.valueOf(this.field74)).mergeStyle(field58);
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
   public Class36(int var1, Class7065 var2) {
      this(var1);
   }
}
