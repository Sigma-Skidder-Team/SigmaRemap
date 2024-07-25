package remapped;

public class class_2704 extends class_6165 {
   private static String[] field_13245;
   private final class_337 field_13244;

   public class_2704(class_337 var1) {
      super(SoundEvents.field_2882, class_562.field_3332);
      this.field_13244 = var1;
      this.field_5763 = class_6656.field_34443;
      this.field_5768 = true;
      this.field_5764 = 0;
   }

   @Override
   public boolean method_16554() {
      return !this.field_13244.method_37378();
   }

   @Override
   public void method_29511() {
      if (!this.field_13244.field_41751 && this.field_13244.getAttackTarget() == null) {
         this.field_5761 = (double)((float)this.field_13244.getPosX());
         this.field_5765 = (double)((float)this.field_13244.method_37309());
         this.field_5762 = (double)((float)this.field_13244.getPosZ());
         float var3 = this.field_13244.method_1546(0.0F);
         this.field_5766 = 0.0F + 1.0F * var3 * var3;
         this.field_5773 = 0.7F + 0.5F * var3;
      } else {
         this.method_28267();
      }
   }
}
