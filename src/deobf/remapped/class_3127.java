package remapped;

public class class_3127 implements Runnable {
   private static String[] field_15525;

   public class_3127(class_3484 var1, String var2, Object[] var3) {
      this.field_15526 = var1;
      this.field_15524 = var2;
      this.field_15527 = var3;
   }

   @Override
   public void run() {
      if (class_3484.field_17095.containsKey(this.field_15524)) {
         class_3484.method_16004(this.field_15526, this.field_15524, this.field_15527);
      } else {
         int var3 = this.field_15527.length - 1;
         Object[] var4;
         class_9240 var5;
         if (this.field_15527.length > 0 && this.field_15527[var3] instanceof class_9240) {
            var4 = new Object[var3];

            for (int var6 = 0; var6 < var3; var6++) {
               var4[var6] = this.field_15527[var6];
            }

            var5 = (class_9240)this.field_15527[var3];
         } else {
            var4 = this.field_15527;
            var5 = null;
         }

         this.field_15526.method_16001(this.field_15524, var4, var5);
      }
   }
}
