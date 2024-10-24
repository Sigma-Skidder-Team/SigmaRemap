package mapped;

import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.MathHelper;

public class Class6343 extends Class6333 {
   private static String[] field27870;
   private final ClientPlayerEntity field27871;
   private int field27872;

   public Class6343(ClientPlayerEntity var1) {
      super(SoundEvents.field26532, SoundCategory.field14735);
      this.field27871 = var1;
      this.repeat = true;
      this.repeatDelay = 0;
      this.volume = 0.1F;
   }

   @Override
   public void method19269() {
      this.field27872++;
      if (!this.field27871.removed && (this.field27872 <= 20 || this.field27871.isElytraFlying())) {
         this.x = (double)((float)this.field27871.getPosX());
         this.y = (double)((float)this.field27871.getPosY());
         this.z = (double)((float)this.field27871.getPosZ());
         float var3 = (float)this.field27871.getMotion().lengthSquared();
         if (!((double)var3 >= 1.0E-7)) {
            this.volume = 0.0F;
         } else {
            this.volume = MathHelper.clamp(var3 / 4.0F, 0.0F, 1.0F);
         }

         if (this.field27872 >= 20) {
            if (this.field27872 < 40) {
               this.volume = (float)((double)this.volume * ((double)(this.field27872 - 20) / 20.0));
            }
         } else {
            this.volume = 0.0F;
         }

         float var4 = 0.8F;
         if (!(this.volume > 0.8F)) {
            this.pitch = 1.0F;
         } else {
            this.pitch = 1.0F + (this.volume - 0.8F);
         }
      } else {
         this.method19271();
      }
   }
}
