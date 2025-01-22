package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ToolItem;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Map;
import java.util.Set;

public class Class3269 extends ToolItem {
   private static String[] field18765;
   private static final Set<Block> field18766 = ImmutableSet.of(
      Blocks.field36891,
      Blocks.WARPED_WART_BLOCK,
      Blocks.HAY_BLOCK,
      Blocks.field36963,
      Blocks.TARGET,
      Blocks.SHROOMLIGHT,
      new Block[]{
         Blocks.SPONGE,
         Blocks.WET_SPONGE,
         Blocks.JUNGLE_LEAVES,
         Blocks.OAK_LEAVES,
         Blocks.SPRUCE_LEAVES,
         Blocks.DARK_OAK_LEAVES,
         Blocks.ACACIA_LEAVES,
         Blocks.BIRCH_LEAVES
      }
   );
   public static final Map<Block, BlockState> field18767 = Maps.newHashMap(
      ImmutableMap.of(
         Blocks.GRASS_BLOCK,
         Blocks.FARMLAND.getDefaultState(),
         Blocks.field36885,
         Blocks.FARMLAND.getDefaultState(),
         Blocks.DIRT,
         Blocks.FARMLAND.getDefaultState(),
         Blocks.COARSE_DIRT,
         Blocks.DIRT.getDefaultState()
      )
   );

   public Class3269(IItemTier var1, int var2, float var3, Properties var4) {
      super((float)var2, var3, var1, field18766, var4);
   }

   @Override
   public ActionResultType onItemUse(ItemUseContext var1) {
      World var4 = var1.getWorld();
      BlockPos var5 = var1.getPos();
      if (var1.getFace() != Direction.DOWN && var4.getBlockState(var5.up()).isAir()) {
         BlockState var6 = field18767.get(var4.getBlockState(var5).getBlock());
         if (var6 != null) {
            PlayerEntity var7 = var1.method18358();
            var4.playSound(var7, var5, SoundEvents.field26651, SoundCategory.field14732, 1.0F, 1.0F);
            if (!var4.isRemote) {
               var4.setBlockState(var5, var6, 11);
               if (var7 != null) {
                  var1.method18357().damageItem(1, var7, var1x -> var1x.sendBreakAnimation(var1.method18359()));
               }
            }

            return ActionResultType.method9002(var4.isRemote);
         }
      }

      return ActionResultType.field14820;
   }
}
