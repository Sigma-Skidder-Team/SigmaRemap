package mapped;

public final class Class6625 {
   private static String[] field29145;
   public static final float field29146 = Float.NEGATIVE_INFINITY;
   public static final Class6625 field29147 = new Class6625();
   private static final int field29148 = 32;
   private final float[] field29149 = new float[32];

   public Class6625() {
   }

   public Class6625(float[] var1) {
      this.method20192(var1);
   }

   public Class6625(Class9515 var1) {
      this.method20193(var1);
   }

   public void method20192(float[] var1) {
      this.method20195();
      int var4 = var1.length <= 32 ? var1.length : 32;

      for (int var5 = 0; var5 < var4; var5++) {
         this.field29149[var5] = this.method20199(var1[var5]);
      }
   }

   public void method20193(Class9515 var1) {
      this.method20195();
      int var4 = 32;

      for (int var5 = 0; var5 < var4; var5++) {
         this.field29149[var5] = this.method20199(var1.method36765(var5));
      }
   }

   public void method20194(Class6625 var1) {
      if (var1 != this) {
         this.method20192(var1.field29149);
      }
   }

   public void method20195() {
      for (int var3 = 0; var3 < 32; var3++) {
         this.field29149[var3] = 0.0F;
      }
   }

   public int method20196() {
      return this.field29149.length;
   }

   public float method20197(int var1, float var2) {
      float var5 = 0.0F;
      if (var1 >= 0 && var1 < 32) {
         var5 = this.field29149[var1];
         this.field29149[var1] = this.method20199(var2);
      }

      return var5;
   }

   public float method20198(int var1) {
      float var4 = 0.0F;
      if (var1 >= 0 && var1 < 32) {
         var4 = this.field29149[var1];
      }

      return var4;
   }

   private float method20199(float var1) {
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

   public float[] method20200() {
      float[] var3 = new float[32];
      int var4 = 0;

      for (int var5 = 32; var4 < var5; var4++) {
         var3[var4] = this.method20201(this.field29149[var4]);
      }

      return var3;
   }

   public float method20201(float var1) {
      return var1 != Float.NEGATIVE_INFINITY ? (float)Math.pow(2.0, (double)var1) : 0.0F;
   }
}
