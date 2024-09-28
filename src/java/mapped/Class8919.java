package mapped;

import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

public class Class8919 {
   private static String[] field40379;

   public static AxisAlignedBB method32596(BlockPos var0, Direction var1) {
      return VoxelShapes.method27426()
         .getBoundingBox()
         .contract((double)(0.5F * (float)var1.getXOffset()), (double)(0.5F * (float)var1.getYOffset()), (double)(0.5F * (float)var1.getZOffset()))
         .method19660((double)var1.getXOffset(), (double)var1.getYOffset(), (double)var1.getZOffset())
         .method19668(var0.method8349(var1));
   }
}
