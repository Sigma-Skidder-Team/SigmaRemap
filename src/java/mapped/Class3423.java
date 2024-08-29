package mapped;

import javax.annotation.Nullable;

public class Class3423 extends Block implements Class3207 {
   private static String[] field19153;
   public static final Class8553 field19154 = Class3198.field18484;
   public static final Class8551 field19155 = Class8820.field39710;
   public static final VoxelShape field19156 = Block.method11539(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   public static final VoxelShape field19157 = Block.method11539(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   public static final VoxelShape field19158 = Block.method11539(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   public static final VoxelShape field19159 = Block.method11539(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   public Class3423(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field19154, Direction.NORTH).method23465(field19155, Boolean.valueOf(false)));
   }

   @Override
   public VoxelShape method11483(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      switch (Class9442.field43870[var1.<Direction>method23463(field19154).ordinal()]) {
         case 1:
            return field19159;
         case 2:
            return field19158;
         case 3:
            return field19157;
         case 4:
         default:
            return field19156;
      }
   }

   private boolean method12078(Class1665 var1, BlockPos var2, Direction var3) {
      BlockState var6 = var1.getBlockState(var2);
      return var6.method23454(var1, var2, var3);
   }

   @Override
   public boolean method11492(BlockState var1, Class1662 var2, BlockPos var3) {
      Direction var6 = var1.<Direction>method23463(field19154);
      return this.method12078(var2, var3.method8349(var6.method536()), var6);
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var2.method536() == var1.<Direction>method23463(field19154) && !var1.method23443(var4, var5)) {
         return Blocks.AIR.method11579();
      } else {
         if (var1.<Boolean>method23463(field19155)) {
            var4.method6861().method20726(var5, Class9479.field44066, Class9479.field44066.method25057(var4));
         }

         return super.method11491(var1, var2, var3, var4, var5, var6);
      }
   }

   @Nullable
   @Override
   public BlockState method11495(Class5909 var1) {
      if (!var1.method18347()) {
         BlockState var4 = var1.method18360().getBlockState(var1.method18345().method8349(var1.method18354().method536()));
         if (var4.method23448(this) && var4.<Direction>method23463(field19154) == var1.method18354()) {
            return null;
         }
      }

      BlockState var12 = this.method11579();
      World var5 = var1.method18360();
      BlockPos var6 = var1.method18345();
      Class7379 var7 = var1.method18360().method6739(var1.method18345());

      for (Direction var11 : var1.method18349()) {
         if (var11.method544().method324()) {
            var12 = var12.method23465(field19154, var11.method536());
            if (var12.method23443(var5, var6)) {
               return var12.method23465(field19155, Boolean.valueOf(var7.method23472() == Class9479.field44066));
            }
         }
      }

      return null;
   }

   @Override
   public BlockState method11500(BlockState var1, Class80 var2) {
      return var1.method23465(field19154, var2.method252(var1.<Direction>method23463(field19154)));
   }

   @Override
   public BlockState method11501(BlockState var1, Class2089 var2) {
      return var1.method23395(var2.method8749(var1.<Direction>method23463(field19154)));
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field19154, field19155);
   }

   @Override
   public Class7379 method11498(BlockState var1) {
      return !var1.<Boolean>method23463(field19155) ? super.method11498(var1) : Class9479.field44066.method25078(false);
   }
}
