package remapped;

import it.unimi.dsi.fastutil.floats.Float2FloatFunction;

public final class class_2426 {
   public static class_2426 field_12073 = new class_2426(-1.0F, 0.0F, 0.0F);
   public static class_2426 field_12080 = new class_2426(1.0F, 0.0F, 0.0F);
   public static class_2426 field_12081 = new class_2426(0.0F, -1.0F, 0.0F);
   public static class_2426 field_12074 = new class_2426(0.0F, 1.0F, 0.0F);
   public static class_2426 field_12082 = new class_2426(0.0F, 0.0F, -1.0F);
   public static class_2426 field_12076 = new class_2426(0.0F, 0.0F, 1.0F);
   private float field_12075;
   private float field_12078;
   private float field_12079;

   public class_2426() {
   }

   public class_2426(float var1, float var2, float var3) {
      this.field_12075 = var1;
      this.field_12078 = var2;
      this.field_12079 = var3;
   }

   public class_2426(class_1343 var1) {
      this((float)var1.field_7336, (float)var1.field_7333, (float)var1.field_7334);
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            class_2426 var4 = (class_2426)var1;
            if (Float.compare(var4.field_12075, this.field_12075) != 0) {
               return false;
            } else {
               return Float.compare(var4.field_12078, this.field_12078) == 0 ? Float.compare(var4.field_12079, this.field_12079) == 0 : false;
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
      int var3 = Float.floatToIntBits(this.field_12075);
      var3 = 31 * var3 + Float.floatToIntBits(this.field_12078);
      return 31 * var3 + Float.floatToIntBits(this.field_12079);
   }

   public float method_11057() {
      return this.field_12075;
   }

   public float method_11061() {
      return this.field_12078;
   }

   public float method_11055() {
      return this.field_12079;
   }

   public void method_11068(float var1) {
      this.field_12075 *= var1;
      this.field_12078 *= var1;
      this.field_12079 *= var1;
   }

   public void method_11069(float var1, float var2, float var3) {
      this.field_12075 *= var1;
      this.field_12078 *= var2;
      this.field_12079 *= var3;
   }

   public void method_11073(float var1, float var2) {
      this.field_12075 = MathHelper.clamp(this.field_12075, var1, var2);
      this.field_12078 = MathHelper.clamp(this.field_12078, var1, var2);
      this.field_12079 = MathHelper.clamp(this.field_12079, var1, var2);
   }

   public void method_11065(float var1, float var2, float var3) {
      this.field_12075 = var1;
      this.field_12078 = var2;
      this.field_12079 = var3;
   }

   public void method_11071(float var1, float var2, float var3) {
      this.field_12075 += var1;
      this.field_12078 += var2;
      this.field_12079 += var3;
   }

   public void method_11072(class_2426 var1) {
      this.field_12075 = this.field_12075 + var1.field_12075;
      this.field_12078 = this.field_12078 + var1.field_12078;
      this.field_12079 = this.field_12079 + var1.field_12079;
   }

   public void method_11064(class_2426 var1) {
      this.field_12075 = this.field_12075 - var1.field_12075;
      this.field_12078 = this.field_12078 - var1.field_12078;
      this.field_12079 = this.field_12079 - var1.field_12079;
   }

   public float method_11067(class_2426 var1) {
      return this.field_12075 * var1.field_12075 + this.field_12078 * var1.field_12078 + this.field_12079 * var1.field_12079;
   }

   public boolean method_11066() {
      float var3 = this.field_12075 * this.field_12075 + this.field_12078 * this.field_12078 + this.field_12079 * this.field_12079;
      if (!((double)var3 < 1.0E-5)) {
         float var4 = MathHelper.method_42836(var3);
         this.field_12075 *= var4;
         this.field_12078 *= var4;
         this.field_12079 *= var4;
         return true;
      } else {
         return false;
      }
   }

   public void method_11054(class_2426 var1) {
      float var4 = this.field_12075;
      float var5 = this.field_12078;
      float var6 = this.field_12079;
      float var7 = var1.method_11057();
      float var8 = var1.method_11061();
      float var9 = var1.method_11055();
      this.field_12075 = var5 * var9 - var6 * var8;
      this.field_12078 = var6 * var7 - var4 * var9;
      this.field_12079 = var4 * var8 - var5 * var7;
   }

   public void method_11059(class_6555 var1) {
      float var4 = this.field_12075;
      float var5 = this.field_12078;
      float var6 = this.field_12079;
      this.field_12075 = var1.field_33414 * var4 + var1.field_33403 * var5 + var1.field_33413 * var6;
      this.field_12078 = var1.field_33411 * var4 + var1.field_33409 * var5 + var1.field_33408 * var6;
      this.field_12079 = var1.field_33415 * var4 + var1.field_33404 * var5 + var1.field_33410 * var6;
   }

   public void method_11058(Quaternion var1) {
      Quaternion var4 = new Quaternion(var1);
      var4.method_24658(new Quaternion(this.method_11057(), this.method_11061(), this.method_11055(), 0.0F));
      Quaternion var5 = new Quaternion(var1);
      var5.method_24652();
      var4.method_24658(var5);
      this.method_11065(var4.method_24653(), var4.method_24647(), var4.method_24648());
   }

   public void method_11063(class_2426 var1, float var2) {
      float var5 = 1.0F - var2;
      this.field_12075 = this.field_12075 * var5 + var1.field_12075 * var2;
      this.field_12078 = this.field_12078 * var5 + var1.field_12078 * var2;
      this.field_12079 = this.field_12079 * var5 + var1.field_12079 * var2;
   }

   public Quaternion method_11062(float var1) {
      return new Quaternion(this, var1, false);
   }

   public Quaternion method_11074(float var1) {
      return new Quaternion(this, var1, true);
   }

   public class_2426 method_11060() {
      return new class_2426(this.field_12075, this.field_12078, this.field_12079);
   }

   public void method_11056(Float2FloatFunction var1) {
      this.field_12075 = var1.get(this.field_12075);
      this.field_12078 = var1.get(this.field_12078);
      this.field_12079 = var1.get(this.field_12079);
   }

   @Override
   public String toString() {
      return "[" + this.field_12075 + ", " + this.field_12078 + ", " + this.field_12079 + "]";
   }
}
