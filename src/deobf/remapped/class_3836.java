package remapped;

public class class_3836 implements Runnable {
   private static String[] field_18730;

   public class_3836(class_5519 var1, long var2, long var4, class_4330 var6, boolean var7) {
      this.field_18729 = var1;
      this.field_18731 = var2;
      this.field_18732 = var4;
      this.field_18733 = var6;
      this.field_18728 = var7;
   }

   @Override
   public void run() {
      class_4330 var3 = new class_4330(class_5519.method_24996(this.field_18729), false);

      for (long var4 = this.field_18731; var4 < this.field_18732; var4++) {
         for (long var6 = 0L; var6 < class_5519.method_24996(this.field_18729); var6++) {
            var3.method_36123(var6, this.field_18733.method_36133(var6 * class_5519.method_25007(this.field_18729) + var4));
         }

         class_5519.method_24990(this.field_18729).method_19195(var3, this.field_18728);

         for (long var8 = 0L; var8 < class_5519.method_24996(this.field_18729); var8++) {
            this.field_18733.method_36123(var8 * class_5519.method_25007(this.field_18729) + var4, var3.method_36133(var8));
         }
      }
   }
}
