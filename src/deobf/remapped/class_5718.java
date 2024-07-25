package remapped;

import java.io.DataOutput;
import java.io.IOException;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class class_5718 extends class_5841 {
   public static final class_5718 field_28899 = new class_5718(0.0F);
   public static final class_3265<class_5718> field_28900 = new class_6691();
   private final float field_28901;

   private class_5718(float var1) {
      this.field_28901 = var1;
   }

   public static class_5718 method_25854(float var0) {
      return var0 != 0.0F ? new class_5718(var0) : field_28899;
   }

   @Override
   public void method_38707(DataOutput var1) throws IOException {
      var1.writeFloat(this.field_28901);
   }

   @Override
   public byte method_38706() {
      return 5;
   }

   @Override
   public class_3265<class_5718> method_38709() {
      return field_28900;
   }

   @Override
   public String toString() {
      return this.field_28901 + "f";
   }

   public class_5718 method_25853() {
      return this;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof class_5718 && this.field_28901 == ((class_5718)var1).field_28901;
   }

   @Override
   public int hashCode() {
      return Float.floatToIntBits(this.field_28901);
   }

   @Override
   public ITextComponent method_38712(String var1, int var2) {
      IFormattableTextComponent var5 = new StringTextComponent("f").mergeStyle(field_43007);
      return new StringTextComponent(String.valueOf(this.field_28901)).append(var5).mergeStyle(field_43005);
   }

   @Override
   public long method_26635() {
      return (long)this.field_28901;
   }

   @Override
   public int method_26636() {
      return MathHelper.floor(this.field_28901);
   }

   @Override
   public short method_26640() {
      return (short)(MathHelper.floor(this.field_28901) & 65535);
   }

   @Override
   public byte method_26641() {
      return (byte)(MathHelper.floor(this.field_28901) & 0xFF);
   }

   @Override
   public double method_26642() {
      return (double)this.field_28901;
   }

   @Override
   public float method_26639() {
      return this.field_28901;
   }

   @Override
   public Number method_26638() {
      return this.field_28901;
   }
}
