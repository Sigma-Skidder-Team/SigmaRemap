package mapped;

import java.util.List;
import java.util.Random;

public abstract class Class3202 extends Class3200 {
   public static final Class8551 field18510 = Class8820.field39704;
   public static final VoxelShape field18511 = Block.method11539(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   public static final VoxelShape field18512 = Block.method11539(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   public static final VoxelShape field18513 = Block.method11539(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   public static final VoxelShape field18514 = Block.method11539(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   public static final VoxelShape field18515 = Block.method11539(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   public static final VoxelShape field18516 = Block.method11539(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   public static final VoxelShape field18517 = Block.method11539(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   public static final VoxelShape field18518 = Block.method11539(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   public static final VoxelShape field18519 = Block.method11539(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   public static final VoxelShape field18520 = Block.method11539(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   public static final VoxelShape field18521 = Block.method11539(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   public static final VoxelShape field18522 = Block.method11539(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   public static final VoxelShape field18523 = Block.method11539(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   public static final VoxelShape field18524 = Block.method11539(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   public static final VoxelShape field18525 = Block.method11539(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   public static final VoxelShape field18526 = Block.method11539(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final boolean field18527;

   public Class3202(boolean var1, AbstractBlock var2) {
      super(var2);
      this.method11578(
         this.field18612
            .method35393()
            .method23465(field18484, Direction.NORTH)
            .method23465(field18510, Boolean.valueOf(false))
            .method23465(field18500, Class103.field314)
      );
      this.field18527 = var1;
   }

   private int method11518() {
      return !this.field18527 ? 20 : 30;
   }

   @Override
   public VoxelShape method11483(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      Direction var7 = var1.<Direction>method23463(field18484);
      boolean var8 = var1.<Boolean>method23463(field18510);
      switch (Class6392.field27980[var1.<Class103>method23463(field18500).ordinal()]) {
         case 1:
            if (var7.method544() == Class113.field413) {
               return var8 ? field18521 : field18513;
            }

            return var8 ? field18522 : field18514;
         case 2:
            switch (Class6392.field27979[var7.ordinal()]) {
               case 1:
                  return var8 ? field18526 : field18518;
               case 2:
                  return var8 ? field18525 : field18517;
               case 3:
                  return var8 ? field18524 : field18516;
               case 4:
               default:
                  return var8 ? field18523 : field18515;
            }
         case 3:
         default:
            if (var7.method544() == Class113.field413) {
               return var8 ? field18519 : field18511;
            } else {
               return var8 ? field18520 : field18512;
            }
      }
   }

   @Override
   public ActionResultType method11505(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (!var1.<Boolean>method23463(field18510)) {
         this.method11519(var1, var2, var3);
         this.method11520(var4, var2, var3, true);
         return ActionResultType.method9002(var2.field9020);
      } else {
         return ActionResultType.field14819;
      }
   }

   public void method11519(BlockState var1, World var2, BlockPos var3) {
      var2.method6725(var3, var1.method23465(field18510, Boolean.valueOf(true)), 3);
      this.method11525(var1, var2, var3);
      var2.method6860().method20726(var3, this, this.method11518());
   }

   public void method11520(PlayerEntity var1, Class1660 var2, BlockPos var3, boolean var4) {
      var2.method6742(!var4 ? null : var1, var3, this.method11521(var4), Class2266.field14732, 0.3F, !var4 ? 0.5F : 0.6F);
   }

   public abstract Class9455 method11521(boolean var1);

   @Override
   public void method11513(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var5 && !var1.method23448(var4.getBlock())) {
         if (var1.<Boolean>method23463(field18510)) {
            this.method11525(var1, var2, var3);
         }

         super.method11513(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public int method11514(BlockState var1, Class1665 var2, BlockPos var3, Direction var4) {
      return !var1.<Boolean>method23463(field18510) ? 0 : 15;
   }

   @Override
   public int method11515(BlockState var1, Class1665 var2, BlockPos var3, Direction var4) {
      return var1.<Boolean>method23463(field18510) && method11509(var1) == var4 ? 15 : 0;
   }

   @Override
   public boolean method11516(BlockState var1) {
      return true;
   }

   @Override
   public void method11522(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (var1.<Boolean>method23463(field18510)) {
         if (!this.field18527) {
            var2.method6725(var3, var1.method23465(field18510, Boolean.valueOf(false)), 3);
            this.method11525(var1, var2, var3);
            this.method11520((PlayerEntity)null, var2, var3, false);
         } else {
            this.method11524(var1, var2, var3);
         }
      }
   }

   @Override
   public void method11523(BlockState var1, World var2, BlockPos var3, Entity var4) {
      if (!var2.field9020 && this.field18527 && !var1.<Boolean>method23463(field18510)) {
         this.method11524(var1, var2, var3);
      }
   }

   private void method11524(BlockState var1, World var2, BlockPos var3) {
      List var6 = var2.<AbstractArrowEntity>method7182(AbstractArrowEntity.class, var1.method23412(var2, var3).method19514().method19668(var3));
      boolean var7 = !var6.isEmpty();
      boolean var8 = var1.<Boolean>method23463(field18510);
      if (var7 != var8) {
         var2.method6725(var3, var1.method23465(field18510, Boolean.valueOf(var7)), 3);
         this.method11525(var1, var2, var3);
         this.method11520((PlayerEntity)null, var2, var3, var7);
      }

      if (var7) {
         var2.method6860().method20726(new BlockPos(var3), this, this.method11518());
      }
   }

   private void method11525(BlockState var1, World var2, BlockPos var3) {
      var2.method6733(var3, this);
      var2.method6733(var3.method8349(method11509(var1).method536()), this);
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18484, field18510, field18500);
   }
}
