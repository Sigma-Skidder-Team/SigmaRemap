package remapped;

import java.io.DataOutput;
import java.io.IOException;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class class_3388 extends class_5841 {
   public static final class_3265<class_3388> field_16694 = new class_9274();
   private final long field_16693;

   private class_3388(long var1) {
      this.field_16693 = var1;
   }

   public static class_3388 method_15658(long var0) {
      return var0 >= -128L && var0 <= 1024L ? class_7255.field_37174[(int)var0 + 128] : new class_3388(var0);
   }

   @Override
   public void method_38707(DataOutput var1) throws IOException {
      var1.writeLong(this.field_16693);
   }

   @Override
   public byte method_38706() {
      return 4;
   }

   @Override
   public class_3265<class_3388> method_38709() {
      return field_16694;
   }

   @Override
   public String toString() {
      return this.field_16693 + "L";
   }

   public class_3388 method_15657() {
      return this;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof class_3388 && this.field_16693 == ((class_3388)var1).field_16693;
   }

   @Override
   public int hashCode() {
      return (int)(this.field_16693 ^ this.field_16693 >>> 32);
   }

   @Override
   public ITextComponent method_38712(String var1, int var2) {
      IFormattableTextComponent var5 = new StringTextComponent("L").mergeStyle(field_43007);
      return new StringTextComponent(String.valueOf(this.field_16693)).append(var5).mergeStyle(field_43005);
   }

   @Override
   public long method_26635() {
      return this.field_16693;
   }

   @Override
   public int method_26636() {
      return (int)(this.field_16693 & -1L);
   }

   @Override
   public short method_26640() {
      return (short)((int)(this.field_16693 & 65535L));
   }

   @Override
   public byte method_26641() {
      return (byte)((int)(this.field_16693 & 255L));
   }

   @Override
   public double method_26642() {
      return (double)this.field_16693;
   }

   @Override
   public float method_26639() {
      return (float)this.field_16693;
   }

   @Override
   public Number method_26638() {
      return this.field_16693;
   }
}
