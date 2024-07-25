package remapped;

public class class_4324 implements Runnable {
   private static String[] field_21041;

   public class_4324(class_8751 var1, long var2, long var4, class_4330 var6, boolean var7) {
      this.field_21040 = var1;
      this.field_21037 = var2;
      this.field_21036 = var4;
      this.field_21038 = var6;
      this.field_21039 = var7;
   }

   @Override
   public void run() {
      class_4330 var3 = new class_4330(class_8751.method_40166(this.field_21040), false);

      for (long var4 = this.field_21037; var4 < this.field_21036; var4++) {
         for (long var6 = 0L; var6 < class_8751.method_40166(this.field_21040); var6++) {
            var3.method_36123(var6, this.field_21038.method_36133(var6 * class_8751.method_40171(this.field_21040) + var4));
         }

         class_8751.method_40180(this.field_21040).method_21130(var3, this.field_21039);

         for (long var8 = 0L; var8 < class_8751.method_40166(this.field_21040); var8++) {
            this.field_21038.method_36123(var8 * class_8751.method_40171(this.field_21040) + var4, var3.method_36133(var8));
         }
      }
   }
}
