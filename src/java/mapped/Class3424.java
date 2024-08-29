package mapped;

import java.util.Random;

public class Class3424 extends Block implements Class3196 {
   private static String[] field19160;
   public static final VoxelShape field19161 = Block.method11539(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   public Class3424(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public Class2260 method11994() {
      return Class2260.field14703;
   }

   @Override
   public VoxelShape method11483(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      Vector3d var7 = var1.method23421(var2, var3);
      return field19161.withOffset(var7.field18048, var7.field18049, var7.field18050);
   }

   @Override
   public void method11484(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (var4.nextInt(3) == 0 && var2.method7007(var3.method8311()) && var2.method7021(var3.method8311(), 0) >= 9) {
         this.method12079(var2, var3);
      }
   }

   @Override
   public boolean method11492(BlockState var1, Class1662 var2, BlockPos var3) {
      return var2.getBlockState(var3.method8313()).method23446(Class7645.field32787);
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var1.method23443(var4, var5)) {
         if (var2 == Direction.field673 && var3.method23448(Blocks.field37009)) {
            var4.method6725(var5, Blocks.field37009.method11579(), 2);
         }

         return super.method11491(var1, var2, var3, var4, var5, var6);
      } else {
         return Blocks.AIR.method11579();
      }
   }

   @Override
   public ItemStack getItem(Class1665 var1, BlockPos var2, BlockState var3) {
      return new ItemStack(Items.field37357);
   }

   @Override
   public boolean method11486(Class1665 var1, BlockPos var2, BlockState var3, boolean var4) {
      return var1.getBlockState(var2.method8311()).isAir();
   }

   @Override
   public boolean method11487(World var1, Random var2, BlockPos var3, BlockState var4) {
      return true;
   }

   @Override
   public void method11488(ServerWorld var1, Random var2, BlockPos var3, BlockState var4) {
      this.method12079(var1, var3);
   }

   @Override
   public float method11997(BlockState var1, PlayerEntity var2, Class1665 var3, BlockPos var4) {
      return !(var2.method3090().getItem() instanceof ItemSword) ? super.method11997(var1, var2, var3, var4) : 1.0F;
   }

   public void method12079(World var1, BlockPos var2) {
      var1.method6725(var2.method8311(), Blocks.field37009.method11579().method23465(Class3418.field19126, Class181.field643), 3);
   }
}
