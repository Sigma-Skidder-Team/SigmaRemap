package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;

public class Class3490 extends Class3194 {
   private static String[] field19356;
   public static final VoxelShape field19357 = Block.method11539(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final Effect field19358;
   private final int field19359;

   public Class3490(Effect var1, int var2, AbstractBlock var3) {
      super(var3);
      this.field19358 = var1;
      if (!var1.isInstant()) {
         this.field19359 = var2 * 20;
      } else {
         this.field19359 = var2;
      }
   }

   @Override
   public VoxelShape method11483(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      Vector3d var7 = var1.method23421(var2, var3);
      return field19357.withOffset(var7.x, var7.y, var7.z);
   }

   @Override
   public Class2260 method11994() {
      return Class2260.field14703;
   }

   public Effect method12186() {
      return this.field19358;
   }

   public int method12187() {
      return this.field19359;
   }
}
