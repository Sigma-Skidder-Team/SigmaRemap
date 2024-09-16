package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

import java.util.Random;

public class Class2685 extends Class2595 {
   private static String[] field17101;
   private final Class1010 field17102;

   public Class2685(Class1010 var1) {
      this.field17102 = var1;
   }

   @Override
   public boolean method10803() {
      if (this.field17102.method4357() != null) {
         return this.field17102.world.getGameRules().getBoolean(Class5462.field24224) ? this.field17102.getRNG().nextInt(2000) == 0 : false;
      } else {
         return false;
      }
   }

   @Override
   public void method10805() {
      Random var3 = this.field17102.getRNG();
      World var4 = this.field17102.world;
      int var5 = MathHelper.floor(this.field17102.getPosX() - 1.0 + var3.nextDouble() * 2.0);
      int var6 = MathHelper.floor(this.field17102.getPosY() + var3.nextDouble() * 2.0);
      int var7 = MathHelper.floor(this.field17102.getPosZ() - 1.0 + var3.nextDouble() * 2.0);
      BlockPos var8 = new BlockPos(var5, var6, var7);
      BlockState var9 = var4.getBlockState(var8);
      BlockPos var10 = var8.down();
      BlockState var11 = var4.getBlockState(var10);
      BlockState var12 = this.field17102.method4357();
      if (var12 != null) {
         var12 = Block.method11542(var12, this.field17102.world, var8);
         if (this.method10901(var4, var8, var12, var9, var11, var10)) {
            var4.setBlockState(var8, var12, 3);
            this.field17102.method4356((BlockState)null);
         }
      }
   }

   private boolean method10901(World var1, BlockPos var2, BlockState var3, BlockState var4, BlockState var5, BlockPos var6) {
      return var4.isAir()
         && !var5.isAir()
         && !var5.isIn(Blocks.BEDROCK)
         && var5.method23456(var1, var6)
         && var3.method23443(var1, var2)
         && var1.method7181(this.field17102, AxisAlignedBB.method19657(Vector3d.method11329(var2))).isEmpty();
   }
}
