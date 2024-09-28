package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class Class3465 extends Block {
   private static String[] field19304;
   public static final IntegerProperty field19305 = BlockStateProperties.field39747;
   public static final BooleanProperty field19306 = BlockStateProperties.field39703;

   public Class3465(Properties var1) {
      super(var1);
      this.method11578(this.field18612.method35393().with(field19305, Integer.valueOf(7)).with(field19306, Boolean.valueOf(false)));
   }

   @Override
   public VoxelShape method11995(BlockState var1, IBlockReader var2, BlockPos var3) {
      return VoxelShapes.method27425();
   }

   @Override
   public boolean method11499(BlockState var1) {
      return var1.<Integer>get(field19305) == 7 && !var1.<Boolean>get(field19306);
   }

   @Override
   public void method11484(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (!var1.<Boolean>get(field19306) && var1.<Integer>get(field19305) == 7) {
         method11554(var1, var2, var3);
         var2.removeBlock(var3, false);
      }
   }

   @Override
   public void method11522(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      var2.setBlockState(var3, method12149(var1, var2, var3), 3);
   }

   @Override
   public int method11996(BlockState var1, IBlockReader var2, BlockPos var3) {
      return 1;
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      int var9 = method12150(var3) + 1;
      if (var9 != 1 || var1.<Integer>get(field19305) != var9) {
         var4.method6860().method20726(var5, this, 1);
      }

      return var1;
   }

   private static BlockState method12149(BlockState var0, Class1660 var1, BlockPos var2) {
      int var5 = 7;
      BlockPos.Mutable var6 = new BlockPos.Mutable();

      for (Direction var10 : Direction.values()) {
         var6.method8377(var2, var10);
         var5 = Math.min(var5, method12150(var1.getBlockState(var6)) + 1);
         if (var5 == 1) {
            break;
         }
      }

      return var0.with(field19305, Integer.valueOf(var5));
   }

   private static int method12150(BlockState var0) {
      if (!BlockTags.field32751.method24917(var0.getBlock())) {
         return !(var0.getBlock() instanceof Class3465) ? 7 : var0.<Integer>get(field19305);
      } else {
         return 0;
      }
   }

   @Override
   public void method11512(BlockState var1, World var2, BlockPos var3, Random var4) {
      if (var2.isRainingAt(var3.up()) && var4.nextInt(15) == 1) {
         BlockPos var7 = var3.down();
         BlockState var8 = var2.getBlockState(var7);
         if (!var8.method23410() || !var8.method23454(var2, var7, Direction.UP)) {
            double var9 = (double)var3.getX() + var4.nextDouble();
            double var11 = (double)var3.getY() - 0.05;
            double var13 = (double)var3.getZ() + var4.nextDouble();
            var2.addParticle(ParticleTypes.field34060, var9, var11, var13, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field19305, field19306);
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      return method12149(this.method11579().with(field19306, Boolean.valueOf(true)), var1.method18360(), var1.method18345());
   }
}
