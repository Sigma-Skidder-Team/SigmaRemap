package remapped;

public class class_9393 implements Runnable {
   private static String[] field_47996;

   public class_9393(class_4993 var1, int var2, int var3, float[][] var4) {
      this.field_47997 = var1;
      this.field_47998 = var2;
      this.field_47995 = var3;
      this.field_47994 = var4;
   }

   @Override
   public void run() {
      float[] var3 = new float[2 * class_4993.method_22973(this.field_47997)];

      for (int var4 = this.field_47998; var4 < this.field_47995; var4++) {
         int var5 = 2 * var4;

         for (int var6 = 0; var6 < class_4993.method_22973(this.field_47997); var6++) {
            int var7 = 2 * var6;
            var3[var7] = this.field_47994[var6][var5];
            var3[var7 + 1] = this.field_47994[var6][var5 + 1];
         }

         class_4993.method_22985(this.field_47997).method_24185(var3);

         for (int var8 = 0; var8 < class_4993.method_22973(this.field_47997); var8++) {
            int var9 = 2 * var8;
            this.field_47994[var8][var5] = var3[var9];
            this.field_47994[var8][var5 + 1] = var3[var9 + 1];
         }
      }
   }
}
