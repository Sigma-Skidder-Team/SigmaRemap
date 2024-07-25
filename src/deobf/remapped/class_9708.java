package remapped;

import java.io.DataOutput;
import java.io.IOException;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class class_9708 extends class_5841 {
   public static final class_9708 field_49365 = new class_9708(0.0);
   public static final class_3265<class_9708> field_49363 = new class_4676();
   private final double field_49366;

   private class_9708(double var1) {
      this.field_49366 = var1;
   }

   public static class_9708 method_44846(double var0) {
      return var0 != 0.0 ? new class_9708(var0) : field_49365;
   }

   @Override
   public void method_38707(DataOutput var1) throws IOException {
      var1.writeDouble(this.field_49366);
   }

   @Override
   public byte method_38706() {
      return 6;
   }

   @Override
   public class_3265<class_9708> method_38709() {
      return field_49363;
   }

   @Override
   public String toString() {
      return this.field_49366 + "d";
   }

   public class_9708 method_44845() {
      return this;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof class_9708 && this.field_49366 == ((class_9708)var1).field_49366;
   }

   @Override
   public int hashCode() {
      long var3 = Double.doubleToLongBits(this.field_49366);
      return (int)(var3 ^ var3 >>> 32);
   }

   @Override
   public ITextComponent method_38712(String var1, int var2) {
      IFormattableTextComponent var5 = new StringTextComponent("d").mergeStyle(field_43007);
      return new StringTextComponent(String.valueOf(this.field_49366)).append(var5).mergeStyle(field_43005);
   }

   @Override
   public long method_26635() {
      return (long)Math.floor(this.field_49366);
   }

   @Override
   public int method_26636() {
      return class_9299.method_42847(this.field_49366);
   }

   @Override
   public short method_26640() {
      return (short)(class_9299.method_42847(this.field_49366) & 65535);
   }

   @Override
   public byte method_26641() {
      return (byte)(class_9299.method_42847(this.field_49366) & 0xFF);
   }

   @Override
   public double method_26642() {
      return this.field_49366;
   }

   @Override
   public float method_26639() {
      return (float)this.field_49366;
   }

   @Override
   public Number method_26638() {
      return this.field_49366;
   }
}
