package remapped;

public class class_9491 {
   private int field_48367 = -1;
   private int[] field_48366 = null;

   public class_9491(int var1) {
      this.field_48367 = var1;
   }

   public class_9491(int var1, int var2) {
      this.field_48367 = var1;
      if (var2 >= 0) {
         this.field_48366 = new int[]{var2};
      }
   }

   public class_9491(int var1, int[] var2) {
      this.field_48367 = var1;
      this.field_48366 = var2;
   }

   public int method_43838() {
      return this.field_48367;
   }

   public int[] method_43844() {
      return this.field_48366;
   }

   public boolean method_43842(class_2522 var1) {
      return var1.method_11477() == this.field_48367 ? class_2164.method_10061(var1.method_11473(), this.field_48366) : false;
   }

   public boolean method_43841(int var1, int var2) {
      return var1 == this.field_48367 ? class_2164.method_10061(var2, this.field_48366) : false;
   }

   public void method_43843(int var1) {
      if (this.field_48366 != null && var1 >= 0) {
         for (int var4 = 0; var4 < this.field_48366.length; var4++) {
            if (this.field_48366[var4] == var1) {
               return;
            }
         }

         this.field_48366 = class_3111.method_14342(this.field_48366, var1);
      }
   }

   public void method_43839(int[] var1) {
      for (int var4 = 0; var4 < var1.length; var4++) {
         int var5 = var1[var4];
         this.method_43843(var5);
      }
   }

   @Override
   public String toString() {
      return "" + this.field_48367 + ":" + class_3111.method_14287(this.field_48366);
   }
}
