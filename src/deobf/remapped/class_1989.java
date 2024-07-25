package remapped;

public class class_1989 implements Runnable {
   private static String[] field_10070;

   public class_1989(class_3381 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field_10071 = var1;
      this.field_10074 = var2;
      this.field_10073 = var3;
      this.field_10072 = var4;
      this.field_10075 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_10074; var3 < this.field_10073; var3++) {
         for (int var4 = 0; var4 < class_3381.method_15581(this.field_10071); var4++) {
            class_3381.method_15625(this.field_10071).method_24171(this.field_10072[var3][var4], this.field_10075);
         }
      }
   }
}
