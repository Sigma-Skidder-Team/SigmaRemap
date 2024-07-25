package remapped;

public class class_5242 implements Runnable {
   private static String[] field_26860;

   public class_5242(class_6842 var1, long var2, long var4, class_1702 var6, boolean var7) {
      this.field_26858 = var1;
      this.field_26857 = var2;
      this.field_26861 = var4;
      this.field_26859 = var6;
      this.field_26862 = var7;
   }

   @Override
   public void run() {
      class_1702 var3 = new class_1702(class_6842.method_31374(this.field_26858), false);

      for (long var4 = this.field_26857; var4 < this.field_26861; var4++) {
         for (long var6 = 0L; var6 < class_6842.method_31374(this.field_26858); var6++) {
            var3.method_36114(var6, this.field_26859.method_36107(var6 * class_6842.method_31357(this.field_26858) + var4));
         }

         class_6842.method_31368(this.field_26858).method_31287(var3, this.field_26862);

         for (long var8 = 0L; var8 < class_6842.method_31374(this.field_26858); var8++) {
            this.field_26859.method_36114(var8 * class_6842.method_31357(this.field_26858) + var4, var3.method_36107(var8));
         }
      }
   }
}
