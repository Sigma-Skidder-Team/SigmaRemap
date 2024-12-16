package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import java.util.List;

public class Class3469 extends Class3468 {
   private static String[] field19316;
   public static final BooleanProperty field19317 = BlockStateProperties.POWERED;
   private final Class2275 field19318;

   public Class3469(Class2275 var1, Properties var2) {
      super(var2);
      this.setDefaultState(this.stateContainer.getBaseState().with(field19317, Boolean.valueOf(false)));
      this.field19318 = var1;
   }

   @Override
   public int method12158(BlockState var1) {
      return !var1.<Boolean>get(field19317) ? 0 : 15;
   }

   @Override
   public BlockState method12159(BlockState var1, int var2) {
      return var1.with(field19317, Boolean.valueOf(var2 > 0));
   }

   @Override
   public void method12154(IWorld var1, BlockPos var2) {
      if (this.field19004 != Material.field38956 && this.field19004 != Material.field38957) {
         var1.playSound((PlayerEntity)null, var2, SoundEvents.field27136, Class2266.field14732, 0.3F, 0.6F);
      } else {
         var1.playSound((PlayerEntity)null, var2, SoundEvents.field27269, Class2266.field14732, 0.3F, 0.8F);
      }
   }

   @Override
   public void method12155(IWorld var1, BlockPos var2) {
      if (this.field19004 != Material.field38956 && this.field19004 != Material.field38957) {
         var1.playSound((PlayerEntity)null, var2, SoundEvents.field27135, Class2266.field14732, 0.3F, 0.5F);
      } else {
         var1.playSound((PlayerEntity)null, var2, SoundEvents.field27268, Class2266.field14732, 0.3F, 0.7F);
      }
   }

   @Override
   public int method12157(World var1, BlockPos var2) {
      AxisAlignedBB var5 = field19315.method19668(var2);
      List<Entity> var6;
      switch (Class7415.field31771[this.field19318.ordinal()]) {
         case 1:
            var6 = var1.method7181(null, var5);
            break;
         case 2:
            var6 = var1.getEntitiesWithinAABB(LivingEntity.class, var5);
            break;
         default:
            return 0;
      }

      if (!var6.isEmpty()) {
         for (Entity var8 : var6) {
            if (!var8.method3371()) {
               return 15;
            }
         }
      }

      return 0;
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field19317);
   }
}
