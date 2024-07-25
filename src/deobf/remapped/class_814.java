package remapped;

public final class class_814 {
   private static String[] field_4325;
   public static final float field_4326 = Float.NEGATIVE_INFINITY;
   public static final class_814 field_4323 = new class_814();
   private static final int field_4322 = 32;
   private final float[] field_4324 = new float[32];

   public class_814() {
   }

   public class_814(float[] var1) {
      this.method_3564(var1);
   }

   public class_814(class_8690 var1) {
      this.method_3563(var1);
   }

   public void method_3564(float[] var1) {
      this.method_3567();
      int var4 = var1.length <= 32 ? var1.length : 32;

      for (int var5 = 0; var5 < var4; var5++) {
         this.field_4324[var5] = this.method_3568(var1[var5]);
      }
   }

   public void method_3563(class_8690 var1) {
      this.method_3567();
      byte var4 = 32;

      for (int var5 = 0; var5 < var4; var5++) {
         this.field_4324[var5] = this.method_3568(var1.method_39900(var5));
      }
   }

   public void method_3562(class_814 var1) {
      if (var1 != this) {
         this.method_3564(var1.field_4324);
      }
   }

   public void method_3567() {
      for (int var3 = 0; var3 < 32; var3++) {
         this.field_4324[var3] = 0.0F;
      }
   }

   public int method_3566() {
      return this.field_4324.length;
   }

   public float method_3565(int var1, float var2) {
      float var5 = 0.0F;
      if (var1 >= 0 && var1 < 32) {
         var5 = this.field_4324[var1];
         this.field_4324[var1] = this.method_3568(var2);
      }

      return var5;
   }

   public float method_3558(int var1) {
      float var4 = 0.0F;
      if (var1 >= 0 && var1 < 32) {
         var4 = this.field_4324[var1];
      }

      return var4;
   }

   private float method_3568(float var1) {
      if (var1 != Float.NEGATIVE_INFINITY) {
         if (!(var1 > 1.0F)) {
            return !(var1 < -1.0F) ? var1 : -1.0F;
         } else {
            return 1.0F;
         }
      } else {
         return var1;
      }
   }

   public float[] method_3560() {
      float[] var3 = new float[32];
      int var4 = 0;

      for (byte var5 = 32; var4 < var5; var4++) {
         var3[var4] = this.method_3561(this.field_4324[var4]);
      }

      return var3;
   }

   public float method_3561(float var1) {
      return var1 != Float.NEGATIVE_INFINITY ? (float)Math.pow(2.0, (double)var1) : 0.0F;
   }
}
