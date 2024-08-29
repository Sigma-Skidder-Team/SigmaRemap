package mapped;

import net.minecraft.util.math.BlockPos;

public class Class3391 extends Block {
   private static String[] field19015;
   private static final VoxelShape field19016 = Block.method11539(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   public Class3391(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.field9885;
   }

   @Override
   public VoxelShape method11483(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      return field19016;
   }

   @Override
   public float method11636(BlockState var1, Class1665 var2, BlockPos var3) {
      return 1.0F;
   }

   @Override
   public Class2315 method11689(BlockState var1) {
      return Class2315.field15863;
   }
}
