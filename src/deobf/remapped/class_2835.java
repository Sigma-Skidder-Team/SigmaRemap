package remapped;

public class class_2835 implements Runnable {
   private static String[] field_13892;

   public class_2835(class_8751 var1, int var2, int var3, float[][] var4, boolean var5) {
      this.field_13890 = var1;
      this.field_13889 = var2;
      this.field_13891 = var3;
      this.field_13893 = var4;
      this.field_13888 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_13889; var3 < this.field_13891; var3++) {
         class_8751.method_40165(this.field_13890).method_21140(this.field_13893[var3], this.field_13888);
      }
   }
}
