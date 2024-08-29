package mapped;

public class Class3448 extends Class3445 implements Class3449 {
   private static String[] field19263;

   public Class3448(AbstractBlock var1) {
      super(var1, Direction.field673, VoxelShapes.method27426(), true);
   }

   @Override
   public Class3452 method12124() {
      return (Class3452) Blocks.field36961;
   }

   @Override
   public FluidState method11498(BlockState var1) {
      return Class9479.field44066.method25078(false);
   }

   @Override
   public boolean method11531(Class1665 var1, BlockPos var2, BlockState var3, Fluid var4) {
      return false;
   }

   @Override
   public boolean method11532(Class1660 var1, BlockPos var2, BlockState var3, FluidState var4) {
      return false;
   }
}
