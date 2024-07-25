package remapped;

import java.util.Random;

public class class_801 extends class_3200<class_1941> {
   private static String[] field_4293;
   private boolean field_4292;

   public class_801(class_5390<class_1941> var1, int var2, int var3, class_9616 var4, int var5, long var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public void method_3545(class_6322 var1, class_6541 var2, class_5799 var3, int var4, int var5, class_6325 var6, class_1941 var7) {
      this.method_3544(var4, var5);
   }

   private void method_3544(int var1, int var2) {
      int var5 = var1 * 16 - 29;
      int var6 = var2 * 16 - 29;
      class_240 var7 = class_9594.field_48893.method_44313(this.field_15989);
      this.field_15986.add(new class_9362(this.field_15989, var5, var6, var7));
      this.method_14720();
      this.field_4292 = true;
   }

   @Override
   public void method_14719(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6) {
      if (!this.field_4292) {
         this.field_15986.clear();
         this.method_3544(this.method_14722(), this.method_14726());
      }

      super.method_14719(var1, var2, var3, var4, var5, var6);
   }
}
