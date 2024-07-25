package remapped;

import java.util.Random;

public class class_7986 implements class_3254 {
   private static String[] field_40920;
   private final float field_40919;
   private final float field_40921;

   public class_7986(float var1, float var2) {
      this.field_40919 = var1;
      this.field_40921 = var2;
   }

   public class_7986(float var1) {
      this.field_40919 = var1;
      this.field_40921 = var1;
   }

   public static class_7986 method_36238(float var0, float var1) {
      return new class_7986(var0, var1);
   }

   public float method_36243() {
      return this.field_40919;
   }

   public float method_36242() {
      return this.field_40921;
   }

   @Override
   public int method_14868(Random var1) {
      return MathHelper.nextInt(var1, MathHelper.floor(this.field_40919), MathHelper.floor(this.field_40921));
   }

   public float method_36244(Random var1) {
      return MathHelper.nextFloat(var1, this.field_40919, this.field_40921);
   }

   public boolean method_36241(int var1) {
      return (float)var1 <= this.field_40921 && (float)var1 >= this.field_40919;
   }

   @Override
   public Identifier method_14869() {
      return field_16151;
   }
}
