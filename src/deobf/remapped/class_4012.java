package remapped;

import java.util.Comparator;
import java.util.List;

public class class_4012 extends class_3599 {
   private static String[] field_19484;
   private final class_4931 field_19481;
   private int field_19483;

   private class_4012(class_9825 var1) {
      this.field_19482 = var1;
      this.field_19481 = new class_4931().method_22607(64.0);
      this.field_19483 = 20;
   }

   @Override
   public boolean method_16795() {
      if (this.field_19483 > 0) {
         this.field_19483--;
         return false;
      } else {
         this.field_19483 = 60;
         List var3 = this.field_19482
            .field_41768
            .method_25871(this.field_19481, this.field_19482, this.field_19482.method_37241().method_18899(16.0, 64.0, 16.0));
         if (!var3.isEmpty()) {
            var3.sort(Comparator.<class_8145, Double>comparing(class_8145::method_37309).reversed());

            for (class_704 var5 : var3) {
               if (this.field_19482.method_26609(var5, class_4931.field_25526)) {
                  this.field_19482.method_26860(var5);
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   public boolean method_16799() {
      class_5834 var3 = this.field_19482.method_17809();
      return var3 == null ? false : this.field_19482.method_26609(var3, class_4931.field_25526);
   }
}
