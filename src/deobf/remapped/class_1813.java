package remapped;

public class class_1813 implements class_6839 {
   private class_4487 field_9213;
   private int field_9215;
   private int field_9214;

   public class_1813(class_4487 var1) {
      this(var1, 0, 0);
   }

   public class_1813(class_4487 var1, int var2) {
      this(var1, var2, 0);
   }

   public class_1813(class_4487 var1, int var2, int var3) {
      this.field_9213 = var1;
      this.field_9215 = var2;
      this.field_9214 = var3;
   }

   @Override
   public float method_31353() {
      return this.field_9213.method_20841(this.field_9215, this.field_9214);
   }

   @Override
   public String toString() {
      if (this.field_9213.method_20837() != null) {
         return this.field_9213.method_20838() != null
            ? "" + this.field_9213 + "." + this.field_9213.method_20837()[this.field_9215] + "." + this.field_9213.method_20838()[this.field_9214]
            : "" + this.field_9213 + "." + this.field_9213.method_20837()[this.field_9215];
      } else {
         return "" + this.field_9213;
      }
   }
}
