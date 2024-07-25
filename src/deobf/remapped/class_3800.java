package remapped;

import java.util.EnumSet;

public class class_3800 extends class_956 {
   private static String[] field_18589;
   private final class_8990 field_18588;
   private LivingEntity field_18587;
   private int field_18586;

   public class_3800(class_8990 var1) {
      super(var1, false);
      this.field_18588 = var1;
      this.method_16800(EnumSet.<Flag>of(Flag.TARGET));
   }

   @Override
   public boolean method_16795() {
      if (this.field_18588.method_41215() && !this.field_18588.method_41216()) {
         LivingEntity var3 = this.field_18588.method_41207();
         if (var3 == null) {
            return false;
         } else {
            this.field_18587 = var3.method_26455();
            int var4 = var3.method_26581();
            return var4 != this.field_18586
               && this.method_4210(this.field_18587, class_4931.field_25526)
               && this.field_18588.method_41219(this.field_18587, var3);
         }
      } else {
         return false;
      }
   }

   @Override
   public void method_16796() {
      this.field_4915.method_26860(this.field_18587);
      LivingEntity var3 = this.field_18588.method_41207();
      if (var3 != null) {
         this.field_18586 = var3.method_26581();
      }

      super.method_16796();
   }
}
