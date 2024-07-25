package remapped;

import java.util.Random;

public class class_9642 extends class_7230 {
   private static String[] field_49121;

   private class_9642() {
   }

   @Override
   public void method_33092(Random var1, int var2, int var3, int var4, boolean var5) {
      if (!var5) {
         this.field_37105 = class_4783.field_23765.method_29260();
      } else {
         float var8 = var1.nextFloat();
         if (!(var8 < 0.2F)) {
            if (!(var8 < 0.5F)) {
               if (!(var8 < 0.55F)) {
                  this.field_37105 = class_4783.field_23355.method_29260();
               } else {
                  this.field_37105 = class_4783.field_23231.method_29260();
               }
            } else {
               this.field_37105 = class_4783.field_23657.method_29260();
            }
         } else {
            this.field_37105 = class_4783.field_23262.method_29260();
         }
      }
   }
}
