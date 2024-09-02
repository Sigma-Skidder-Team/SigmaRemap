package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class Class3353 extends Class3350 {
   private static String[] field18879;

   public Class3353(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public TileEntity method11646(Class1665 var1) {
      return new Class986();
   }

   @Override
   public void method11918(World var1, BlockPos var2, PlayerEntity var3) {
      TileEntity var6 = var1.getTileEntity(var2);
      if (var6 instanceof Class986) {
         var3.method2766((Class949)var6);
         var3.method2911(Class8876.field40159);
      }
   }

   @Override
   public void method11512(BlockState var1, World var2, BlockPos var3, Random var4) {
      if (var1.<Boolean>method23463(field18876)) {
         double var7 = (double)var3.getX() + 0.5;
         double var9 = (double)var3.getY();
         double var11 = (double)var3.getZ() + 0.5;
         if (var4.nextDouble() < 0.1) {
            var2.method6745(var7, var9, var11, Sounds.field26604, Class2266.field14732, 1.0F, 1.0F, false);
         }

         Direction var13 = var1.<Direction>method23463(field18875);
         Class113 var14 = var13.method544();
         double var15 = 0.52;
         double var17 = var4.nextDouble() * 0.6 - 0.3;
         double var19 = var14 != Class113.field413 ? var17 : (double)var13.method539() * 0.52;
         double var21 = var4.nextDouble() * 6.0 / 16.0;
         double var23 = var14 != Class113.field415 ? var17 : (double)var13.method541() * 0.52;
         var2.method6746(ParticleTypes.field34092, var7 + var19, var9 + var21, var11 + var23, 0.0, 0.0, 0.0);
         var2.method6746(ParticleTypes.field34074, var7 + var19, var9 + var21, var11 + var23, 0.0, 0.0, 0.0);
      }
   }
}
