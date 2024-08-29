package mapped;

import javax.annotation.Nullable;

public class Class3371 extends Class3241 implements Class3207 {
   private static String[] field18959;
   public static final Class8551 field18960 = Class8820.field39710;
   public static final Class6408 field18961 = Block.method11539(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   public Class3371(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field18960, Boolean.valueOf(true)));
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18960);
   }

   @Override
   public TileEntity method11646(Class1665 var1) {
      return new Class959();
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.field9886;
   }

   @Override
   public Class7379 method11498(BlockState var1) {
      return !var1.<Boolean>method23463(field18960) ? super.method11498(var1) : Class9479.field44066.method25078(false);
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var1.<Boolean>method23463(field18960)) {
         var4.method6861().method20726(var5, Class9479.field44066, Class9479.field44066.method25057(var4));
      }

      return super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public Class6408 method11483(BlockState var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field18961;
   }

   @Override
   public void method11563(World var1, BlockPos var2, BlockState var3, Class880 var4, ItemStack var5) {
      if (var5.method32152()) {
         TileEntity var8 = var1.getTileEntity(var2);
         if (var8 instanceof Class950) {
            ((Class950)var8).method3826(var5.method32149());
         }
      }
   }

   @Nullable
   @Override
   public BlockState method11495(Class5909 var1) {
      Class7379 var4 = var1.method18360().method6739(var1.method18345());
      return this.method11579().method23465(field18960, Boolean.valueOf(var4.method23486(Class8953.field40469) && var4.method23477() == 8));
   }

   @Override
   public boolean method11494(BlockState var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}
