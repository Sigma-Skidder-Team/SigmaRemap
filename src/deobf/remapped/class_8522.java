package remapped;

public class class_8522 {
   private static String[] field_43616;
   private class_9859 field_43618;
   private Class field_43617;
   private int field_43615;
   private class_1790[] field_43619;

   public class_8522(class_9859 var1, Class var2, int var3) {
      this.field_43618 = var1;
      this.field_43617 = var2;
      if (var1.method_45472() && var2 != null) {
         this.field_43619 = new class_1790[var3];

         for (int var6 = 0; var6 < this.field_43619.length; var6++) {
            this.field_43619[var6] = new class_1790(var1, var2, var6);
         }
      }
   }

   public class_9859 method_39232() {
      return this.field_43618;
   }

   public Class method_39235() {
      return this.field_43617;
   }

   public int method_39237() {
      return this.field_43615;
   }

   public class_1790 method_39233(int var1) {
      return var1 >= 0 && var1 < this.field_43619.length ? this.field_43619[var1] : null;
   }

   public Object method_39231(Object var1, int var2) {
      return class_7860.method_35558(var1, this, var2);
   }

   public void method_39234(Object var1, int var2, Object var3) {
      class_7860.method_35562(var1, this, var2, var3);
   }

   public boolean method_39238() {
      if (this.field_43619 == null) {
         return false;
      } else {
         for (int var3 = 0; var3 < this.field_43619.length; var3++) {
            class_1790 var4 = this.field_43619[var3];
            if (!var4.method_7978()) {
               return false;
            }
         }

         return true;
      }
   }
}
