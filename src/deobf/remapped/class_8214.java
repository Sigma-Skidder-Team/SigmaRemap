package remapped;

import java.util.EnumSet;

public class class_8214 extends class_3599 {
   private static String[] field_42023;
   private final class_449 field_42022;
   private final double field_42024;
   private PlayerEntity field_42021;

   public class_8214(class_449 var1, double var2) {
      this.field_42022 = var1;
      this.field_42024 = var2;
      this.method_16800(EnumSet.<Flag>of(Flag.MOVE, Flag.LOOK));
   }

   @Override
   public boolean method_16795() {
      this.field_42021 = this.field_42022.world.method_25859(class_449.method_2166(), this.field_42022);
      return this.field_42021 == null ? false : this.field_42021.method_37113() && this.field_42022.method_17809() != this.field_42021;
   }

   @Override
   public boolean method_16799() {
      return this.field_42021 != null && this.field_42021.method_37113() && this.field_42022.method_37275(this.field_42021) < 256.0;
   }

   @Override
   public void method_16796() {
      this.field_42021.method_26558(new class_2250(Effects.field_19724, 100));
   }

   @Override
   public void method_16793() {
      this.field_42021 = null;
      this.field_42022.method_26927().method_5620();
   }

   @Override
   public void method_16794() {
      this.field_42022.method_26865().method_17240(this.field_42021, (float)(this.field_42022.getHorizontalFaceSpeed() + 20), (float)this.field_42022.method_26862());
      if (!(this.field_42022.method_37275(this.field_42021) < 6.25)) {
         this.field_42022.method_26927().method_5616(this.field_42021, this.field_42024);
      } else {
         this.field_42022.method_26927().method_5620();
      }

      if (this.field_42021.method_37113() && this.field_42021.world.field_33033.nextInt(6) == 0) {
         this.field_42021.method_26558(new class_2250(Effects.field_19724, 100));
      }
   }
}
