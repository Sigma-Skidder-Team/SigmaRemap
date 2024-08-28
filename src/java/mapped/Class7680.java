package mapped;

import it.unimi.dsi.fastutil.floats.Float2FloatFunction;

public final class Class7680 {
   public static Class7680 field32897 = new Class7680(-1.0F, 0.0F, 0.0F);
   public static Class7680 field32898 = new Class7680(1.0F, 0.0F, 0.0F);
   public static Class7680 field32899 = new Class7680(0.0F, -1.0F, 0.0F);
   public static Class7680 field32900 = new Class7680(0.0F, 1.0F, 0.0F);
   public static Class7680 field32901 = new Class7680(0.0F, 0.0F, -1.0F);
   public static Class7680 field32902 = new Class7680(0.0F, 0.0F, 1.0F);
   private float field32903;
   private float field32904;
   private float field32905;

   public Class7680() {
   }

   public Class7680(float var1, float var2, float var3) {
      this.field32903 = var1;
      this.field32904 = var2;
      this.field32905 = var3;
   }

   public Class7680(Vector3d var1) {
      this((float)var1.field18048, (float)var1.field18049, (float)var1.field18050);
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            Class7680 var4 = (Class7680)var1;
            if (Float.compare(var4.field32903, this.field32903) != 0) {
               return false;
            } else {
               return Float.compare(var4.field32904, this.field32904) == 0 ? Float.compare(var4.field32905, this.field32905) == 0 : false;
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
      int var3 = Float.floatToIntBits(this.field32903);
      var3 = 31 * var3 + Float.floatToIntBits(this.field32904);
      return 31 * var3 + Float.floatToIntBits(this.field32905);
   }

   public float method25269() {
      return this.field32903;
   }

   public float method25270() {
      return this.field32904;
   }

   public float method25271() {
      return this.field32905;
   }

   public void method25272(float var1) {
      this.field32903 *= var1;
      this.field32904 *= var1;
      this.field32905 *= var1;
   }

   public void method25273(float var1, float var2, float var3) {
      this.field32903 *= var1;
      this.field32904 *= var2;
      this.field32905 *= var3;
   }

   public void method25274(float var1, float var2) {
      this.field32903 = MathHelper.method37777(this.field32903, var1, var2);
      this.field32904 = MathHelper.method37777(this.field32904, var1, var2);
      this.field32905 = MathHelper.method37777(this.field32905, var1, var2);
   }

   public void method25275(float var1, float var2, float var3) {
      this.field32903 = var1;
      this.field32904 = var2;
      this.field32905 = var3;
   }

   public void method25276(float var1, float var2, float var3) {
      this.field32903 += var1;
      this.field32904 += var2;
      this.field32905 += var3;
   }

   public void method25277(Class7680 var1) {
      this.field32903 = this.field32903 + var1.field32903;
      this.field32904 = this.field32904 + var1.field32904;
      this.field32905 = this.field32905 + var1.field32905;
   }

   public void method25278(Class7680 var1) {
      this.field32903 = this.field32903 - var1.field32903;
      this.field32904 = this.field32904 - var1.field32904;
      this.field32905 = this.field32905 - var1.field32905;
   }

   public float method25279(Class7680 var1) {
      return this.field32903 * var1.field32903 + this.field32904 * var1.field32904 + this.field32905 * var1.field32905;
   }

   public boolean method25280() {
      float var3 = this.field32903 * this.field32903 + this.field32904 * this.field32904 + this.field32905 * this.field32905;
      if (!((double)var3 < 1.0E-5)) {
         float var4 = MathHelper.method37815(var3);
         this.field32903 *= var4;
         this.field32904 *= var4;
         this.field32905 *= var4;
         return true;
      } else {
         return false;
      }
   }

   public void method25281(Class7680 var1) {
      float var4 = this.field32903;
      float var5 = this.field32904;
      float var6 = this.field32905;
      float var7 = var1.method25269();
      float var8 = var1.method25270();
      float var9 = var1.method25271();
      this.field32903 = var5 * var9 - var6 * var8;
      this.field32904 = var6 * var7 - var4 * var9;
      this.field32905 = var4 * var8 - var5 * var7;
   }

   public void method25282(Class8967 var1) {
      float var4 = this.field32903;
      float var5 = this.field32904;
      float var6 = this.field32905;
      this.field32903 = var1.field40499 * var4 + var1.field40500 * var5 + var1.field40501 * var6;
      this.field32904 = var1.field40502 * var4 + var1.field40503 * var5 + var1.field40504 * var6;
      this.field32905 = var1.field40505 * var4 + var1.field40506 * var5 + var1.field40507 * var6;
   }

   public void method25283(Class8661 var1) {
      Class8661 var4 = new Class8661(var1);
      var4.method31182(new Class8661(this.method25269(), this.method25270(), this.method25271(), 0.0F));
      Class8661 var5 = new Class8661(var1);
      var5.method31184();
      var4.method31182(var5);
      this.method25275(var4.method31178(), var4.method31179(), var4.method31180());
   }

   public void method25284(Class7680 var1, float var2) {
      float var5 = 1.0F - var2;
      this.field32903 = this.field32903 * var5 + var1.field32903 * var2;
      this.field32904 = this.field32904 * var5 + var1.field32904 * var2;
      this.field32905 = this.field32905 * var5 + var1.field32905 * var2;
   }

   public Class8661 method25285(float var1) {
      return new Class8661(this, var1, false);
   }

   public Class8661 method25286(float var1) {
      return new Class8661(this, var1, true);
   }

   public Class7680 method25287() {
      return new Class7680(this.field32903, this.field32904, this.field32905);
   }

   public void method25288(Float2FloatFunction var1) {
      this.field32903 = var1.get(this.field32903);
      this.field32904 = var1.get(this.field32904);
      this.field32905 = var1.get(this.field32905);
   }

   @Override
   public String toString() {
      return "[" + this.field32903 + ", " + this.field32904 + ", " + this.field32905 + "]";
   }
}
