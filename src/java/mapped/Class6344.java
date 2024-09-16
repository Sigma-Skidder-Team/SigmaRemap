package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.MathHelper;

public class Class6344 extends Class6333 {
   private static String[] field27873;
   private final PlayerEntity field27874;
   private final AbstractMinecartEntity field27875;

   public Class6344(PlayerEntity var1, AbstractMinecartEntity var2) {
      super(SoundEvents.field26763, Class2266.field14734);
      this.field27874 = var1;
      this.field27875 = var2;
      this.field27863 = Class2279.field14845;
      this.field27861 = true;
      this.field27862 = 0;
      this.field27856 = 0.0F;
   }

   @Override
   public boolean method19268() {
      return !this.field27875.isSilent();
   }

   @Override
   public boolean method19274() {
      return true;
   }

   @Override
   public void method19269() {
      if (!this.field27875.removed && this.field27874.isPassenger() && this.field27874.getRidingEntity() == this.field27875) {
         float var3 = MathHelper.sqrt(Entity.horizontalMag(this.field27875.getMotion()));
         if (!((double)var3 >= 0.01)) {
            this.field27856 = 0.0F;
         } else {
            this.field27856 = 0.0F + MathHelper.clamp(var3, 0.0F, 1.0F) * 0.75F;
         }
      } else {
         this.method19271();
      }
   }
}
