package remapped;

import java.io.IOException;

public final class class_650 implements class_9474 {
   private static String[] field_3629;
   private final class_1469 field_3626;
   private class_4131 field_3630;
   private class_4131 field_3625;
   public boolean field_3628;

   public class_650(class_8555 var1, class_1469 var2) {
      this.field_3627 = var1;
      this.field_3626 = var2;
      this.field_3630 = var2.method_6784(1);
      this.field_3625 = new class_2807(this, this.field_3630, var1, var2);
   }

   @Override
   public void method_43760() {
      synchronized (this.field_3627) {
         if (this.field_3628) {
            return;
         }

         this.field_3628 = true;
         this.field_3627.field_43767++;
      }

      class_8515.method_39200(this.field_3630);

      try {
         this.field_3626.method_6783();
      } catch (IOException var5) {
      }
   }

   @Override
   public class_4131 method_43761() {
      return this.field_3625;
   }
}
