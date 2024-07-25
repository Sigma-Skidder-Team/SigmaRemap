package remapped;

public class class_6914 implements Runnable {
   private static String[] field_35538;

   public class_6914(class_7963 var1, long var2, long var4, class_1702 var6, boolean var7) {
      this.field_35536 = var1;
      this.field_35537 = var2;
      this.field_35539 = var4;
      this.field_35540 = var6;
      this.field_35535 = var7;
   }

   @Override
   public void run() {
      class_1702 var3 = new class_1702(class_7963.method_36039(this.field_35536), false);

      for (long var4 = this.field_35537; var4 < this.field_35539; var4++) {
         for (long var6 = 0L; var6 < class_7963.method_36039(this.field_35536); var6++) {
            var3.method_36114(var6, this.field_35540.method_36107(var6 * class_7963.method_36037(this.field_35536) + var4));
         }

         class_7963.method_36041(this.field_35536).method_44819(var3, this.field_35535);

         for (long var8 = 0L; var8 < class_7963.method_36039(this.field_35536); var8++) {
            this.field_35540.method_36114(var8 * class_7963.method_36037(this.field_35536) + var4, var3.method_36107(var8));
         }
      }
   }
}
