package remapped;

import java.util.EnumSet;

public class class_216 extends class_3599 {
   private static String[] field_716;
   private final class_9490 field_715;
   private LivingEntity field_717;

   public class_216(class_9490 var1) {
      this.field_715 = var1;
      this.method_16800(EnumSet.<Flag>of(Flag.MOVE));
   }

   @Override
   public boolean method_16795() {
      LivingEntity var3 = this.field_715.getAttackTarget();
      return this.field_715.method_43833() > 0 || var3 != null && this.field_715.method_37275(var3) < 9.0;
   }

   @Override
   public void method_16796() {
      this.field_715.method_26927().method_5620();
      this.field_717 = this.field_715.getAttackTarget();
   }

   @Override
   public void method_16793() {
      this.field_717 = null;
   }

   @Override
   public void method_16794() {
      if (this.field_717 != null) {
         if (!(this.field_715.method_37275(this.field_717) > 49.0)) {
            if (this.field_715.method_26928().method_36736(this.field_717)) {
               this.field_715.method_43836(1);
            } else {
               this.field_715.method_43836(-1);
            }
         } else {
            this.field_715.method_43836(-1);
         }
      } else {
         this.field_715.method_43836(-1);
      }
   }
}
