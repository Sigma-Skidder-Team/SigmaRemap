package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;

public abstract class Class6334 extends Class6333 {
   public final Class1017 field27846;
   private boolean field27847;

   public Class6334(Class1017 var1, Class9455 var2, Class2266 var3) {
      super(var2, var3);
      this.field27846 = var1;
      this.field27858 = (double)((float)var1.getPosX());
      this.field27859 = (double)((float)var1.getPosY());
      this.field27860 = (double)((float)var1.getPosZ());
      this.field27861 = true;
      this.field27862 = 0;
      this.field27856 = 0.0F;
   }

   @Override
   public void method19269() {
      boolean var3 = this.method19276();
      if (var3 && !this.method19270()) {
         Minecraft.getInstance().getSoundHandler().method999(this.method19275());
         this.field27847 = true;
      }

      if (!this.field27846.removed && !this.field27847) {
         this.field27858 = (double)((float)this.field27846.getPosX());
         this.field27859 = (double)((float)this.field27846.getPosY());
         this.field27860 = (double)((float)this.field27846.getPosZ());
         float var4 = MathHelper.method37766(Entity.method3234(this.field27846.method3433()));
         if (!((double)var4 >= 0.01)) {
            this.field27857 = 0.0F;
            this.field27856 = 0.0F;
         } else {
            this.field27857 = MathHelper.lerp(MathHelper.method37777(var4, this.method19272(), this.method19273()), this.method19272(), this.method19273());
            this.field27856 = MathHelper.lerp(MathHelper.method37777(var4, 0.0F, 0.5F), 0.0F, 1.2F);
         }
      } else {
         this.method19271();
      }
   }

   private float method19272() {
      return !this.field27846.method3005() ? 0.7F : 1.1F;
   }

   private float method19273() {
      return !this.field27846.method3005() ? 1.1F : 1.5F;
   }

   @Override
   public boolean method19274() {
      return true;
   }

   @Override
   public boolean method19268() {
      return !this.field27846.method3245();
   }

   public abstract Class6333 method19275();

   public abstract boolean method19276();
}
