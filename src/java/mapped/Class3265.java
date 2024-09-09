package mapped;

import com.google.common.collect.ImmutableMap.Builder;
import com.google.common.collect.Sets;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Map;
import java.util.Set;

public class Class3265 extends Class3264 {
   private static String[] field18755;
   private static final Set<Class8649> field18756 = Sets.newHashSet(
      new Class8649[]{Class8649.field38956, Class8649.field38957, Class8649.field38936, Class8649.field38938, Class8649.field38959, Class8649.field38973}
   );
   private static final Set<Block> field18757 = Sets.newHashSet(
      new Block[]{
         Blocks.LADDER,
         Blocks.field37053,
         Blocks.field36695,
         Blocks.field36696,
         Blocks.field36697,
         Blocks.field36698,
         Blocks.field36700,
         Blocks.field36699,
         Blocks.field37105,
         Blocks.field37106
      }
   );
   public static final Map<Block, Block> field18758 = new Builder()
      .put(Blocks.field36434, Blocks.field36440)
      .put(Blocks.field36422, Blocks.field36433)
      .put(Blocks.field36439, Blocks.field36445)
      .put(Blocks.field36427, Blocks.field36432)
      .put(Blocks.field36438, Blocks.field36444)
      .put(Blocks.field36426, Blocks.field36431)
      .put(Blocks.field36436, Blocks.field36442)
      .put(Blocks.field36424, Blocks.field36429)
      .put(Blocks.field36437, Blocks.field36443)
      .put(Blocks.field36425, Blocks.field36430)
      .put(Blocks.field36435, Blocks.field36441)
      .put(Blocks.field36423, Blocks.field36428)
      .put(Blocks.field37070, Blocks.field37071)
      .put(Blocks.field37072, Blocks.field37073)
      .put(Blocks.field37079, Blocks.field37080)
      .put(Blocks.field37081, Blocks.field37082)
      .build();

   public Class3265(Class2283 var1, float var2, float var3, Class5643 var4) {
      super(var2, var3, var1, field18757, var4);
   }

   @Override
   public float method11708(ItemStack var1, BlockState var2) {
      Class8649 var5 = var2.getMaterial();
      return !field18756.contains(var5) ? super.method11708(var1, var2) : this.field18752;
   }

   @Override
   public ActionResultType method11707(ItemUseContext var1) {
      World var4 = var1.method18360();
      BlockPos var5 = var1.method18345();
      BlockState var6 = var4.getBlockState(var5);
      Block var7 = field18758.get(var6.getBlock());
      if (var7 == null) {
         return ActionResultType.field14820;
      } else {
         PlayerEntity var8 = var1.method18358();
         var4.method6742(var8, var5, SoundEvents.field26364, Class2266.field14732, 1.0F, 1.0F);
         if (!var4.isRemote) {
            var4.setBlockState(var5, var7.method11579().method23465(Class3386.field18994, var6.<Direction>method23463(Class3386.field18994)), 11);
            if (var8 != null) {
               var1.method18357().method32121(1, var8, var1x -> var1x.sendBreakAnimation(var1.method18359()));
            }
         }

         return ActionResultType.method9002(var4.isRemote);
      }
   }
}
