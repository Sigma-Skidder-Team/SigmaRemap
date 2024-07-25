package remapped;

public class class_6031 implements Runnable {
   private static String[] field_30801;

   public class_6031(class_4993 var1, int var2, int var3, float[][] var4, float[][] var5, boolean var6) {
      this.field_30804 = var1;
      this.field_30802 = var2;
      this.field_30805 = var3;
      this.field_30800 = var4;
      this.field_30803 = var5;
      this.field_30806 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field_30802; var3 < this.field_30805; var3++) {
         int var4 = 2 * var3;

         for (int var5 = 0; var5 < class_4993.method_22973(this.field_30804); var5++) {
            int var6 = 2 * var5;
            this.field_30800[var3][var6] = this.field_30803[var5][var4];
            this.field_30800[var3][var6 + 1] = this.field_30803[var5][var4 + 1];
         }

         class_4993.method_22985(this.field_30804).method_24216(this.field_30800[var3], this.field_30806);
      }
   }
}
