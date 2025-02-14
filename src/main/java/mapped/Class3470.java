package mapped;

import net.minecraft.block.AbstractPressurePlateBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class Class3470 extends AbstractPressurePlateBlock {
   private static String[] field19319;
   public static final IntegerProperty field19320 = BlockStateProperties.POWER;
   private final int field19321;

   public Class3470(int var1, Properties var2) {
      super(var2);
      this.setDefaultState(this.stateContainer.getBaseState().with(field19320, Integer.valueOf(0)));
      this.field19321 = var1;
   }

   @Override
   public int method12157(World var1, BlockPos var2) {
      int var5 = Math.min(var1.<Entity>getEntitiesWithinAABB(Entity.class, field19315.offset(var2)).size(), this.field19321);
      if (var5 <= 0) {
         return 0;
      } else {
         float var6 = (float)Math.min(this.field19321, var5) / (float)this.field19321;
         return MathHelper.ceil(var6 * 15.0F);
      }
   }

   @Override
   public void method12154(IWorld var1, BlockPos var2) {
      var1.playSound((PlayerEntity)null, var2, SoundEvents.field26761, SoundCategory.field14732, 0.3F, 0.90000004F);
   }

   @Override
   public void method12155(IWorld var1, BlockPos var2) {
      var1.playSound((PlayerEntity)null, var2, SoundEvents.field26760, SoundCategory.field14732, 0.3F, 0.75F);
   }

   @Override
   public int method12158(BlockState var1) {
      return var1.<Integer>get(field19320);
   }

   @Override
   public BlockState method12159(BlockState var1, int var2) {
      return var1.with(field19320, Integer.valueOf(var2));
   }

   @Override
   public int method12152() {
      return 10;
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field19320);
   }
}
