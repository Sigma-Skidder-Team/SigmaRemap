package remapped;

import java.util.EnumSet;

public class class_5184 extends class_956 {
   private static String[] field_26676;
   private final class_8990 field_26678;
   private LivingEntity field_26675;
   private int field_26677;

   public class_5184(class_8990 var1) {
      super(var1, false);
      this.field_26678 = var1;
      this.method_16800(EnumSet.<Flag>of(Flag.TARGET));
   }

   @Override
   public boolean method_16795() {
      if (this.field_26678.method_41215() && !this.field_26678.method_41216()) {
         LivingEntity var3 = this.field_26678.method_41207();
         if (var3 == null) {
            return false;
         } else {
            this.field_26675 = var3.method_26531();
            int var4 = var3.method_26577();
            return var4 != this.field_26677
               && this.method_4210(this.field_26675, class_4931.field_25526)
               && this.field_26678.method_41219(this.field_26675, var3);
         }
      } else {
         return false;
      }
   }

   @Override
   public void method_16796() {
      this.field_4915.method_26860(this.field_26675);
      LivingEntity var3 = this.field_26678.method_41207();
      if (var3 != null) {
         this.field_26677 = var3.method_26577();
      }

      super.method_16796();
   }
}
