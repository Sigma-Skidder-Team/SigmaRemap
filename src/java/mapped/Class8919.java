package mapped;

import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

public class Class8919 {
   private static String[] field40379;

   public static AxisAlignedBB method32596(BlockPos var0, Direction var1) {
      return VoxelShapes.method27426()
         .method19514()
         .method19662((double)(0.5F * (float)var1.method539()), (double)(0.5F * (float)var1.method540()), (double)(0.5F * (float)var1.method541()))
         .method19660((double)var1.method539(), (double)var1.method540(), (double)var1.method541())
         .method19668(var0.method8349(var1));
   }
}
