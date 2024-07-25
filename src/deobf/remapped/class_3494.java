package remapped;

import java.util.EnumSet;

public class class_3494 extends class_958 {
   private static String[] field_17147;
   private int field_17148;

   public class_3494(class_8829 var1) {
      super(var1, null);
      this.field_17146 = var1;
      this.field_17148 = this.field_17146.field_41768.field_33033.nextInt(10);
      this.method_16800(EnumSet.<Flag>of(Flag.MOVE));
   }

   @Override
   public boolean method_4213() {
      return class_8829.method_40554(this.field_17146) != null
         && !this.field_17146.method_26848()
         && this.method_16066()
         && class_8829.method_40621(this.field_17146, class_8829.method_40554(this.field_17146))
         && !class_8829.method_40573(this.field_17146, class_8829.method_40554(this.field_17146), 2);
   }

   @Override
   public boolean method_4214() {
      return this.method_4213();
   }

   @Override
   public void method_16796() {
      this.field_17148 = 0;
      super.method_16796();
   }

   @Override
   public void method_16793() {
      this.field_17148 = 0;
      class_8829.method_40618(this.field_17146).method_5620();
      class_8829.method_40579(this.field_17146).method_5622();
   }

   @Override
   public void method_16794() {
      if (class_8829.method_40554(this.field_17146) != null) {
         this.field_17148++;
         if (this.field_17148 <= 600) {
            if (!class_8829.method_40596(this.field_17146).method_5608()) {
               if (!class_8829.method_40609(this.field_17146, class_8829.method_40554(this.field_17146))) {
                  class_8829.method_40578(this.field_17146, class_8829.method_40554(this.field_17146));
               } else {
                  class_8829.method_40600(this.field_17146, null);
               }
            }
         } else {
            class_8829.method_40600(this.field_17146, null);
         }
      }
   }

   private boolean method_16066() {
      return class_8829.method_40616(this.field_17146) > 2400;
   }
}
