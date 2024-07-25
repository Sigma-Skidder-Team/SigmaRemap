package remapped;

public class class_8162 implements Runnable {
   private static String[] field_41815;

   public class_8162(class_5298 var1, int var2, int var3, int var4, float[] var5, float[] var6) {
      this.field_41818 = var1;
      this.field_41814 = var2;
      this.field_41812 = var3;
      this.field_41813 = var4;
      this.field_41816 = var5;
      this.field_41817 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field_41814; var3 < this.field_41812; var3++) {
         int var4 = 2 * var3;
         int var5 = var4 + 1;
         int var6 = this.field_41813 + var3;
         this.field_41816[var4] = this.field_41817[var6] * class_5298.method_24225(this.field_41818)[var4];
         this.field_41816[var5] = this.field_41817[var6] * class_5298.method_24225(this.field_41818)[var5];
      }
   }
}
