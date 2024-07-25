package remapped;

import java.io.IOException;

public class class_506 implements Runnable {
   private static String[] field_3129;

   public class_506(class_3034 var1) {
      this.field_3130 = var1;
   }

   @Override
   public void run() {
      synchronized (this.field_3130) {
         if (!(!this.field_3130.field_14879 | this.field_3130.field_14875)) {
            try {
               this.field_3130.method_13841();
            } catch (IOException var7) {
               this.field_3130.field_14892 = true;
            }

            try {
               if (this.field_3130.method_13863()) {
                  this.field_3130.method_13849();
                  this.field_3130.field_14878 = 0;
               }
            } catch (IOException var6) {
               this.field_3130.field_14867 = true;
               this.field_3130.field_14881 = class_1259.method_5670(class_1259.method_5656());
            }
         }
      }
   }
}
