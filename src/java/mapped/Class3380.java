package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class Class3380 extends Class3231 {
   private static String[] field18981;

   public Class3380(Properties var1) {
      super(var1);
   }

   @Override
   public void onFallenUpon(World var1, BlockPos var2, Entity var3, float var4) {
      if (!var3.method3333()) {
         var3.onLivingFall(var4, 0.0F);
      } else {
         super.onFallenUpon(var1, var2, var3, var4);
      }
   }

   @Override
   public void method11568(IBlockReader var1, Entity var2) {
      if (!var2.method3333()) {
         this.method11979(var2);
      } else {
         super.method11568(var1, var2);
      }
   }

   private void method11979(Entity var1) {
      Vector3d var4 = var1.getMotion();
      if (var4.y < 0.0) {
         double var5 = !(var1 instanceof LivingEntity) ? 0.8 : 1.0;
         var1.setMotion(var4.x, -var4.y * var5, var4.z);
      }
   }

   @Override
   public void onEntityWalk(World var1, BlockPos var2, Entity var3) {
      double var6 = Math.abs(var3.getMotion().y);
      if (var6 < 0.1 && !var3.isSteppingCarefully()) {
         double var8 = 0.4 + var6 * 0.2;
         var3.setMotion(var3.getMotion().mul(var8, 1.0, var8));
      }

      super.onEntityWalk(var1, var2, var3);
   }
}
