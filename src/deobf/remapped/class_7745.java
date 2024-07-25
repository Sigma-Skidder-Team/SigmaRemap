package remapped;

import java.io.DataOutput;
import java.io.IOException;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class class_7745 extends class_5841 {
   public static final class_3265<class_7745> field_39276 = new class_2216();
   private final short field_39274;

   private class_7745(short var1) {
      this.field_39274 = var1;
   }

   public static class_7745 method_35070(short var0) {
      return var0 >= -128 && var0 <= 1024 ? class_6955.field_35760[var0 + 128] : new class_7745(var0);
   }

   @Override
   public void method_38707(DataOutput var1) throws IOException {
      var1.writeShort(this.field_39274);
   }

   @Override
   public byte method_38706() {
      return 2;
   }

   @Override
   public class_3265<class_7745> method_38709() {
      return field_39276;
   }

   @Override
   public String toString() {
      return this.field_39274 + "s";
   }

   public class_7745 method_35069() {
      return this;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof class_7745 && this.field_39274 == ((class_7745)var1).field_39274;
   }

   @Override
   public int hashCode() {
      return this.field_39274;
   }

   @Override
   public ITextComponent method_38712(String var1, int var2) {
      IFormattableTextComponent var5 = new StringTextComponent("s").mergeStyle(field_43007);
      return new StringTextComponent(String.valueOf(this.field_39274)).append(var5).mergeStyle(field_43005);
   }

   @Override
   public long method_26635() {
      return (long)this.field_39274;
   }

   @Override
   public int method_26636() {
      return this.field_39274;
   }

   @Override
   public short method_26640() {
      return this.field_39274;
   }

   @Override
   public byte method_26641() {
      return (byte)(this.field_39274 & 255);
   }

   @Override
   public double method_26642() {
      return (double)this.field_39274;
   }

   @Override
   public float method_26639() {
      return (float)this.field_39274;
   }

   @Override
   public Number method_26638() {
      return this.field_39274;
   }
}
