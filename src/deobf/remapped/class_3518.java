package remapped;

import java.util.EnumSet;

public class class_3518 extends class_3335 {
   private static String[] field_17238;
   private int field_17239;

   public class_3518(class_5542 var1) {
      super(var1, null);
      this.field_17240 = var1;
      this.field_17239 = class_5542.method_25211(this.field_17240).nextInt(140);
      this.method_16800(EnumSet.<Flag>of(Flag.MOVE, Flag.LOOK, Flag.JUMP));
   }

   @Override
   public boolean method_16795() {
      return this.field_17240.field_29676 == 0.0F && this.field_17240.field_29651 == 0.0F && this.field_17240.field_29673 == 0.0F
         ? this.method_16201() || this.field_17240.method_26507()
         : false;
   }

   @Override
   public boolean method_16799() {
      return this.method_16201();
   }

   private boolean method_16201() {
      if (this.field_17239 > 0) {
         this.field_17239--;
         return false;
      } else {
         return this.field_17240.field_41768.method_29602() && this.method_15298() && !this.method_15297();
      }
   }

   @Override
   public void method_16793() {
      this.field_17239 = class_5542.method_25198(this.field_17240).nextInt(140);
      class_5542.method_25206(this.field_17240);
   }

   @Override
   public void method_16796() {
      this.field_17240.method_25196(false);
      this.field_17240.method_25168(false);
      this.field_17240.method_25181(false);
      this.field_17240.method_26528(false);
      class_5542.method_25187(this.field_17240, true);
      this.field_17240.method_26927().method_5620();
      this.field_17240.method_26905().method_12879(this.field_17240.method_37302(), this.field_17240.method_37309(), this.field_17240.method_37156(), 0.0);
   }
}
