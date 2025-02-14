package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

public class Class8189 {
   private static String[] field35206;
   public BlockPos field35207;
   public BlockState field35208;

   public Class8189(BlockPos var1, BlockState var2) {
      this.field35207 = var1;
      this.field35208 = var2;
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof Class8189 ? ((Class8189)var1).field35207.equals(this.field35207) : false;
   }
}
