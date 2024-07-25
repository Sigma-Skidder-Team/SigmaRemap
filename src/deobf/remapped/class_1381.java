package remapped;

public class class_1381 implements Runnable {
   private static String[] field_7492;

   public class_1381(class_2817 var1, int var2, int var3, int var4, float[] var5, boolean var6) {
      this.field_7488 = var1;
      this.field_7493 = var2;
      this.field_7489 = var3;
      this.field_7494 = var4;
      this.field_7491 = var5;
      this.field_7490 = var6;
   }

   @Override
   public void run() {
      if (this.field_7493 != -1) {
         for (int var3 = this.field_7489; var3 < class_2817.method_12821(this.field_7488); var3 += this.field_7494) {
            class_2817.method_12831(this.field_7488).method_17789(this.field_7491, var3 * class_2817.method_12836(this.field_7488), this.field_7490);
         }
      } else {
         for (int var4 = this.field_7489; var4 < class_2817.method_12821(this.field_7488); var4 += this.field_7494) {
            class_2817.method_12831(this.field_7488).method_17786(this.field_7491, var4 * class_2817.method_12836(this.field_7488));
         }
      }
   }
}
