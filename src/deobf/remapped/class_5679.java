package remapped;

public class class_5679 implements Runnable {
   private static String[] field_28788;

   public class_5679(class_8751 var1, long var2, long var4, class_4330 var6, boolean var7) {
      this.field_28786 = var1;
      this.field_28789 = var2;
      this.field_28787 = var4;
      this.field_28785 = var6;
      this.field_28784 = var7;
   }

   @Override
   public void run() {
      class_4330 var3 = new class_4330(class_8751.method_40166(this.field_28786), false);

      for (long var4 = this.field_28789; var4 < this.field_28787; var4++) {
         for (long var6 = 0L; var6 < class_8751.method_40166(this.field_28786); var6++) {
            var3.method_36123(var6, this.field_28785.method_36133(var6 * class_8751.method_40171(this.field_28786) + var4));
         }

         class_8751.method_40180(this.field_28786).method_21138(var3, this.field_28784);

         for (long var8 = 0L; var8 < class_8751.method_40166(this.field_28786); var8++) {
            this.field_28785.method_36123(var8 * class_8751.method_40171(this.field_28786) + var4, var3.method_36133(var8));
         }
      }
   }
}
