package remapped;

public class class_944 {
   private static String[] field_4824;
   public static final class_944 field_4823 = new class_944(new class_2426(), new class_2426(), new class_2426(1.0F, 1.0F, 1.0F));
   public final class_2426 field_4821;
   public final class_2426 field_4825;
   public final class_2426 field_4822;

   public class_944(class_2426 var1, class_2426 var2, class_2426 var3) {
      this.field_4821 = var1.method_11060();
      this.field_4825 = var2.method_11060();
      this.field_4822 = var3.method_11060();
   }

   public void method_4082(boolean var1, class_7966 var2) {
      if (this != field_4823) {
         float var5 = this.field_4821.method_11057();
         float var6 = this.field_4821.method_11061();
         float var7 = this.field_4821.method_11055();
         if (var1) {
            var6 = -var6;
            var7 = -var7;
         }

         int var8 = !var1 ? 1 : -1;
         var2.method_36065(
            (double)((float)var8 * this.field_4825.method_11057()), (double)this.field_4825.method_11061(), (double)this.field_4825.method_11055()
         );
         var2.method_36060(new Quaternion(var5, var6, var7, true));
         var2.method_36062(this.field_4822.method_11057(), this.field_4822.method_11061(), this.field_4822.method_11055());
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (this.getClass() != var1.getClass()) {
            return false;
         } else {
            class_944 var4 = (class_944)var1;
            return this.field_4821.equals(var4.field_4821) && this.field_4822.equals(var4.field_4822) && this.field_4825.equals(var4.field_4825);
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.field_4821.hashCode();
      var3 = 31 * var3 + this.field_4825.hashCode();
      return 31 * var3 + this.field_4822.hashCode();
   }
}
