package remapped;

import java.io.Serializable;
import java.nio.FloatBuffer;

public class class_8709 implements Serializable {
   private static final long field_44654 = 1393939L;
   public transient class_1299 field_44659 = class_3980.method_18363();
   public static final class_8709 field_44657 = new class_8709(0.0F, 0.0F, 0.0F, 0.0F);
   public static final class_8709 field_44646 = new class_8709(1.0F, 1.0F, 1.0F, 1.0F);
   public static final class_8709 field_44652 = new class_8709(1.0F, 1.0F, 0.0F, 1.0F);
   public static final class_8709 field_44643 = new class_8709(1.0F, 0.0F, 0.0F, 1.0F);
   public static final class_8709 field_44653 = new class_8709(0.0F, 0.0F, 1.0F, 1.0F);
   public static final class_8709 field_44661 = new class_8709(0.0F, 1.0F, 0.0F, 1.0F);
   public static final class_8709 field_44647 = new class_8709(0.0F, 0.0F, 0.0F, 1.0F);
   public static final class_8709 field_44651 = new class_8709(0.5F, 0.5F, 0.5F, 1.0F);
   public static final class_8709 field_44650 = new class_8709(0.0F, 1.0F, 1.0F, 1.0F);
   public static final class_8709 field_44662 = new class_8709(0.3F, 0.3F, 0.3F, 1.0F);
   public static final class_8709 field_44644 = new class_8709(0.7F, 0.7F, 0.7F, 1.0F);
   public static final class_8709 field_44660 = new class_8709(255, 175, 175, 255);
   public static final class_8709 field_44656 = new class_8709(255, 200, 0, 255);
   public static final class_8709 field_44658 = new class_8709(255, 0, 255, 255);
   public float field_44663;
   public float field_44649;
   public float field_44648;
   public float field_44645 = 1.0F;

   public class_8709(class_8709 var1) {
      this.field_44663 = var1.field_44663;
      this.field_44649 = var1.field_44649;
      this.field_44648 = var1.field_44648;
      this.field_44645 = var1.field_44645;
   }

   public class_8709(FloatBuffer var1) {
      this.field_44663 = var1.get();
      this.field_44649 = var1.get();
      this.field_44648 = var1.get();
      this.field_44645 = var1.get();
   }

   public class_8709(float var1, float var2, float var3) {
      this.field_44663 = var1;
      this.field_44649 = var2;
      this.field_44648 = var3;
      this.field_44645 = 1.0F;
   }

   public class_8709(float var1, float var2, float var3, float var4) {
      this.field_44663 = Math.min(var1, 1.0F);
      this.field_44649 = Math.min(var2, 1.0F);
      this.field_44648 = Math.min(var3, 1.0F);
      this.field_44645 = Math.min(var4, 1.0F);
   }

   public class_8709(int var1, int var2, int var3) {
      this.field_44663 = (float)var1 / 255.0F;
      this.field_44649 = (float)var2 / 255.0F;
      this.field_44648 = (float)var3 / 255.0F;
      this.field_44645 = 1.0F;
   }

   public class_8709(int var1, int var2, int var3, int var4) {
      this.field_44663 = (float)var1 / 255.0F;
      this.field_44649 = (float)var2 / 255.0F;
      this.field_44648 = (float)var3 / 255.0F;
      this.field_44645 = (float)var4 / 255.0F;
   }

   public class_8709(int var1) {
      int var4 = (var1 & 0xFF0000) >> 16;
      int var5 = (var1 & 0xFF00) >> 8;
      int var6 = var1 & 0xFF;
      int var7 = (var1 & 0xFF000000) >> 24;
      if (var7 < 0) {
         var7 += 256;
      }

      if (var7 == 0) {
         var7 = 255;
      }

      this.field_44663 = (float)var4 / 255.0F;
      this.field_44649 = (float)var5 / 255.0F;
      this.field_44648 = (float)var6 / 255.0F;
      this.field_44645 = (float)var7 / 255.0F;
   }

   public static class_8709 method_40016(String var0) {
      return new class_8709(Integer.decode(var0));
   }

   public void method_40021() {
      this.field_44659.method_5906(this.field_44663, this.field_44649, this.field_44648, this.field_44645);
   }

   @Override
   public int hashCode() {
      return (int)(this.field_44663 + this.field_44649 + this.field_44648 + this.field_44645) * 255;
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof class_8709)) {
         return false;
      } else {
         class_8709 var4 = (class_8709)var1;
         return var4.field_44663 == this.field_44663
            && var4.field_44649 == this.field_44649
            && var4.field_44648 == this.field_44648
            && var4.field_44645 == this.field_44645;
      }
   }

   @Override
   public String toString() {
      return "Color (" + this.field_44663 + "," + this.field_44649 + "," + this.field_44648 + "," + this.field_44645 + ")";
   }

   public class_8709 method_40023() {
      return this.method_40024(0.5F);
   }

   public class_8709 method_40024(float var1) {
      var1 = 1.0F - var1;
      return new class_8709(this.field_44663 * var1, this.field_44649 * var1, this.field_44648 * var1, this.field_44645);
   }

   public class_8709 method_40029() {
      return this.method_40030(0.2F);
   }

   public int method_40015() {
      return (int)(this.field_44663 * 255.0F);
   }

   public int method_40028() {
      return (int)(this.field_44649 * 255.0F);
   }

   public int method_40027() {
      return (int)(this.field_44648 * 255.0F);
   }

   public int method_40022() {
      return (int)(this.field_44645 * 255.0F);
   }

   public int method_40033() {
      return (int)(this.field_44663 * 255.0F);
   }

   public int method_40025() {
      return (int)(this.field_44649 * 255.0F);
   }

   public int method_40019() {
      return (int)(this.field_44648 * 255.0F);
   }

   public int method_40031() {
      return (int)(this.field_44645 * 255.0F);
   }

   public class_8709 method_40030(float var1) {
      return new class_8709(this.field_44663 * ++var1, this.field_44649 * var1, this.field_44648 * var1, this.field_44645);
   }

   public class_8709 method_40017(class_8709 var1) {
      return new class_8709(
         this.field_44663 * var1.field_44663, this.field_44649 * var1.field_44649, this.field_44648 * var1.field_44648, this.field_44645 * var1.field_44645
      );
   }

   public void method_40034(class_8709 var1) {
      this.field_44663 = this.field_44663 + var1.field_44663;
      this.field_44649 = this.field_44649 + var1.field_44649;
      this.field_44648 = this.field_44648 + var1.field_44648;
      this.field_44645 = this.field_44645 + var1.field_44645;
   }

   public void method_40018(float var1) {
      this.field_44663 *= var1;
      this.field_44649 *= var1;
      this.field_44648 *= var1;
      this.field_44645 *= var1;
   }

   public class_8709 method_40032(class_8709 var1) {
      class_8709 var4 = new class_8709(this.field_44663, this.field_44649, this.field_44648, this.field_44645);
      var4.field_44663 = var4.field_44663 + var1.field_44663;
      var4.field_44649 = var4.field_44649 + var1.field_44649;
      var4.field_44648 = var4.field_44648 + var1.field_44648;
      var4.field_44645 = var4.field_44645 + var1.field_44645;
      return var4;
   }

   public class_8709 method_40020(float var1) {
      class_8709 var4 = new class_8709(this.field_44663, this.field_44649, this.field_44648, this.field_44645);
      var4.field_44663 *= var1;
      var4.field_44649 *= var1;
      var4.field_44648 *= var1;
      var4.field_44645 *= var1;
      return var4;
   }
}
