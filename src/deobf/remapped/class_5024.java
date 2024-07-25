package remapped;

public class class_5024 {
   public int[] field_25993;
   public final int field_25989;
   public Direction field_25994;
   public class_5155 field_25992;
   private final boolean field_25987;
   private int[] field_25986 = null;
   private class_7397 field_25991;
   private boolean field_25995;
   private class_5024 field_25990;

   public class_5024(int[] var1, int var2, Direction var3, class_5155 var4, boolean var5) {
      this.field_25993 = var1;
      this.field_25989 = var2;
      this.field_25994 = var3;
      this.field_25992 = var4;
      this.field_25987 = var5;
      this.method_23158();
   }

   public int[] method_23155() {
      this.method_23158();
      return this.field_25993;
   }

   public boolean method_23149() {
      return this.field_25989 != -1;
   }

   public int method_23160() {
      return this.field_25989;
   }

   public Direction method_23150() {
      if (this.field_25994 == null) {
         this.field_25994 = class_7265.method_33195(this.method_23155());
      }

      return this.field_25994;
   }

   public boolean method_23168() {
      return this.field_25987;
   }

   public class_5155 method_23148() {
      if (this.field_25992 == null) {
         this.field_25992 = method_23163(this.method_23155());
      }

      return this.field_25992;
   }

   public int[] method_23153() {
      if (this.field_25986 == null) {
         this.field_25986 = method_23167(this.method_23155(), this.method_23148());
      }

      return this.field_25986;
   }

   private static int[] method_23167(int[] var0, class_5155 var1) {
      int[] var4 = (int[])var0.clone();
      int var5 = var4.length / 4;

      for (int var6 = 0; var6 < 4; var6++) {
         int var7 = var6 * var5;
         float var8 = Float.intBitsToFloat(var4[var7 + 4]);
         float var9 = Float.intBitsToFloat(var4[var7 + 4 + 1]);
         float var10 = var1.method_23592(var8);
         float var11 = var1.method_23626(var9);
         var4[var7 + 4] = Float.floatToRawIntBits(var10);
         var4[var7 + 4 + 1] = Float.floatToRawIntBits(var11);
      }

      return var4;
   }

   public void method_23152(class_4688 var1) {
      class_7860.method_35547(class_7860.field_39917, var1, this);
   }

   public class_5155 method_23161() {
      return this.field_25992;
   }

   private static class_5155 method_23163(int[] var0) {
      float var3 = 1.0F;
      float var4 = 1.0F;
      float var5 = 0.0F;
      float var6 = 0.0F;
      int var7 = var0.length / 4;

      for (int var8 = 0; var8 < 4; var8++) {
         int var9 = var8 * var7;
         float var10 = Float.intBitsToFloat(var0[var9 + 4]);
         float var11 = Float.intBitsToFloat(var0[var9 + 4 + 1]);
         var3 = Math.min(var3, var10);
         var4 = Math.min(var4, var11);
         var5 = Math.max(var5, var10);
         var6 = Math.max(var6, var11);
      }

      float var12 = (var3 + var5) / 2.0F;
      float var13 = (var4 + var6) / 2.0F;
      return class_3111.method_14295().method_38533((double)var12, (double)var13);
   }

   public void method_23158() {
      if (!class_3111.method_14424()) {
         if (this.field_25993.length == class_7985.field_40899) {
            this.field_25993 = method_23154(this.field_25993);
         }
      } else if (this.field_25993.length == class_7985.field_40895) {
         this.field_25993 = method_23156(this.field_25993);
      }
   }

   private static int[] method_23156(int[] var0) {
      int var3 = var0.length / 4;
      int var4 = var3 * 2;
      int[] var5 = new int[var4 * 4];

      for (int var6 = 0; var6 < 4; var6++) {
         System.arraycopy(var0, var6 * var3, var5, var6 * var4, var3);
      }

      return var5;
   }

   private static int[] method_23154(int[] var0) {
      int var3 = var0.length / 4;
      int var4 = var3 / 2;
      int[] var5 = new int[var4 * 4];

      for (int var6 = 0; var6 < 4; var6++) {
         System.arraycopy(var0, var6 * var3, var5, var6 * var4, var4);
      }

      return var5;
   }

   public class_7397 method_23170() {
      if (this.field_25991 == null) {
         this.field_25991 = new class_7397(this.method_23155());
      }

      return this.field_25991;
   }

   public float method_23151() {
      class_7397 var3 = this.method_23170();
      return (var3.method_33692() + var3.method_33690()) / 2.0F;
   }

   public double method_23169() {
      class_7397 var3 = this.method_23170();
      return (double)((var3.method_33685() + var3.method_33691()) / 2.0F);
   }

   public double method_23165() {
      class_7397 var3 = this.method_23170();
      return (double)((var3.method_33689() + var3.method_33686()) / 2.0F);
   }

   public boolean method_23164() {
      class_7397 var3 = this.method_23170();
      return var3.method_33684(this.field_25994);
   }

   public boolean method_23159() {
      class_7397 var3 = this.method_23170();
      return var3.method_33688(this.field_25994);
   }

   public boolean method_23166() {
      return this.method_23159() && this.method_23164();
   }

   public class_5024 method_23162() {
      if (!this.field_25995) {
         if (this.field_25990 == null && this.field_25992 != null && this.field_25992.field_26538 != null) {
            this.field_25990 = new class_9363(this, this.field_25992.field_26538);
         }

         this.field_25995 = true;
         return this.field_25990;
      } else {
         return this.field_25990;
      }
   }

   @Override
   public String toString() {
      return "vertexData: " + this.field_25993.length + ", tint: " + this.field_25989 + ", facing: " + this.field_25994 + ", sprite: " + this.field_25992;
   }
}
