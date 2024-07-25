package remapped;

import java.util.Random;

public class class_686 {
   private final class_8073 field_3775;
   private final class_7821<Integer> field_3777;
   private final class_7821<Boolean> field_3778;
   public boolean field_3773;
   public int field_3774;
   public int field_3776;

   public class_686(class_8073 var1, class_7821<Integer> var2, class_7821<Boolean> var3) {
      this.field_3775 = var1;
      this.field_3777 = var2;
      this.field_3778 = var3;
   }

   public void method_3108() {
      this.field_3773 = true;
      this.field_3774 = 0;
      this.field_3776 = this.field_3775.<Integer>method_36640(this.field_3777);
   }

   public boolean method_3109(Random var1) {
      if (!this.field_3773) {
         this.field_3773 = true;
         this.field_3774 = 0;
         this.field_3776 = var1.nextInt(841) + 140;
         this.field_3775.method_36633(this.field_3777, this.field_3776);
         return true;
      } else {
         return false;
      }
   }

   public void method_3111(class_5734 var1) {
      var1.method_25934("Saddle", this.method_3110());
   }

   public void method_3106(class_5734 var1) {
      this.method_3112(var1.method_25933("Saddle"));
   }

   public void method_3112(boolean var1) {
      this.field_3775.method_36633(this.field_3778, var1);
   }

   public boolean method_3110() {
      return this.field_3775.<Boolean>method_36640(this.field_3778);
   }
}
