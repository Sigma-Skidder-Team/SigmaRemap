package remapped;

public class class_1234 implements Runnable {
   private static String[] field_6808;

   public class_1234(class_9035 var1, int var2, int var3, int var4, double[][] var5) {
      this.field_6807 = var1;
      this.field_6806 = var2;
      this.field_6809 = var3;
      this.field_6805 = var4;
      this.field_6804 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_6806; var3 < this.field_6809; var3++) {
         int var4 = class_9035.method_41470(this.field_6807) - var3;

         for (int var5 = this.field_6805; var5 < class_9035.method_41431(this.field_6807); var5++) {
            int var6 = 2 * var5;
            int var7 = 2 * (class_9035.method_41431(this.field_6807) - var5);
            this.field_6804[0][var6] = this.field_6804[0][var7];
            this.field_6804[0][var6 + 1] = -this.field_6804[0][var7 + 1];
            this.field_6804[var3][var6] = this.field_6804[var4][var7];
            this.field_6804[var3][var6 + 1] = -this.field_6804[var4][var7 + 1];
         }
      }
   }
}
