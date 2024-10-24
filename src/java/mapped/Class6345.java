package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.MathHelper;

public class Class6345 extends Class6333 {
   private static String[] field27876;
   private final AbstractMinecartEntity field27877;
   private float field27878 = 0.0F;

   public Class6345(AbstractMinecartEntity var1) {
      super(SoundEvents.field26764, SoundCategory.field14734);
      this.field27877 = var1;
      this.repeat = true;
      this.repeatDelay = 0;
      this.volume = 0.0F;
      this.x = (double)((float)var1.getPosX());
      this.y = (double)((float)var1.getPosY());
      this.z = (double)((float)var1.getPosZ());
   }

   @Override
   public boolean method19268() {
      return !this.field27877.isSilent();
   }

   @Override
   public boolean method19274() {
      return true;
   }

   @Override
   public void method19269() {
      if (!this.field27877.removed) {
         this.x = (double)((float)this.field27877.getPosX());
         this.y = (double)((float)this.field27877.getPosY());
         this.z = (double)((float)this.field27877.getPosZ());
         float var3 = MathHelper.sqrt(Entity.horizontalMag(this.field27877.getMotion()));
         if (!((double)var3 >= 0.01)) {
            this.field27878 = 0.0F;
            this.volume = 0.0F;
         } else {
            this.field27878 = MathHelper.clamp(this.field27878 + 0.0025F, 0.0F, 1.0F);
            this.volume = MathHelper.lerp(MathHelper.clamp(var3, 0.0F, 0.5F), 0.0F, 0.7F);
         }
      } else {
         this.method19271();
      }
   }
}
