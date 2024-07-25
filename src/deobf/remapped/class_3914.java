package remapped;

public class class_3914 implements Runnable {
   private static String[] field_19015;

   public class_3914(class_4560 var1, int var2, int var3, int var4, float[] var5, float[] var6) {
      this.field_19014 = var1;
      this.field_19016 = var2;
      this.field_19011 = var3;
      this.field_19012 = var4;
      this.field_19017 = var5;
      this.field_19013 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field_19016; var3 < this.field_19011; var3++) {
         int var4 = 2 * var3;
         int var5 = this.field_19012 + var3;
         this.field_19017[var5] = class_4560.method_21141(this.field_19014)[var4] * this.field_19013[var4]
            - class_4560.method_21141(this.field_19014)[var4 + 1] * this.field_19013[var4 + 1];
      }
   }
}
