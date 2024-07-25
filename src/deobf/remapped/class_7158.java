package remapped;

import java.util.EnumSet;

public class class_7158 extends class_3599 {
   private static String[] field_36863;

   public class_7158(class_5542 var1) {
      this.field_36862 = var1;
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9564, class_1891.field_9560));
   }

   @Override
   public boolean method_16795() {
      if (this.field_36862.method_26507()) {
         return false;
      } else {
         class_5834 var3 = this.field_36862.method_17809();
         return var3 != null
            && var3.isAlive()
            && class_5542.method_25200().test(var3)
            && this.field_36862.method_37275(var3) > 36.0
            && !this.field_36862.method_37382()
            && !this.field_36862.method_25182()
            && !this.field_36862.field_29654;
      }
   }

   @Override
   public void method_16796() {
      this.field_36862.method_25196(false);
      class_5542.method_25203(this.field_36862, false);
   }

   @Override
   public void method_16793() {
      class_5834 var3 = this.field_36862.method_17809();
      if (var3 != null && class_5542.method_25207(this.field_36862, var3)) {
         this.field_36862.method_25181(true);
         this.field_36862.method_25168(true);
         this.field_36862.method_26927().method_5620();
         this.field_36862.method_26865().method_17240(var3, (float)this.field_36862.method_26903(), (float)this.field_36862.method_26862());
      } else {
         this.field_36862.method_25181(false);
         this.field_36862.method_25168(false);
      }
   }

   @Override
   public void method_16794() {
      class_5834 var3 = this.field_36862.method_17809();
      this.field_36862.method_26865().method_17240(var3, (float)this.field_36862.method_26903(), (float)this.field_36862.method_26862());
      if (!(this.field_36862.method_37275(var3) <= 36.0)) {
         this.field_36862.method_26927().method_5616(var3, 1.5);
      } else {
         this.field_36862.method_25181(true);
         this.field_36862.method_25168(true);
         this.field_36862.method_26927().method_5620();
      }
   }
}
