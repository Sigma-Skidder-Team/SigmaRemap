package mapped;

import java.util.Random;

public class Class3376 extends Class3241 {
   private static String[] field18974;
   public static final Class8551[] field18975 = new Class8551[]{Class8820.field39692, Class8820.field39693, Class8820.field39694};
   public static final VoxelShape field18976 = VoxelShapes.method27431(
      Block.method11539(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), Block.method11539(7.0, 0.0, 7.0, 9.0, 14.0, 9.0)
   );

   public Class3376(AbstractBlock var1) {
      super(var1);
      this.method11578(
         this.field18612
            .method35393()
            .method23465(field18975[0], Boolean.valueOf(false))
            .method23465(field18975[1], Boolean.valueOf(false))
            .method23465(field18975[2], Boolean.valueOf(false))
      );
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.MODEL;
   }

   @Override
   public TileEntity method11646(Class1665 var1) {
      return new Class931();
   }

   @Override
   public VoxelShape method11483(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      return field18976;
   }

   @Override
   public ActionResultType method11505(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (!var2.isRemote) {
         TileEntity var9 = var2.getTileEntity(var3);
         if (var9 instanceof Class931) {
            var4.method2766((Class931)var9);
            var4.method2911(Class8876.field40147);
         }

         return ActionResultType.field14819;
      } else {
         return ActionResultType.field14818;
      }
   }

   @Override
   public void method11563(World var1, BlockPos var2, BlockState var3, Class880 var4, ItemStack var5) {
      if (var5.method32152()) {
         TileEntity var8 = var1.getTileEntity(var2);
         if (var8 instanceof Class931) {
            ((Class931)var8).method3695(var5.method32149());
         }
      }
   }

   @Override
   public void method11512(BlockState var1, World var2, BlockPos var3, Random var4) {
      double var7 = (double)var3.getX() + 0.4 + (double)var4.nextFloat() * 0.2;
      double var9 = (double)var3.getY() + 0.7 + (double)var4.nextFloat() * 0.3;
      double var11 = (double)var3.getZ() + 0.4 + (double)var4.nextFloat() * 0.2;
      var2.method6746(Class7940.field34092, var7, var9, var11, 0.0, 0.0, 0.0);
   }

   @Override
   public void method11513(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var1.method23448(var4.getBlock())) {
         TileEntity var8 = var2.getTileEntity(var3);
         if (var8 instanceof Class931) {
            Class7236.method22721(var2, var3, (Class931)var8);
         }

         super.method11513(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public boolean method11648(BlockState var1) {
      return true;
   }

   @Override
   public int method11649(BlockState var1, World var2, BlockPos var3) {
      return Class5812.method18151(var2.getTileEntity(var3));
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18975[0], field18975[1], field18975[2]);
   }

   @Override
   public boolean method11494(BlockState var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}
