package remapped;

import java.util.logging.Level;
import net.sourceforge.jaad.aac.AACException;

public class class_9426 {
   private static final float field_48156 = -9.765625E-4F;
   private static final float field_48160 = -1024.0F;
   private static final int field_48159 = 672;
   private static final float field_48158 = 0.953125F;
   private static final float field_48163 = 0.90625F;
   private boolean field_48155;
   private int field_48157;
   private boolean[] field_48154;
   private class_7326[] field_48162 = new class_7326[672];

   public class_9426() {
      this.method_43623();
   }

   public void method_43625(class_7390 var1, int var2, class_8965 var3) throws AACException {
      int var6 = var3.method_41127();
      if (this.field_48155 = var1.method_33660()) {
         this.field_48157 = var1.method_33662(5);
      }

      int var7 = var3.method_41133();
      int var8 = Math.min(var2, var7);
      this.field_48154 = new boolean[var8];

      for (int var9 = 0; var9 < var8; var9++) {
         this.field_48154[var9] = var1.method_33660();
      }

      class_3471.field_17021.log(Level.WARNING, "ICPrediction: maxSFB={0}, maxPredSFB={1}", new int[]{var2, var7});
   }

   public void method_43626(int var1) {
      this.field_48154[var1] = false;
   }

   public void method_43628(class_9143 var1, float[] var2, class_8965 var3) {
      class_2568 var6 = var1.method_42072();
      if (!var6.method_11676()) {
         int var7 = Math.min(var3.method_41133(), var6.method_11671());
         int[] var8 = var6.method_11674();

         for (int var9 = 0; var9 < var7; var9++) {
            for (int var10 = var8[var9]; var10 < var8[var9 + 1]; var10++) {
               this.method_43631(var2, var10, this.field_48154[var9]);
            }
         }

         if (this.field_48155) {
            this.method_43624(this.field_48157);
         }
      } else {
         this.method_43623();
      }
   }

   private void method_43627(int var1) {
      if (this.field_48162[var1] == null) {
         this.field_48162[var1] = new class_7326(null);
      }

      this.field_48162[var1].field_37442 = 0.0F;
      this.field_48162[var1].field_37446 = 0.0F;
      this.field_48162[var1].field_37444 = 0.0F;
      this.field_48162[var1].field_37448 = 0.0F;
      this.field_48162[var1].field_37447 = 16256.0F;
      this.field_48162[var1].field_37443 = 16256.0F;
   }

   private void method_43623() {
      for (int var3 = 0; var3 < this.field_48162.length; var3++) {
         this.method_43627(var3);
      }
   }

   private void method_43624(int var1) {
      for (int var4 = var1 - 1; var4 < this.field_48162.length; var4 += 30) {
         this.method_43627(var4);
      }
   }

   private void method_43631(float[] var1, int var2, boolean var3) {
      if (this.field_48162[var2] == null) {
         this.field_48162[var2] = new class_7326(null);
      }

      class_7326 var6 = this.field_48162[var2];
      float var7 = var6.field_37442;
      float var8 = var6.field_37446;
      float var9 = var6.field_37444;
      float var10 = var6.field_37448;
      float var11 = var6.field_37447;
      float var12 = var6.field_37443;
      float var13 = !(var11 > 1.0F) ? 0.0F : var9 * this.method_43629(0.953125F / var11);
      float var14 = !(var12 > 1.0F) ? 0.0F : var10 * this.method_43629(0.953125F / var12);
      float var15 = this.method_43632(var13 * var7 + var14 * var8);
      if (var3) {
         var1[var2] += var15 * -9.765625E-4F;
      }

      float var16 = var1[var2] * -1024.0F;
      float var17 = var16 - var13 * var7;
      var6.field_37448 = this.method_43622(0.90625F * var10 + var8 * var17);
      var6.field_37443 = this.method_43622(0.90625F * var12 + 0.5F * (var8 * var8 + var17 * var17));
      var6.field_37444 = this.method_43622(0.90625F * var9 + var7 * var16);
      var6.field_37447 = this.method_43622(0.90625F * var11 + 0.5F * (var7 * var7 + var16 * var16));
      var6.field_37446 = this.method_43622(0.953125F * (var7 - var13 * var16));
      var6.field_37442 = this.method_43622(0.953125F * var16);
   }

   private float method_43632(float var1) {
      return Float.intBitsToFloat(Float.floatToIntBits(var1) + 32768 & -65536);
   }

   private float method_43629(float var1) {
      int var4 = Float.floatToIntBits(var1);
      var4 = var4 + 32767 + (var4 & 1) & -65536;
      return Float.intBitsToFloat(var4);
   }

   private float method_43622(float var1) {
      return Float.intBitsToFloat(Float.floatToIntBits(var1) & -65536);
   }
}
