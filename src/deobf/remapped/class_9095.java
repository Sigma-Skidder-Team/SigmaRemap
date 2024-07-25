package remapped;

public class class_9095 implements Runnable {
   private static String[] field_46591;

   public class_9095(class_7963 var1, long var2, long var4, class_1702 var6, boolean var7) {
      this.field_46587 = var1;
      this.field_46590 = var2;
      this.field_46589 = var4;
      this.field_46586 = var6;
      this.field_46588 = var7;
   }

   @Override
   public void run() {
      class_1702 var3 = new class_1702(class_7963.method_36039(this.field_46587), false);

      for (long var4 = this.field_46590; var4 < this.field_46589; var4++) {
         for (long var6 = 0L; var6 < class_7963.method_36039(this.field_46587); var6++) {
            var3.method_36114(var6, this.field_46586.method_36107(var6 * class_7963.method_36037(this.field_46587) + var4));
         }

         class_7963.method_36041(this.field_46587).method_44814(var3, this.field_46588);

         for (long var8 = 0L; var8 < class_7963.method_36039(this.field_46587); var8++) {
            this.field_46586.method_36114(var8 * class_7963.method_36037(this.field_46587) + var4, var3.method_36107(var8));
         }
      }
   }
}
