package mapped;

import java.util.Map;
import javax.annotation.Nullable;

public class Class3298 extends Class3292 {
   private static String[] field18806;
   public final Block field18807;

   public Class3298(Block var1, Block var2, Class5643 var3) {
      super(var1, var3);
      this.field18807 = var2;
   }

   @Nullable
   @Override
   public BlockState method11838(Class5909 var1) {
      BlockState var4 = this.field18807.method11495(var1);
      BlockState var5 = null;
      World var6 = var1.method18360();
      BlockPos var7 = var1.method18345();

      for (Direction var11 : var1.method18349()) {
         if (var11 != Direction.field673) {
            BlockState var12 = var11 != Direction.DOWN ? var4 : this.method11845().method11495(var1);
            if (var12 != null && var12.method23443(var6, var7)) {
               var5 = var12;
               break;
            }
         }
      }

      return var5 != null && var6.method7049(var5, var7, ISelectionContext.method14947()) ? var5 : null;
   }

   @Override
   public void method11846(Map<Block, Item> var1, Item var2) {
      super.method11846(var1, var2);
      var1.put(this.field18807, var2);
   }
}
