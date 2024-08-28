package mapped;

public final class Class8661 {
   public static final Class8661 field39030 = new Class8661(0.0F, 0.0F, 0.0F, 1.0F);
   private float field39031;
   private float field39032;
   private float field39033;
   private float field39034;

   public Class8661(float var1, float var2, float var3, float var4) {
      this.field39031 = var1;
      this.field39032 = var2;
      this.field39033 = var3;
      this.field39034 = var4;
   }

   public Class8661(Class7680 var1, float var2, boolean var3) {
      if (var3) {
         var2 *= (float) (Math.PI / 180.0);
      }

      float var6 = method31187(var2 / 2.0F);
      this.field39031 = var1.method25269() * var6;
      this.field39032 = var1.method25270() * var6;
      this.field39033 = var1.method25271() * var6;
      this.field39034 = method31186(var2 / 2.0F);
   }

   public Class8661(float var1, float var2, float var3, boolean var4) {
      if (var4) {
         var1 *= (float) (Math.PI / 180.0);
         var2 *= (float) (Math.PI / 180.0);
         var3 *= (float) (Math.PI / 180.0);
      }

      float var7 = method31187(0.5F * var1);
      float var8 = method31186(0.5F * var1);
      float var9 = method31187(0.5F * var2);
      float var10 = method31186(0.5F * var2);
      float var11 = method31187(0.5F * var3);
      float var12 = method31186(0.5F * var3);
      this.field39031 = var7 * var10 * var12 + var8 * var9 * var11;
      this.field39032 = var8 * var9 * var12 - var7 * var10 * var11;
      this.field39033 = var7 * var9 * var12 + var8 * var10 * var11;
      this.field39034 = var8 * var10 * var12 - var7 * var9 * var11;
   }

   public Class8661(Class8661 var1) {
      this.field39031 = var1.field39031;
      this.field39032 = var1.field39032;
      this.field39033 = var1.field39033;
      this.field39034 = var1.field39034;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            Class8661 var4 = (Class8661)var1;
            if (Float.compare(var4.field39031, this.field39031) != 0) {
               return false;
            } else if (Float.compare(var4.field39032, this.field39032) != 0) {
               return false;
            } else {
               return Float.compare(var4.field39033, this.field39033) == 0 ? Float.compare(var4.field39034, this.field39034) == 0 : false;
            }
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      int var3 = Float.floatToIntBits(this.field39031);
      var3 = 31 * var3 + Float.floatToIntBits(this.field39032);
      var3 = 31 * var3 + Float.floatToIntBits(this.field39033);
      return 31 * var3 + Float.floatToIntBits(this.field39034);
   }

   @Override
   public String toString() {
      StringBuilder var3 = new StringBuilder();
      var3.append("Quaternion[").append(this.method31181()).append(" + ");
      var3.append(this.method31178()).append("i + ");
      var3.append(this.method31179()).append("j + ");
      var3.append(this.method31180()).append("k]");
      return var3.toString();
   }

   public float method31178() {
      return this.field39031;
   }

   public float method31179() {
      return this.field39032;
   }

   public float method31180() {
      return this.field39033;
   }

   public float method31181() {
      return this.field39034;
   }

   public void method31182(Class8661 var1) {
      float var4 = this.method31178();
      float var5 = this.method31179();
      float var6 = this.method31180();
      float var7 = this.method31181();
      float var8 = var1.method31178();
      float var9 = var1.method31179();
      float var10 = var1.method31180();
      float var11 = var1.method31181();
      this.field39031 = var7 * var8 + var4 * var11 + var5 * var10 - var6 * var9;
      this.field39032 = var7 * var9 - var4 * var10 + var5 * var11 + var6 * var8;
      this.field39033 = var7 * var10 + var4 * var9 - var5 * var8 + var6 * var11;
      this.field39034 = var7 * var11 - var4 * var8 - var5 * var9 - var6 * var10;
   }

   public void method31183(float var1) {
      this.field39031 *= var1;
      this.field39032 *= var1;
      this.field39033 *= var1;
      this.field39034 *= var1;
   }

   public void method31184() {
      this.field39031 = -this.field39031;
      this.field39032 = -this.field39032;
      this.field39033 = -this.field39033;
   }

   public void method31185(float var1, float var2, float var3, float var4) {
      this.field39031 = var1;
      this.field39032 = var2;
      this.field39033 = var3;
      this.field39034 = var4;
   }

   private static float method31186(float var0) {
      return (float)Math.cos((double)var0);
   }

   private static float method31187(float var0) {
      return (float)Math.sin((double)var0);
   }

   public void method31188() {
      float var3 = this.method31178() * this.method31178()
         + this.method31179() * this.method31179()
         + this.method31180() * this.method31180()
         + this.method31181() * this.method31181();
      if (!(var3 > 1.0E-6F)) {
         this.field39031 = 0.0F;
         this.field39032 = 0.0F;
         this.field39033 = 0.0F;
         this.field39034 = 0.0F;
      } else {
         float var4 = Class9679.method37815(var3);
         this.field39031 *= var4;
         this.field39032 *= var4;
         this.field39033 *= var4;
         this.field39034 *= var4;
      }
   }

   public Class8661 method31189() {
      return new Class8661(this);
   }
}
