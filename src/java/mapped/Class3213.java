package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class Class3213 extends Block {
   private static String[] field18622;

   public Class3213(Properties var1) {
      super(var1);
   }

   @Override
   public void onBlockAdded(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      var2.method6860().scheduleTick(var3, this, this.method11597());
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      var4.method6860().scheduleTick(var5, this, this.method11597());
      return super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void tick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (method11598(var2.getBlockState(var3.down())) && var3.getY() >= 0) {
         Class907 var7 = new Class907(var2, (double)var3.getX() + 0.5, (double)var3.getY(), (double)var3.getZ() + 0.5, var2.getBlockState(var3));
         this.method11596(var7);
         var2.addEntity(var7);
      }
   }

   public void method11596(Class907 var1) {
   }

   public int method11597() {
      return 2;
   }

   public static boolean method11598(BlockState var0) {
      Material var3 = var0.getMaterial();
      return var0.isAir() || var0.isIn(BlockTags.field32798) || var3.isLiquid() || var3.isReplaceable();
   }

   public void method11599(World var1, BlockPos var2, BlockState var3, BlockState var4, Class907 var5) {
   }

   public void method11600(World var1, BlockPos var2, Class907 var3) {
   }

   @Override
   public void animateTick(BlockState var1, World var2, BlockPos var3, Random var4) {
      if (var4.nextInt(16) == 0) {
         BlockPos var7 = var3.down();
         if (method11598(var2.getBlockState(var7))) {
            double var8 = (double)var3.getX() + var4.nextDouble();
            double var10 = (double)var3.getY() - 0.05;
            double var12 = (double)var3.getZ() + var4.nextDouble();
            var2.addParticle(new BlockParticleData(ParticleTypes.field34071, var1), var8, var10, var12, 0.0, 0.0, 0.0);
         }
      }
   }

   public int method11601(BlockState var1, IBlockReader var2, BlockPos var3) {
      return -16777216;
   }
}
