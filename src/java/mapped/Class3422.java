package mapped;

public class Class3422 extends Block {
   private static String[] field19150;
   public static final VoxelShape field19151 = Block.method11539(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private final Class112 field19152;

   public Class3422(Class112 var1, AbstractBlock var2) {
      super(var2);
      this.field19152 = var1;
   }

   public Class112 method12077() {
      return this.field19152;
   }

   @Override
   public VoxelShape method11483(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      return field19151;
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return var1.method23443(var4, var5) ? super.method11491(var1, var2, var3, var4, var5, var6) : Blocks.AIR.method11579();
   }

   @Override
   public boolean method11492(BlockState var1, Class1662 var2, BlockPos var3) {
      return !var2.method7007(var3.down());
   }
}
