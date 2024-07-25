package remapped;

import java.util.EnumSet;

public class class_4574 extends class_3599 {
   private static String[] field_22273;
   private final class_378 field_22274;
   private float field_22271;
   private int field_22272;

   public class_4574(class_378 var1) {
      this.field_22274 = var1;
      this.method_16800(EnumSet.<Flag>of(Flag.LOOK));
   }

   @Override
   public boolean method_16795() {
      return this.field_22274.getAttackTarget() == null
         && (
            this.field_22274.onGround
               || this.field_22274.method_37285()
               || this.field_22274.method_37370()
               || this.field_22274.isPotionActive(Effects.LevitationEffect)
         )
         && this.field_22274.method_26905() instanceof class_8509;
   }

   @Override
   public void method_16794() {
      if (--this.field_22272 <= 0) {
         this.field_22272 = 40 + this.field_22274.method_26594().nextInt(60);
         this.field_22271 = (float)this.field_22274.method_26594().nextInt(360);
      }

      ((class_8509)this.field_22274.method_26905()).method_39183(this.field_22271, false);
   }
}
