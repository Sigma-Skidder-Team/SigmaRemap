package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

import java.util.Map;

public class Class3493 extends Class3194 {
   private static String[] field18470;
   public static final Class8553 field19361 = Class3198.field18484;
   private final Class3462 field19362;
   private static final Map<Direction, VoxelShape> field19363 = Maps.newEnumMap(
      ImmutableMap.of(
         Direction.SOUTH,
         Block.method11539(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         Direction.WEST,
         Block.method11539(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         Direction.NORTH,
         Block.method11539(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         Direction.EAST,
         Block.method11539(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );

   public Class3493(Class3462 var1, AbstractBlock var2) {
      super(var2);
      this.method11578(this.field18612.method35393().method23465(field19361, Direction.NORTH));
      this.field19362 = var1;
   }

   @Override
   public VoxelShape method11483(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field19363.get(var1.<Direction>method23463(field19361));
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return !var3.isIn(this.field19362) && var2 == var1.method23463(field19361)
         ? this.field19362.method12146().method11579().method23465(Class3486.field19347, Integer.valueOf(7))
         : super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method11490(BlockState var1, IBlockReader var2, BlockPos var3) {
      return var1.isIn(Blocks.FARMLAND);
   }

   public Item method12188() {
      if (this.field19362 != Blocks.PUMPKIN) {
         return this.field19362 != Blocks.MELON ? Items.field37222 : Items.field37960;
      } else {
         return Items.field37959;
      }
   }

   @Override
   public ItemStack getItem(IBlockReader var1, BlockPos var2, BlockState var3) {
      return new ItemStack(this.method12188());
   }

   @Override
   public BlockState method11500(BlockState var1, Class80 var2) {
      return var1.method23465(field19361, var2.method252(var1.<Direction>method23463(field19361)));
   }

   @Override
   public BlockState method11501(BlockState var1, Class2089 var2) {
      return var1.method23395(var2.method8749(var1.<Direction>method23463(field19361)));
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field19361);
   }
}
