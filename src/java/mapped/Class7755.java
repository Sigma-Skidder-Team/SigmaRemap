package mapped;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Quaternion;
import net.minecraft.util.math.vector.Vector3f;

public class Class7755 {
   private float field33317;
   private float field33318;
   private float field33319;
   private float field33320;

   public Class7755() {
   }

   public Class7755(float var1, float var2, float var3, float var4) {
      this.field33317 = var1;
      this.field33318 = var2;
      this.field33319 = var3;
      this.field33320 = var4;
   }

   public Class7755(Vector3f var1) {
      this(var1.method25269(), var1.method25270(), var1.method25271(), 1.0F);
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            Class7755 var4 = (Class7755)var1;
            if (Float.compare(var4.field33317, this.field33317) != 0) {
               return false;
            } else if (Float.compare(var4.field33318, this.field33318) != 0) {
               return false;
            } else {
               return Float.compare(var4.field33319, this.field33319) == 0 ? Float.compare(var4.field33320, this.field33320) == 0 : false;
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
      int var3 = Float.floatToIntBits(this.field33317);
      var3 = 31 * var3 + Float.floatToIntBits(this.field33318);
      var3 = 31 * var3 + Float.floatToIntBits(this.field33319);
      return 31 * var3 + Float.floatToIntBits(this.field33320);
   }

   public float method25701() {
      return this.field33317;
   }

   public float method25702() {
      return this.field33318;
   }

   public float method25703() {
      return this.field33319;
   }

   public float method25704() {
      return this.field33320;
   }

   public void method25705(Vector3f var1) {
      this.field33317 = this.field33317 * var1.method25269();
      this.field33318 = this.field33318 * var1.method25270();
      this.field33319 = this.field33319 * var1.method25271();
   }

   public void method25706(float var1, float var2, float var3, float var4) {
      this.field33317 = var1;
      this.field33318 = var2;
      this.field33319 = var3;
      this.field33320 = var4;
   }

   public float method25707(Class7755 var1) {
      return this.field33317 * var1.field33317 + this.field33318 * var1.field33318 + this.field33319 * var1.field33319 + this.field33320 * var1.field33320;
   }

   public boolean method25708() {
      float var3 = this.field33317 * this.field33317
         + this.field33318 * this.field33318
         + this.field33319 * this.field33319
         + this.field33320 * this.field33320;
      if (!((double)var3 < 1.0E-5)) {
         float var4 = MathHelper.method37815(var3);
         this.field33317 *= var4;
         this.field33318 *= var4;
         this.field33319 *= var4;
         this.field33320 *= var4;
         return true;
      } else {
         return false;
      }
   }

   public void method25709(Matrix4f var1) {
      float var4 = this.field33317;
      float var5 = this.field33318;
      float var6 = this.field33319;
      float var7 = this.field33320;
      this.field33317 = var1.field43471 * var4 + var1.field43472 * var5 + var1.field43473 * var6 + var1.field43474 * var7;
      this.field33318 = var1.field43475 * var4 + var1.field43476 * var5 + var1.field43477 * var6 + var1.field43478 * var7;
      this.field33319 = var1.field43479 * var4 + var1.field43480 * var5 + var1.field43481 * var6 + var1.field43482 * var7;
      this.field33320 = var1.field43483 * var4 + var1.field43484 * var5 + var1.field43485 * var6 + var1.field43486 * var7;
   }

   public void method25710(Quaternion var1) {
      Quaternion var4 = new Quaternion(var1);
      var4.multiply(new Quaternion(this.method25701(), this.method25702(), this.method25703(), 0.0F));
      Quaternion var5 = new Quaternion(var1);
      var5.conjugate();
      var4.multiply(var5);
      this.method25706(var4.method31178(), var4.method31179(), var4.method31180(), this.method25704());
   }

   public void method25711() {
      this.field33317 = this.field33317 / this.field33320;
      this.field33318 = this.field33318 / this.field33320;
      this.field33319 = this.field33319 / this.field33320;
      this.field33320 = 1.0F;
   }

   @Override
   public String toString() {
      return "[" + this.field33317 + ", " + this.field33318 + ", " + this.field33319 + ", " + this.field33320 + "]";
   }
}
