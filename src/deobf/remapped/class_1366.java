package remapped;

public class class_1366 {
   private static String[] field_7424;
   public final float field_7423;
   public final float field_7426;
   public final float field_7425;

   public class_1366(float var1, float var2, float var3) {
      this.field_7423 = !Float.isInfinite(var1) && !Float.isNaN(var1) ? var1 % 360.0F : 0.0F;
      this.field_7426 = !Float.isInfinite(var2) && !Float.isNaN(var2) ? var2 % 360.0F : 0.0F;
      this.field_7425 = !Float.isInfinite(var3) && !Float.isNaN(var3) ? var3 % 360.0F : 0.0F;
   }

   public class_1366(class_3416 var1) {
      this(var1.method_15769(0), var1.method_15769(1), var1.method_15769(2));
   }

   public class_3416 method_6282() {
      class_3416 var3 = new class_3416();
      var3.add(class_5718.method_25854(this.field_7423));
      var3.add(class_5718.method_25854(this.field_7426));
      var3.add(class_5718.method_25854(this.field_7425));
      return var3;
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof class_1366)) {
         return false;
      } else {
         class_1366 var4 = (class_1366)var1;
         return this.field_7423 == var4.field_7423 && this.field_7426 == var4.field_7426 && this.field_7425 == var4.field_7425;
      }
   }

   public float method_6280() {
      return this.field_7423;
   }

   public float method_6284() {
      return this.field_7426;
   }

   public float method_6281() {
      return this.field_7425;
   }
}
