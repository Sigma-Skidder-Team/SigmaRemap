package remapped;

public class class_4775 implements Runnable {
   private static String[] field_23140;

   public class_4775(class_7380 var1, long var2, long var4, class_1702 var6, boolean var7) {
      this.field_23141 = var1;
      this.field_23139 = var2;
      this.field_23142 = var4;
      this.field_23137 = var6;
      this.field_23138 = var7;
   }

   @Override
   public void run() {
      class_1702 var3 = new class_1702(class_7380.method_33604(this.field_23141), false);

      for (long var4 = this.field_23139; var4 < this.field_23142; var4++) {
         for (long var6 = 0L; var6 < class_7380.method_33604(this.field_23141); var6++) {
            var3.method_36114(var6, this.field_23137.method_36107(var6 * class_7380.method_33608(this.field_23141) + var4));
         }

         class_7380.method_33616(this.field_23141).method_31281(var3, this.field_23138);

         for (long var8 = 0L; var8 < class_7380.method_33604(this.field_23141); var8++) {
            this.field_23137.method_36114(var8 * class_7380.method_33608(this.field_23141) + var4, var3.method_36107(var8));
         }
      }
   }
}
