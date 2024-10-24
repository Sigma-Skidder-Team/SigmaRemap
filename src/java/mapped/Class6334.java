package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.MathHelper;

public abstract class Class6334 extends Class6333 {
   public final Class1017 field27846;
   private boolean field27847;

   public Class6334(Class1017 var1, SoundEvent var2, SoundCategory var3) {
      super(var2, var3);
      this.field27846 = var1;
      this.x = (double)((float)var1.getPosX());
      this.y = (double)((float)var1.getPosY());
      this.z = (double)((float)var1.getPosZ());
      this.repeat = true;
      this.repeatDelay = 0;
      this.volume = 0.0F;
   }

   @Override
   public void method19269() {
      boolean var3 = this.method19276();
      if (var3 && !this.method19270()) {
         Minecraft.getInstance().getSoundHandler().playOnNextTick(this.method19275());
         this.field27847 = true;
      }

      if (!this.field27846.removed && !this.field27847) {
         this.x = (double)((float)this.field27846.getPosX());
         this.y = (double)((float)this.field27846.getPosY());
         this.z = (double)((float)this.field27846.getPosZ());
         float var4 = MathHelper.sqrt(Entity.horizontalMag(this.field27846.getMotion()));
         if (!((double)var4 >= 0.01)) {
            this.pitch = 0.0F;
            this.volume = 0.0F;
         } else {
            this.pitch = MathHelper.lerp(MathHelper.clamp(var4, this.method19272(), this.method19273()), this.method19272(), this.method19273());
            this.volume = MathHelper.lerp(MathHelper.clamp(var4, 0.0F, 0.5F), 0.0F, 1.2F);
         }
      } else {
         this.method19271();
      }
   }

   private float method19272() {
      return !this.field27846.isChild() ? 0.7F : 1.1F;
   }

   private float method19273() {
      return !this.field27846.isChild() ? 1.1F : 1.5F;
   }

   @Override
   public boolean method19274() {
      return true;
   }

   @Override
   public boolean method19268() {
      return !this.field27846.isSilent();
   }

   public abstract Class6333 method19275();

   public abstract boolean method19276();
}
