package remapped;

public class RidingMinecartTickableSound extends class_6165 {
   private static String[] field_45865;
   private final PlayerEntity field_45864;
   private final AbstractMinecartEntity field_45863;

   public RidingMinecartTickableSound(PlayerEntity var1, AbstractMinecartEntity var2) {
      super(class_463.field_2715, class_562.field_3328);
      this.field_45864 = var1;
      this.field_45863 = var2;
      this.field_5763 = class_6656.field_34443;
      this.field_5768 = true;
      this.field_5764 = 0;
      this.field_5766 = 0.0F;
   }

   @Override
   public boolean method_16554() {
      return !this.field_45863.method_37378();
   }

   @Override
   public boolean method_16558() {
      return true;
   }

   @Override
   public void method_29511() {
      if (!this.field_45863.field_41751 && this.field_45864.isPassenger() && this.field_45864.method_37243() == this.field_45863) {
         float var3 = class_9299.method_42842(Entity.method_37266(this.field_45863.method_37098()));
         if (!((double)var3 >= 0.01)) {
            this.field_5766 = 0.0F;
         } else {
            this.field_5766 = 0.0F + class_9299.method_42828(var3, 0.0F, 1.0F) * 0.75F;
         }
      } else {
         this.method_28267();
      }
   }
}
