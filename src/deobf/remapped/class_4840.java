package remapped;

public class class_4840 implements Runnable {
   private static String[] field_24154;

   public class_4840(class_2841 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field_24151 = var1;
      this.field_24155 = var2;
      this.field_24156 = var3;
      this.field_24153 = var4;
      this.field_24152 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_24155; var3 < this.field_24156; var3++) {
         int var4 = var3 * class_2841.method_12913(this.field_24151);

         for (int var5 = 0; var5 < class_2841.method_12928(this.field_24151); var5++) {
            class_2841.method_12923(this.field_24151).method_21131(this.field_24153, var4 + var5 * class_2841.method_12922(this.field_24151), this.field_24152);
         }
      }
   }
}
