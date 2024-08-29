package mapped;

import java.util.Random;
import javax.annotation.Nullable;

public class Class3354 extends Class3241 {
   public static final Class8553 field18880 = Class3198.field18484;
   public static final Class8551 field18881 = Class8820.field39704;
   public static final Class8551 field18882 = Class8820.field39696;
   public static final VoxelShape field18883 = Block.method11539(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final VoxelShape field18884 = Block.method11539(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final VoxelShape field18885 = VoxelShapes.method27431(field18883, field18884);
   public static final VoxelShape field18886 = Block.method11539(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final VoxelShape field18887 = VoxelShapes.method27431(field18885, field18886);
   public static final VoxelShape field18888 = VoxelShapes.method27432(
      Block.method11539(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0),
      Block.method11539(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0),
      Block.method11539(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0),
      field18885
   );
   public static final VoxelShape field18889 = VoxelShapes.method27432(
      Block.method11539(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333),
      Block.method11539(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667),
      Block.method11539(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0),
      field18885
   );
   public static final VoxelShape field18890 = VoxelShapes.method27432(
      Block.method11539(15.0, 10.0, 0.0, 10.666667, 14.0, 16.0),
      Block.method11539(10.666667, 12.0, 0.0, 6.333333, 16.0, 16.0),
      Block.method11539(6.333333, 14.0, 0.0, 2.0, 18.0, 16.0),
      field18885
   );
   public static final VoxelShape field18891 = VoxelShapes.method27432(
      Block.method11539(0.0, 10.0, 15.0, 16.0, 14.0, 10.666667),
      Block.method11539(0.0, 12.0, 10.666667, 16.0, 16.0, 6.333333),
      Block.method11539(0.0, 14.0, 6.333333, 16.0, 18.0, 2.0),
      field18885
   );

   public Class3354(AbstractBlock var1) {
      super(var1);
      this.method11578(
         this.field18612
            .method35393()
            .method23465(field18880, Direction.NORTH)
            .method23465(field18881, Boolean.valueOf(false))
            .method23465(field18882, Boolean.valueOf(false))
      );
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.MODEL;
   }

   @Override
   public VoxelShape method11503(BlockState var1, Class1665 var2, BlockPos var3) {
      return field18885;
   }

   @Override
   public boolean method11534(BlockState var1) {
      return true;
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      World var4 = var1.method18360();
      ItemStack var5 = var1.method18357();
      CompoundNBT var6 = var5.method32142();
      PlayerEntity var7 = var1.method18358();
      boolean var8 = false;
      if (!var4.field9020 && var7 != null && var6 != null && var7.method2979() && var6.contains("BlockEntityTag")) {
         CompoundNBT var9 = var6.getCompound("BlockEntityTag");
         if (var9.contains("Book")) {
            var8 = true;
         }
      }

      return this.method11579().method23465(field18880, var1.method18350().method536()).method23465(field18882, Boolean.valueOf(var8));
   }

   @Override
   public VoxelShape method11502(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      return field18887;
   }

   @Override
   public VoxelShape method11483(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      switch (Class7719.field33128[var1.<Direction>method23463(field18880).ordinal()]) {
         case 1:
            return field18889;
         case 2:
            return field18891;
         case 3:
            return field18890;
         case 4:
            return field18888;
         default:
            return field18885;
      }
   }

   @Override
   public BlockState method11500(BlockState var1, Class80 var2) {
      return var1.method23465(field18880, var2.method252(var1.<Direction>method23463(field18880)));
   }

   @Override
   public BlockState method11501(BlockState var1, Class2089 var2) {
      return var1.method23395(var2.method8749(var1.<Direction>method23463(field18880)));
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18880, field18881, field18882);
   }

   @Nullable
   @Override
   public TileEntity method11646(Class1665 var1) {
      return new Class948();
   }

   public static boolean method11919(World var0, BlockPos var1, BlockState var2, ItemStack var3) {
      if (var2.<Boolean>method23463(field18882)) {
         return false;
      } else {
         if (!var0.field9020) {
            method11920(var0, var1, var2, var3);
         }

         return true;
      }
   }

   private static void method11920(World var0, BlockPos var1, BlockState var2, ItemStack var3) {
      TileEntity var6 = var0.getTileEntity(var1);
      if (var6 instanceof Class948) {
         Class948 var7 = (Class948)var6;
         var7.method3807(var3.method32106(1));
         method11921(var0, var1, var2, true);
         var0.method6742((PlayerEntity)null, var1, Sounds.field26415, Class2266.field14732, 1.0F, 1.0F);
      }
   }

   public static void method11921(World var0, BlockPos var1, BlockState var2, boolean var3) {
      var0.method6725(var1, var2.method23465(field18881, Boolean.valueOf(false)).method23465(field18882, Boolean.valueOf(var3)), 3);
      method11924(var0, var1, var2);
   }

   public static void method11922(World var0, BlockPos var1, BlockState var2) {
      method11923(var0, var1, var2, true);
      var0.method6860().method20726(var1, var2.getBlock(), 2);
      var0.method6999(1043, var1, 0);
   }

   private static void method11923(World var0, BlockPos var1, BlockState var2, boolean var3) {
      var0.method6725(var1, var2.method23465(field18881, Boolean.valueOf(var3)), 3);
      method11924(var0, var1, var2);
   }

   private static void method11924(World var0, BlockPos var1, BlockState var2) {
      var0.method6733(var1.method8313(), var2.getBlock());
   }

   @Override
   public void method11522(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      method11923(var2, var3, var1, false);
   }

   @Override
   public void method11513(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var1.method23448(var4.getBlock())) {
         if (var1.<Boolean>method23463(field18882)) {
            this.method11925(var1, var2, var3);
         }

         if (var1.<Boolean>method23463(field18881)) {
            var2.method6733(var3.method8313(), this);
         }

         super.method11513(var1, var2, var3, var4, var5);
      }
   }

   private void method11925(BlockState var1, World var2, BlockPos var3) {
      TileEntity var6 = var2.getTileEntity(var3);
      if (var6 instanceof Class948) {
         Class948 var7 = (Class948)var6;
         Direction var8 = var1.<Direction>method23463(field18880);
         ItemStack var9 = var7.method3805().copy();
         float var10 = 0.25F * (float)var8.method539();
         float var11 = 0.25F * (float)var8.method541();
         ItemEntity var12 = new ItemEntity(
            var2, (double)var3.getX() + 0.5 + (double)var10, (double)(var3.getY() + 1), (double)var3.getZ() + 0.5 + (double)var11, var9
         );
         var12.method4131();
         var2.method6916(var12);
         var7.method3625();
      }
   }

   @Override
   public boolean method11516(BlockState var1) {
      return true;
   }

   @Override
   public int method11514(BlockState var1, Class1665 var2, BlockPos var3, Direction var4) {
      return !var1.<Boolean>method23463(field18881) ? 0 : 15;
   }

   @Override
   public int method11515(BlockState var1, Class1665 var2, BlockPos var3, Direction var4) {
      return var4 == Direction.field673 && var1.<Boolean>method23463(field18881) ? 15 : 0;
   }

   @Override
   public boolean method11648(BlockState var1) {
      return true;
   }

   @Override
   public int method11649(BlockState var1, World var2, BlockPos var3) {
      if (var1.<Boolean>method23463(field18882)) {
         TileEntity var6 = var2.getTileEntity(var3);
         if (var6 instanceof Class948) {
            return ((Class948)var6).method3812();
         }
      }

      return 0;
   }

   @Override
   public ActionResultType method11505(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (var1.<Boolean>method23463(field18882)) {
         if (!var2.field9020) {
            this.method11926(var2, var3, var4);
         }

         return ActionResultType.method9002(var2.field9020);
      } else {
         ItemStack var9 = var4.getHeldItem(var5);
         return !var9.isEmpty() && !var9.getItem().method11743(Class5985.field26120) ? ActionResultType.field14819 : ActionResultType.field14820;
      }
   }

   @Nullable
   @Override
   public Class949 method11528(BlockState var1, World var2, BlockPos var3) {
      return var1.<Boolean>method23463(field18882) ? super.method11528(var1, var2, var3) : null;
   }

   private void method11926(World var1, BlockPos var2, PlayerEntity var3) {
      TileEntity var6 = var1.getTileEntity(var2);
      if (var6 instanceof Class948) {
         var3.method2766((Class948)var6);
         var3.method2911(Class8876.field40167);
      }
   }

   @Override
   public boolean method11494(BlockState var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}
