package remapped;

public class class_2197 implements Runnable {
   private static String[] field_10909;

   public class_2197(class_6842 var1, long var2, long var4, class_1702 var6, boolean var7) {
      this.field_10907 = var1;
      this.field_10906 = var2;
      this.field_10911 = var4;
      this.field_10910 = var6;
      this.field_10908 = var7;
   }

   @Override
   public void run() {
      class_1702 var3 = new class_1702(class_6842.method_31374(this.field_10907), false);

      for (long var4 = this.field_10906; var4 < this.field_10911; var4++) {
         for (long var6 = 0L; var6 < class_6842.method_31374(this.field_10907); var6++) {
            var3.method_36114(var6, this.field_10910.method_36107(var6 * class_6842.method_31357(this.field_10907) + var4));
         }

         class_6842.method_31368(this.field_10907).method_31293(var3, this.field_10908);

         for (long var8 = 0L; var8 < class_6842.method_31374(this.field_10907); var8++) {
            this.field_10910.method_36114(var8 * class_6842.method_31357(this.field_10907) + var4, var3.method_36107(var8));
         }
      }
   }
}
