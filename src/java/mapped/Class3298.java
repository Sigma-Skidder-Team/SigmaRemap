package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.Item;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.world.World;

import java.util.Map;
import javax.annotation.Nullable;

public class Class3298 extends BlockItem {
   private static String[] field18806;
   public final Block field18807;

   public Class3298(Block var1, Block var2, Properties var3) {
      super(var1, var3);
      this.field18807 = var2;
   }

   @Nullable
   @Override
   public BlockState method11838(BlockItemUseContext var1) {
      BlockState var4 = this.field18807.getStateForPlacement(var1);
      BlockState var5 = null;
      World var6 = var1.getWorld();
      BlockPos var7 = var1.getPos();

      for (Direction var11 : var1.method18349()) {
         if (var11 != Direction.UP) {
            BlockState var12 = var11 != Direction.DOWN ? var4 : this.method11845().getStateForPlacement(var1);
            if (var12 != null && var12.isValidPosition(var6, var7)) {
               var5 = var12;
               break;
            }
         }
      }

      return var5 != null && var6.placedBlockCollides(var5, var7, ISelectionContext.method14947()) ? var5 : null;
   }

   @Override
   public void method11846(Map<Block, Item> var1, Item var2) {
      super.method11846(var1, var2);
      var1.put(this.field18807, var2);
   }
}
