package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

public class Class2639 extends Class2595 {
   private static String[] field16962;
   private final GhastEntity field16963;
   public int field16964;

   public Class2639(GhastEntity var1) {
      this.field16963 = var1;
   }

   @Override
   public boolean method10803() {
      return this.field16963.method4232() != null;
   }

   @Override
   public void method10804() {
      this.field16964 = 0;
   }

   @Override
   public void method10807() {
      this.field16963.method5358(false);
   }

   @Override
   public void method10805() {
      LivingEntity var3 = this.field16963.method4232();
      double var4 = 64.0;
      if (var3.getDistanceSq(this.field16963) < 4096.0 && this.field16963.canEntityBeSeen(var3)) {
         World var6 = this.field16963.world;
         this.field16964++;
         if (this.field16964 == 10 && !this.field16963.isSilent()) {
            var6.method6869((PlayerEntity)null, 1015, this.field16963.getPosition(), 0);
         }

         if (this.field16964 == 20) {
            double var7 = 4.0;
            Vector3d var9 = this.field16963.getLook(1.0F);
            double var10 = var3.getPosX() - (this.field16963.getPosX() + var9.x * 4.0);
            double var12 = var3.getPosYHeight(0.5) - (0.5 + this.field16963.getPosYHeight(0.5));
            double var14 = var3.getPosZ() - (this.field16963.getPosZ() + var9.z * 4.0);
            if (!this.field16963.isSilent()) {
               var6.method6869((PlayerEntity)null, 1016, this.field16963.getPosition(), 0);
            }

            Class899 var16 = new Class899(var6, this.field16963, var10, var12, var14);
            var16.field5139 = this.field16963.method5359();
            var16.setPosition(
               this.field16963.getPosX() + var9.x * 4.0, this.field16963.getPosYHeight(0.5) + 0.5, var16.getPosZ() + var9.z * 4.0
            );
            var6.addEntity(var16);
            this.field16964 = -40;
         }
      } else if (this.field16964 > 0) {
         this.field16964--;
      }

      this.field16963.method5358(this.field16964 > 10);
   }
}
