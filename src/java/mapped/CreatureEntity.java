package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

public abstract class CreatureEntity extends MobEntity {
   public CreatureEntity(EntityType<? extends CreatureEntity> var1, World var2) {
      super(var1, var2);
   }

   public float getBlockPathWeight(BlockPos var1) {
      return this.getBlockPathWeight(var1, this.world);
   }

   public float getBlockPathWeight(BlockPos var1, IWorldReader var2) {
      return 0.0F;
   }

   @Override
   public boolean method4265(IWorld var1, Class2202 var2) {
      return this.getBlockPathWeight(this.getPosition(), var1) >= 0.0F;
   }

   public boolean method4772() {
      return !this.method4230().method21664();
   }

   @Override
   public void method4293() {
      super.method4293();
      Entity var3 = this.method4297();
      if (var3 != null && var3.world == this.world) {
         this.method4288(var3.getPosition(), 5);
         float var4 = this.getDistance(var3);
         if (this instanceof TameableEntity && ((TameableEntity)this).method4395()) {
            if (var4 > 10.0F) {
               this.method4294(true, true);
            }

            return;
         }

         this.method4774(var4);
         if (!(var4 > 10.0F)) {
            if (!(var4 > 6.0F)) {
               this.field5600.method20009(Class2240.field14657);
               float var5 = 2.0F;
               Vector3d var6 = new Vector3d(
                     var3.getPosX() - this.getPosX(), var3.getPosY() - this.getPosY(), var3.getPosZ() - this.getPosZ()
                  )
                  .method11333()
                  .scale((double)Math.max(var4 - 2.0F, 0.0F));
               this.method4230()
                  .method21654(this.getPosX() + var6.x, this.getPosY() + var6.y, this.getPosZ() + var6.z, this.method4773());
            } else {
               double var7 = (var3.getPosX() - this.getPosX()) / (double)var4;
               double var9 = (var3.getPosY() - this.getPosY()) / (double)var4;
               double var11 = (var3.getPosZ() - this.getPosZ()) / (double)var4;
               this.setMotion(
                  this.getMotion()
                     .add(Math.copySign(var7 * var7 * 0.4, var7), Math.copySign(var9 * var9 * 0.4, var9), Math.copySign(var11 * var11 * 0.4, var11))
               );
            }
         } else {
            this.method4294(true, true);
            this.field5600.method20008(Class2240.field14657);
         }
      }
   }

   public double method4773() {
      return 1.0;
   }

   public void method4774(float var1) {
   }
}
