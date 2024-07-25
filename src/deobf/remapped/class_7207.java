package remapped;

public class class_7207 extends class_5348 {
   private final boolean field_37024;
   private final boolean field_37025;

   public class_7207(boolean var1, boolean var2) {
      super("write_mask_state", () -> {
         if (!var2) {
            class_3542.method_16387(var2);
         }

         if (!var1) {
            class_3542.method_16405(var1, var1, var1, var1);
         }
      }, () -> {
         if (!var2) {
            class_3542.method_16387(true);
         }

         if (!var1) {
            class_3542.method_16405(true, true, true, true);
         }
      });
      this.field_37024 = var1;
      this.field_37025 = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         class_7207 var4 = (class_7207)var1;
         return this.field_37024 == var4.field_37024 && this.field_37025 == var4.field_37025;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return class_5129.method_23527(this.field_37024, this.field_37025);
   }

   @Override
   public String toString() {
      return this.field_27283 + "[writeColor=" + this.field_37024 + ", writeDepth=" + this.field_37025 + ']';
   }
}
