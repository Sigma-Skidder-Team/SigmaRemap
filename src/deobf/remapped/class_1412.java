package remapped;

import java.io.IOException;

public class class_1412 extends class_5548 {
   private static String[] field_7669;

   public class_1412(class_2695 var1, String var2, Object[] var3, int var4, class_7059 var5, int var6, boolean var7) {
      super(var2, var3);
      this.field_7666 = var1;
      this.field_7667 = var4;
      this.field_7670 = var5;
      this.field_7671 = var6;
      this.field_7668 = var7;
   }

   @Override
   public void method_25227() {
      try {
         boolean var3 = this.field_7666.field_13195.method_27512(this.field_7667, this.field_7670, this.field_7671, this.field_7668);
         if (var3) {
            this.field_7666.field_13203.method_31949(this.field_7667, class_1692.field_8762);
         }

         if (var3 || this.field_7668) {
            synchronized (this.field_7666) {
               this.field_7666.field_13194.remove(this.field_7667);
            }
         }
      } catch (IOException var7) {
      }
   }
}
