package mapped;

import java.util.Random;

public class Class3201 extends Class3200 {
   private static String[] field18499;
   public static final Class8551 field18501 = Class8820.field39704;
   public static final VoxelShape field18502 = Block.method11539(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   public static final VoxelShape field18503 = Block.method11539(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   public static final VoxelShape field18504 = Block.method11539(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   public static final VoxelShape field18505 = Block.method11539(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   public static final VoxelShape field18506 = Block.method11539(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   public static final VoxelShape field18507 = Block.method11539(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   public static final VoxelShape field18508 = Block.method11539(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   public static final VoxelShape field18509 = Block.method11539(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   public Class3201(AbstractBlock var1) {
      super(var1);
      this.method11578(
         this.field18612
            .method35393()
            .method23465(field18484, Direction.NORTH)
            .method23465(field18501, Boolean.valueOf(false))
            .method23465(field18500, Class103.field314)
      );
   }

   @Override
   public VoxelShape method11483(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      switch (Class6596.field29026[var1.<Class103>method23463(field18500).ordinal()]) {
         case 1:
            switch (Class6596.field29024[var1.<Direction>method23463(field18484).method544().ordinal()]) {
               case 1:
                  return field18507;
               case 2:
               default:
                  return field18506;
            }
         case 2:
            switch (Class6596.field29025[var1.<Direction>method23463(field18484).ordinal()]) {
               case 1:
                  return field18505;
               case 2:
                  return field18504;
               case 3:
                  return field18503;
               case 4:
               default:
                  return field18502;
            }
         case 3:
         default:
            switch (Class6596.field29024[var1.<Direction>method23463(field18484).method544().ordinal()]) {
               case 1:
                  return field18509;
               case 2:
               default:
                  return field18508;
            }
      }
   }

   @Override
   public ActionResultType method11505(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (!var2.isRemote) {
         BlockState var11 = this.method11510(var1, var2, var3);
         float var10 = !var11.<Boolean>method23463(field18501) ? 0.5F : 0.6F;
         var2.method6742((PlayerEntity)null, var3, Sounds.field26730, Class2266.field14732, 0.3F, var10);
         return ActionResultType.field14819;
      } else {
         BlockState var9 = var1.method23459(field18501);
         if (var9.<Boolean>method23463(field18501)) {
            method11511(var9, var2, var3, 1.0F);
         }

         return ActionResultType.field14818;
      }
   }

   public BlockState method11510(BlockState var1, World var2, BlockPos var3) {
      var1 = var1.method23459(field18501);
      var2.setBlockState(var3, var1, 3);
      this.method11517(var1, var2, var3);
      return var1;
   }

   private static void method11511(BlockState var0, Class1660 var1, BlockPos var2, float var3) {
      Direction var6 = var0.<Direction>method23463(field18484).method536();
      Direction var7 = method11509(var0).method536();
      double var8 = (double)var2.getX() + 0.5 + 0.1 * (double)var6.method539() + 0.2 * (double)var7.method539();
      double var10 = (double)var2.getY() + 0.5 + 0.1 * (double)var6.method540() + 0.2 * (double)var7.method540();
      double var12 = (double)var2.getZ() + 0.5 + 0.1 * (double)var6.method541() + 0.2 * (double)var7.method541();
      var1.method6746(new Class7437(1.0F, 0.0F, 0.0F, var3), var8, var10, var12, 0.0, 0.0, 0.0);
   }

   @Override
   public void method11512(BlockState var1, World var2, BlockPos var3, Random var4) {
      if (var1.<Boolean>method23463(field18501) && var4.nextFloat() < 0.25F) {
         method11511(var1, var2, var3, 0.5F);
      }
   }

   @Override
   public void method11513(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var5 && !var1.method23448(var4.getBlock())) {
         if (var1.<Boolean>method23463(field18501)) {
            this.method11517(var1, var2, var3);
         }

         super.method11513(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public int method11514(BlockState var1, Class1665 var2, BlockPos var3, Direction var4) {
      return !var1.<Boolean>method23463(field18501) ? 0 : 15;
   }

   @Override
   public int method11515(BlockState var1, Class1665 var2, BlockPos var3, Direction var4) {
      return var1.<Boolean>method23463(field18501) && method11509(var1) == var4 ? 15 : 0;
   }

   @Override
   public boolean method11516(BlockState var1) {
      return true;
   }

   private void method11517(BlockState var1, World var2, BlockPos var3) {
      var2.notifyNeighborsOfStateChange(var3, this);
      var2.notifyNeighborsOfStateChange(var3.method8349(method11509(var1).method536()), this);
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18500, field18484, field18501);
   }
}
