package remapped;

public final class Quaternion {
   public static final Quaternion IDENTITY = new Quaternion(0.0F, 0.0F, 0.0F, 1.0F);
   private float x;
   private float y;
   private float w;
   private float h;

   public Quaternion(float var1, float var2, float var3, float var4) {
      this.x = var1;
      this.y = var2;
      this.w = var3;
      this.h = var4;
   }

   public Quaternion(class_2426 var1, float var2, boolean var3) {
      if (var3) {
         var2 *= (float) (Math.PI / 180.0);
      }

      float var6 = method_24654(var2 / 2.0F);
      this.x = var1.method_11057() * var6;
      this.y = var1.method_11061() * var6;
      this.w = var1.method_11055() * var6;
      this.h = method_24655(var2 / 2.0F);
   }

   public Quaternion(float var1, float var2, float var3, boolean var4) {
      if (var4) {
         var1 *= (float) (Math.PI / 180.0);
         var2 *= (float) (Math.PI / 180.0);
         var3 *= (float) (Math.PI / 180.0);
      }

      float var7 = method_24654(0.5F * var1);
      float var8 = method_24655(0.5F * var1);
      float var9 = method_24654(0.5F * var2);
      float var10 = method_24655(0.5F * var2);
      float var11 = method_24654(0.5F * var3);
      float var12 = method_24655(0.5F * var3);
      this.x = var7 * var10 * var12 + var8 * var9 * var11;
      this.y = var8 * var9 * var12 - var7 * var10 * var11;
      this.w = var7 * var9 * var12 + var8 * var10 * var11;
      this.h = var8 * var10 * var12 - var7 * var9 * var11;
   }

   public Quaternion(Quaternion var1) {
      this.x = var1.x;
      this.y = var1.y;
      this.w = var1.w;
      this.h = var1.h;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            Quaternion var4 = (Quaternion)var1;
            if (Float.compare(var4.x, this.x) != 0) {
               return false;
            } else if (Float.compare(var4.y, this.y) != 0) {
               return false;
            } else {
               return Float.compare(var4.w, this.w) == 0 ? Float.compare(var4.h, this.h) == 0 : false;
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
      int var3 = Float.floatToIntBits(this.x);
      var3 = 31 * var3 + Float.floatToIntBits(this.y);
      var3 = 31 * var3 + Float.floatToIntBits(this.w);
      return 31 * var3 + Float.floatToIntBits(this.h);
   }

   @Override
   public String toString() {
      StringBuilder var3 = new StringBuilder();
      var3.append("Quaternion[").append(this.method_24656()).append(" + ");
      var3.append(this.method_24653()).append("i + ");
      var3.append(this.method_24647()).append("j + ");
      var3.append(this.method_24648()).append("k]");
      return var3.toString();
   }

   public float method_24653() {
      return this.x;
   }

   public float method_24647() {
      return this.y;
   }

   public float method_24648() {
      return this.w;
   }

   public float method_24656() {
      return this.h;
   }

   public void method_24658(Quaternion var1) {
      float var4 = this.method_24653();
      float var5 = this.method_24647();
      float var6 = this.method_24648();
      float var7 = this.method_24656();
      float var8 = var1.method_24653();
      float var9 = var1.method_24647();
      float var10 = var1.method_24648();
      float var11 = var1.method_24656();
      this.x = var7 * var8 + var4 * var11 + var5 * var10 - var6 * var9;
      this.y = var7 * var9 - var4 * var10 + var5 * var11 + var6 * var8;
      this.w = var7 * var10 + var4 * var9 - var5 * var8 + var6 * var11;
      this.h = var7 * var11 - var4 * var8 - var5 * var9 - var6 * var10;
   }

   public void method_24657(float var1) {
      this.x *= var1;
      this.y *= var1;
      this.w *= var1;
      this.h *= var1;
   }

   public void method_24652() {
      this.x = -this.x;
      this.y = -this.y;
      this.w = -this.w;
   }

   public void method_24650(float var1, float var2, float var3, float var4) {
      this.x = var1;
      this.y = var2;
      this.w = var3;
      this.h = var4;
   }

   private static float method_24655(float var0) {
      return (float)Math.cos((double)var0);
   }

   private static float method_24654(float var0) {
      return (float)Math.sin((double)var0);
   }

   public void method_24659() {
      float var3 = this.method_24653() * this.method_24653()
         + this.method_24647() * this.method_24647()
         + this.method_24648() * this.method_24648()
         + this.method_24656() * this.method_24656();
      if (!(var3 > 1.0E-6F)) {
         this.x = 0.0F;
         this.y = 0.0F;
         this.w = 0.0F;
         this.h = 0.0F;
      } else {
         float var4 = class_9299.method_42836(var3);
         this.x *= var4;
         this.y *= var4;
         this.w *= var4;
         this.h *= var4;
      }
   }

   public Quaternion method_24651() {
      return new Quaternion(this);
   }
}
