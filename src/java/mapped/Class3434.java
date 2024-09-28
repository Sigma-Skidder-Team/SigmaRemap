package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Mirror;
import net.minecraft.util.Direction;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class Class3434 extends Class3433 {
   private static String[] field19199;
   public static final BooleanProperty field19200 = BlockStateProperties.POWERED;

   public Class3434(Properties var1) {
      super(var1);
      this.method11578(this.field18612.method35393().with(field19198, Direction.SOUTH).with(field19200, Boolean.valueOf(false)));
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field19198, field19200);
   }

   @Override
   public BlockState rotate(BlockState var1, Rotation var2) {
      return var1.with(field19198, var2.rotate(var1.<Direction>get(field19198)));
   }

   @Override
   public BlockState mirror(BlockState var1, Mirror var2) {
      return var1.rotate(var2.toRotation(var1.<Direction>get(field19198)));
   }

   @Override
   public void method11522(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (!var1.<Boolean>get(field19200)) {
         var2.setBlockState(var3, var1.with(field19200, Boolean.valueOf(true)), 2);
         var2.method6860().method20726(var3, this, 2);
      } else {
         var2.setBlockState(var3, var1.with(field19200, Boolean.valueOf(false)), 2);
      }

      this.method12101(var2, var3, var1);
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var1.<Direction>get(field19198) == var2 && !var1.<Boolean>get(field19200)) {
         this.method12100(var4, var5);
      }

      return super.method11491(var1, var2, var3, var4, var5, var6);
   }

   private void method12100(Class1660 var1, BlockPos var2) {
      if (!var1.isRemote() && !var1.method6860().method20718(var2, this)) {
         var1.method6860().method20726(var2, this, 2);
      }
   }

   public void method12101(World var1, BlockPos var2, BlockState var3) {
      Direction var6 = var3.<Direction>get(field19198);
      BlockPos var7 = var2.method8349(var6.getOpposite());
      var1.neighborChanged(var7, this, var2);
      var1.notifyNeighborsOfStateExcept(var7, this, var6);
   }

   @Override
   public boolean method11516(BlockState var1) {
      return true;
   }

   @Override
   public int method11515(BlockState var1, IBlockReader var2, BlockPos var3, Direction var4) {
      return var1.method23402(var2, var3, var4);
   }

   @Override
   public int method11514(BlockState var1, IBlockReader var2, BlockPos var3, Direction var4) {
      return var1.<Boolean>get(field19200) && var1.get(field19198) == var4 ? 15 : 0;
   }

   @Override
   public void method11589(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var1.isIn(var4.getBlock()) && !var2.isRemote() && var1.<Boolean>get(field19200) && !var2.method6860().method20718(var3, this)) {
         BlockState var8 = var1.with(field19200, Boolean.valueOf(false));
         var2.setBlockState(var3, var8, 18);
         this.method12101(var2, var3, var8);
      }
   }

   @Override
   public void method11513(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var1.isIn(var4.getBlock()) && !var2.isRemote && var1.<Boolean>get(field19200) && var2.method6860().method20718(var3, this)) {
         this.method12101(var2, var3, var1.with(field19200, Boolean.valueOf(false)));
      }
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      return this.method11579().with(field19198, var1.method18348().getOpposite().getOpposite());
   }
}
