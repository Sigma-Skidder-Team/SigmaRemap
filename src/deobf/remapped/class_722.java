package remapped;

public class class_722 implements Runnable {
   private static String[] field_3927;

   public class_722(class_8751 var1, int var2, int var3, int var4, float[][] var5, boolean var6) {
      this.field_3926 = var1;
      this.field_3921 = var2;
      this.field_3923 = var3;
      this.field_3924 = var4;
      this.field_3922 = var5;
      this.field_3925 = var6;
   }

   @Override
   public void run() {
      if (this.field_3921 != -1) {
         for (int var3 = this.field_3923; var3 < class_8751.method_40170(this.field_3926); var3 += this.field_3924) {
            class_8751.method_40165(this.field_3926).method_21132(this.field_3922[var3], this.field_3925);
         }
      } else {
         for (int var4 = this.field_3923; var4 < class_8751.method_40170(this.field_3926); var4 += this.field_3924) {
            class_8751.method_40165(this.field_3926).method_21140(this.field_3922[var4], this.field_3925);
         }
      }
   }
}
