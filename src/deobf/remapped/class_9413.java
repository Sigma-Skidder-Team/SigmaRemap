package remapped;

import java.io.DataOutput;
import java.io.IOException;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class class_9413 extends class_5841 {
   private static String[] field_48132;
   public static final class_3265<class_9413> field_48134 = new class_3700();
   private final int field_48133;

   private class_9413(int var1) {
      this.field_48133 = var1;
   }

   public static class_9413 method_43597(int var0) {
      return var0 >= -128 && var0 <= 1024 ? class_3690.field_18091[var0 + 128] : new class_9413(var0);
   }

   @Override
   public void method_38707(DataOutput var1) throws IOException {
      var1.writeInt(this.field_48133);
   }

   @Override
   public byte method_38706() {
      return 3;
   }

   @Override
   public class_3265<class_9413> method_38709() {
      return field_48134;
   }

   @Override
   public String toString() {
      return String.valueOf(this.field_48133);
   }

   public class_9413 method_43598() {
      return this;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof class_9413 && this.field_48133 == ((class_9413)var1).field_48133;
   }

   @Override
   public int hashCode() {
      return this.field_48133;
   }

   @Override
   public ITextComponent method_38712(String var1, int var2) {
      return new StringTextComponent(String.valueOf(this.field_48133)).mergeStyle(field_43005);
   }

   @Override
   public long method_26635() {
      return (long)this.field_48133;
   }

   @Override
   public int method_26636() {
      return this.field_48133;
   }

   @Override
   public short method_26640() {
      return (short)(this.field_48133 & 65535);
   }

   @Override
   public byte method_26641() {
      return (byte)(this.field_48133 & 0xFF);
   }

   @Override
   public double method_26642() {
      return (double)this.field_48133;
   }

   @Override
   public float method_26639() {
      return (float)this.field_48133;
   }

   @Override
   public Number method_26638() {
      return this.field_48133;
   }
}
