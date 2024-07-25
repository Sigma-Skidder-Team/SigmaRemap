package remapped;

public class class_1127 extends class_4785<class_1127> {
   private static String[] field_6434;
   private final class_7395 field_6436;

   public class_1127(class_2060 var1, class_7395 var2) {
      this.field_6435 = var1;
      this.field_6436 = var2;
   }

   @Override
   public void method_21644(class_7966 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      String var13 = this.field_6436.toString();
      this.field_6435
         .field_10413
         .field_948
         .method_45380(
            var1,
            var13,
            (float)(class_2060.method_9616(this.field_6435) / 2 - this.field_6435.field_10413.field_948.method_45395(var13) / 2),
            (float)(var3 + 1),
            16777215,
            true
         );
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      if (var5 != 0) {
         return false;
      } else {
         this.method_4956();
         return true;
      }
   }

   private void method_4956() {
      this.field_6435.method_9615(this);
   }
}
