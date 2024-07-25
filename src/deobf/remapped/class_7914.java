package remapped;

public class class_7914 {
   private static String[] field_40450;
   private final int field_40452;
   private final class_7914[] field_40456 = new class_7914[6];
   private final boolean[] field_40455 = new boolean[6];
   private boolean field_40454;
   private boolean field_40453;
   private int field_40451;

   public class_7914(int var1) {
      this.field_40452 = var1;
   }

   public void method_35814(class_240 var1, class_7914 var2) {
      this.field_40456[var1.method_1050()] = var2;
      var2.field_40456[var1.method_1046().method_1050()] = this;
   }

   public void method_35812() {
      for (int var3 = 0; var3 < 6; var3++) {
         this.field_40455[var3] = this.field_40456[var3] != null;
      }
   }

   public boolean method_35810(int var1) {
      if (!this.field_40453) {
         this.field_40451 = var1;

         for (int var4 = 0; var4 < 6; var4++) {
            if (this.field_40456[var4] != null
               && this.field_40455[var4]
               && this.field_40456[var4].field_40451 != var1
               && this.field_40456[var4].method_35810(var1)) {
               return true;
            }
         }

         return false;
      } else {
         return true;
      }
   }

   public boolean method_35811() {
      return this.field_40452 >= 75;
   }

   public int method_35815() {
      int var3 = 0;

      for (int var4 = 0; var4 < 6; var4++) {
         if (this.field_40455[var4]) {
            var3++;
         }
      }

      return var3;
   }
}
