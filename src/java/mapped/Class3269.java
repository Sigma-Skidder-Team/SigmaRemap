package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Map;
import java.util.Set;

public class Class3269 extends Class3264 {
   private static String[] field18765;
   private static final Set<Block> field18766 = ImmutableSet.of(
      Blocks.field36891,
      Blocks.field37076,
      Blocks.field36777,
      Blocks.field36963,
      Blocks.field37116,
      Blocks.field37085,
      new Block[]{
         Blocks.field36452,
         Blocks.field36453,
         Blocks.field36449,
         Blocks.field36446,
         Blocks.field36447,
         Blocks.field36451,
         Blocks.field36450,
         Blocks.field36448
      }
   );
   public static final Map<Block, BlockState> field18767 = Maps.newHashMap(
      ImmutableMap.of(
         Blocks.field36395,
         Blocks.FARMLAND.method11579(),
         Blocks.field36885,
         Blocks.FARMLAND.method11579(),
         Blocks.field36396,
         Blocks.FARMLAND.method11579(),
         Blocks.field36397,
         Blocks.field36396.method11579()
      )
   );

   public Class3269(Class2283 var1, int var2, float var3, Class5643 var4) {
      super((float)var2, var3, var1, field18766, var4);
   }

   @Override
   public ActionResultType method11707(ItemUseContext var1) {
      World var4 = var1.method18360();
      BlockPos var5 = var1.method18345();
      if (var1.method18354() != Direction.DOWN && var4.getBlockState(var5.up()).isAir()) {
         BlockState var6 = field18767.get(var4.getBlockState(var5).getBlock());
         if (var6 != null) {
            PlayerEntity var7 = var1.method18358();
            var4.method6742(var7, var5, SoundEvents.field26651, Class2266.field14732, 1.0F, 1.0F);
            if (!var4.isRemote) {
               var4.setBlockState(var5, var6, 11);
               if (var7 != null) {
                  var1.method18357().method32121(1, var7, var1x -> var1x.sendBreakAnimation(var1.method18359()));
               }
            }

            return ActionResultType.method9002(var4.isRemote);
         }
      }

      return ActionResultType.field14820;
   }
}
