package remapped;

import java.io.IOException;

public class class_2807 extends class_6619 {
   private static String[] field_13776;

   public class_2807(class_650 var1, class_4131 var2, class_8555 var3, class_1469 var4) {
      super(var2);
      this.field_13778 = var1;
      this.field_13775 = var3;
      this.field_13777 = var4;
   }

   @Override
   public void close() throws IOException {
      synchronized (this.field_13778.field_3627) {
         if (this.field_13778.field_3628) {
            return;
         }

         this.field_13778.field_3628 = true;
         this.field_13778.field_3627.field_43764++;
      }

      super.close();
      this.field_13777.method_6785();
   }
}
