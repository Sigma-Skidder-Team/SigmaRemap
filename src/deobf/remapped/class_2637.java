package remapped;

public class class_2637 {
   private float field_12999;
   private float field_13003;
   private float field_13002;
   private float field_13001;

   public class_2637() {
   }

   public class_2637(float var1, float var2, float var3, float var4) {
      this.field_12999 = var1;
      this.field_13003 = var2;
      this.field_13002 = var3;
      this.field_13001 = var4;
   }

   public class_2637(class_2426 var1) {
      this(var1.method_11057(), var1.method_11061(), var1.method_11055(), 1.0F);
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            class_2637 var4 = (class_2637)var1;
            if (Float.compare(var4.field_12999, this.field_12999) != 0) {
               return false;
            } else if (Float.compare(var4.field_13003, this.field_13003) != 0) {
               return false;
            } else {
               return Float.compare(var4.field_13002, this.field_13002) == 0 ? Float.compare(var4.field_13001, this.field_13001) == 0 : false;
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
      int var3 = Float.floatToIntBits(this.field_12999);
      var3 = 31 * var3 + Float.floatToIntBits(this.field_13003);
      var3 = 31 * var3 + Float.floatToIntBits(this.field_13002);
      return 31 * var3 + Float.floatToIntBits(this.field_13001);
   }

   public float method_11923() {
      return this.field_12999;
   }

   public float method_11922() {
      return this.field_13003;
   }

   public float method_11927() {
      return this.field_13002;
   }

   public float method_11924() {
      return this.field_13001;
   }

   public void method_11926(class_2426 var1) {
      this.field_12999 = this.field_12999 * var1.method_11057();
      this.field_13003 = this.field_13003 * var1.method_11061();
      this.field_13002 = this.field_13002 * var1.method_11055();
   }

   public void method_11925(float var1, float var2, float var3, float var4) {
      this.field_12999 = var1;
      this.field_13003 = var2;
      this.field_13002 = var3;
      this.field_13001 = var4;
   }

   public float method_11930(class_2637 var1) {
      return this.field_12999 * var1.field_12999
         + this.field_13003 * var1.field_13003
         + this.field_13002 * var1.field_13002
         + this.field_13001 * var1.field_13001;
   }

   public boolean method_11920() {
      float var3 = this.field_12999 * this.field_12999
         + this.field_13003 * this.field_13003
         + this.field_13002 * this.field_13002
         + this.field_13001 * this.field_13001;
      if (!((double)var3 < 1.0E-5)) {
         float var4 = MathHelper.method_42836(var3);
         this.field_12999 *= var4;
         this.field_13003 *= var4;
         this.field_13002 *= var4;
         this.field_13001 *= var4;
         return true;
      } else {
         return false;
      }
   }

   public void method_11929(class_8107 var1) {
      float var4 = this.field_12999;
      float var5 = this.field_13003;
      float var6 = this.field_13002;
      float var7 = this.field_13001;
      this.field_12999 = var1.field_41531 * var4 + var1.field_41518 * var5 + var1.field_41521 * var6 + var1.field_41517 * var7;
      this.field_13003 = var1.field_41520 * var4 + var1.field_41519 * var5 + var1.field_41528 * var6 + var1.field_41516 * var7;
      this.field_13002 = var1.field_41523 * var4 + var1.field_41525 * var5 + var1.field_41522 * var6 + var1.field_41532 * var7;
      this.field_13001 = var1.field_41524 * var4 + var1.field_41526 * var5 + var1.field_41530 * var6 + var1.field_41527 * var7;
   }

   public void method_11928(Quaternion var1) {
      Quaternion var4 = new Quaternion(var1);
      var4.method_24658(new Quaternion(this.method_11923(), this.method_11922(), this.method_11927(), 0.0F));
      Quaternion var5 = new Quaternion(var1);
      var5.method_24652();
      var4.method_24658(var5);
      this.method_11925(var4.method_24653(), var4.method_24647(), var4.method_24648(), this.method_11924());
   }

   public void method_11919() {
      this.field_12999 = this.field_12999 / this.field_13001;
      this.field_13003 = this.field_13003 / this.field_13001;
      this.field_13002 = this.field_13002 / this.field_13001;
      this.field_13001 = 1.0F;
   }

   @Override
   public String toString() {
      return "[" + this.field_12999 + ", " + this.field_13003 + ", " + this.field_13002 + ", " + this.field_13001 + "]";
   }
}
