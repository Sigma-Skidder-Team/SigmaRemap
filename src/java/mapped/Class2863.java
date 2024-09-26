package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.vector.Vector3d;

public class Class2863<T extends LivingEntity> extends Class2855<T> {
   private static String[] field17746;
   private final Class7219 field17747;
   private final Class7219 field17748 = new Class7219(this, 22, 0);

   public Class2863() {
      this.field17748.method22675(-10.0F, 0.0F, 0.0F, 10.0F, 20.0F, 2.0F, 1.0F);
      this.field17747 = new Class7219(this, 22, 0);
      this.field17747.field31038 = true;
      this.field17747.method22675(0.0F, 0.0F, 0.0F, 10.0F, 20.0F, 2.0F, 1.0F);
   }

   @Override
   public Iterable<Class7219> method11001() {
      return ImmutableList.of();
   }

   @Override
   public Iterable<Class7219> method11002() {
      return ImmutableList.of(this.field17748, this.field17747);
   }

   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var9 = (float) (Math.PI / 12);
      float var10 = (float) (-Math.PI / 12);
      float var11 = 0.0F;
      float var12 = 0.0F;
      if (!var1.isElytraFlying()) {
         if (var1.method3336()) {
            var9 = (float) (Math.PI * 2.0 / 9.0);
            var10 = (float) (-Math.PI / 4);
            var11 = 3.0F;
            var12 = 0.08726646F;
         }
      } else {
         float var13 = 1.0F;
         Vector3d var14 = var1.getMotion();
         if (var14.y < 0.0) {
            Vector3d var15 = var14.method11333();
            var13 = 1.0F - (float)Math.pow(-var15.y, 1.5);
         }

         var9 = var13 * (float) (Math.PI / 9) + (1.0F - var13) * var9;
         var10 = var13 * (float) (-Math.PI / 2) + (1.0F - var13) * var10;
      }

      this.field17748.field31032 = 5.0F;
      this.field17748.field31033 = var11;
      if (!(var1 instanceof AbstractClientPlayerEntity)) {
         this.field17748.field31035 = var9;
         this.field17748.field31037 = var10;
         this.field17748.field31036 = var12;
      } else {
         AbstractClientPlayerEntity var16 = (AbstractClientPlayerEntity)var1;
         var16.field6097 = (float)((double)var16.field6097 + (double)(var9 - var16.field6097) * 0.1);
         var16.field6098 = (float)((double)var16.field6098 + (double)(var12 - var16.field6098) * 0.1);
         var16.field6099 = (float)((double)var16.field6099 + (double)(var10 - var16.field6099) * 0.1);
         this.field17748.field31035 = var16.field6097;
         this.field17748.field31036 = var16.field6098;
         this.field17748.field31037 = var16.field6099;
      }

      this.field17747.field31032 = -this.field17748.field31032;
      this.field17747.field31036 = -this.field17748.field31036;
      this.field17747.field31033 = this.field17748.field31033;
      this.field17747.field31035 = this.field17748.field31035;
      this.field17747.field31037 = -this.field17748.field31037;
   }
}
