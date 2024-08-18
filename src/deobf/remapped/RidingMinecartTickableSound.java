package remapped;

public class RidingMinecartTickableSound extends class_6165 {
   private static String[] field_45865;
   private final PlayerEntity field_45864;
   private final AbstractMinecartEntity field_45863;

   public RidingMinecartTickableSound(PlayerEntity var1, AbstractMinecartEntity var2) {
      super(SoundEvents.field_2715, class_562.field_3328);
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
      if (!this.field_45863.removed && this.field_45864.isPassenger() && this.field_45864.getRidingEntity() == this.field_45863) {
         float var3 = MathHelper.sqrt(Entity.method_37266(this.field_45863.method_37098()));
         if (!((double)var3 >= 0.01)) {
            this.field_5766 = 0.0F;
         } else {
            this.field_5766 = 0.0F + MathHelper.clamp(var3, 0.0F, 1.0F) * 0.75F;
         }
      } else {
         this.method_28267();
      }
   }
}
