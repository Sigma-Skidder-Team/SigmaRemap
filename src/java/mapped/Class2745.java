package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.vector.Vector3d;

import java.util.EnumSet;

public class Class2745 extends Class2595 {
   private static String[] field17273;
   private final MobEntity field17274;
   private LivingEntity field17275;
   private final float field17276;

   public Class2745(MobEntity var1, float var2) {
      this.field17274 = var1;
      this.field17276 = var2;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14659, Class2240.field14657));
   }

   @Override
   public boolean method10803() {
      if (!this.field17274.isBeingRidden()) {
         this.field17275 = this.field17274.method4232();
         if (this.field17275 != null) {
            double var3 = this.field17274.getDistanceSq(this.field17275);
            if (var3 < 4.0 || var3 > 16.0) {
               return false;
            } else {
               return this.field17274.isOnGround() ? this.field17274.getRNG().nextInt(5) == 0 : false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method10806() {
      return !this.field17274.isOnGround();
   }

   @Override
   public void method10804() {
      Vector3d var3 = this.field17274.getMotion();
      Vector3d var4 = new Vector3d(
         this.field17275.getPosX() - this.field17274.getPosX(), 0.0, this.field17275.getPosZ() - this.field17274.getPosZ()
      );
      if (var4.lengthSquared() > 1.0E-7) {
         var4 = var4.method11333().scale(0.4).add(var3.scale(0.2));
      }

      this.field17274.setMotion(var4.x, (double)this.field17276, var4.z);
   }
}
