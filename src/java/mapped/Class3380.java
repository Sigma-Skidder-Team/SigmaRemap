package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class Class3380 extends Class3231 {
   private static String[] field18981;

   public Class3380(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public void method11567(World var1, BlockPos var2, Entity var3, float var4) {
      if (!var3.method3333()) {
         var3.method2921(var4, 0.0F);
      } else {
         super.method11567(var1, var2, var3, var4);
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
      Vector3d var4 = var1.getVec();
      if (var4.y < 0.0) {
         double var5 = !(var1 instanceof LivingEntity) ? 0.8 : 1.0;
         var1.method3435(var4.x, -var4.y * var5, var4.z);
      }
   }

   @Override
   public void method11561(World var1, BlockPos var2, Entity var3) {
      double var6 = Math.abs(var3.getVec().y);
      if (var6 < 0.1 && !var3.method3332()) {
         double var8 = 0.4 + var6 * 0.2;
         var3.method3434(var3.getVec().method11347(var8, 1.0, var8));
      }

      super.method11561(var1, var2, var3);
   }
}
