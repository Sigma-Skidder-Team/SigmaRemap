package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class Class3199 extends Class3198 {
   private static String[] field18485;
   public static final Class8551 field18486 = Class8820.field39702;
   public static final Class8551 field18487 = Class8820.field39704;
   public static final Class8551 field18488 = Class8820.field39698;
   public static final VoxelShape field18489 = Block.method11539(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   public static final VoxelShape field18490 = Block.method11539(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   public static final VoxelShape field18491 = Block.method11539(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   public static final VoxelShape field18492 = Block.method11539(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   public static final VoxelShape field18493 = Block.method11539(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   public static final VoxelShape field18494 = Block.method11539(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   public static final VoxelShape field18495 = VoxelShapes.method27431(
      Block.method11539(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), Block.method11539(14.0, 5.0, 7.0, 16.0, 16.0, 9.0)
   );
   public static final VoxelShape field18496 = VoxelShapes.method27431(
      Block.method11539(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), Block.method11539(7.0, 5.0, 14.0, 9.0, 16.0, 16.0)
   );
   public static final VoxelShape field18497 = VoxelShapes.method27431(
      Block.method11539(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), Block.method11539(14.0, 2.0, 7.0, 16.0, 13.0, 9.0)
   );
   public static final VoxelShape field18498 = VoxelShapes.method27431(
      Block.method11539(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), Block.method11539(7.0, 2.0, 14.0, 9.0, 13.0, 16.0)
   );

   public Class3199(AbstractBlock var1) {
      super(var1);
      this.method11578(
         this.field18612
            .method35393()
            .method23465(field18486, Boolean.valueOf(false))
            .method23465(field18487, Boolean.valueOf(false))
            .method23465(field18488, Boolean.valueOf(false))
      );
   }

   @Override
   public VoxelShape method11483(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      if (!var1.<Boolean>method23463(field18488)) {
         return var1.<Direction>method23463(field18484).method544() != Class113.field413 ? field18489 : field18490;
      } else {
         return var1.<Direction>method23463(field18484).method544() != Class113.field413 ? field18491 : field18492;
      }
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      Class113 var9 = var2.method544();
      if (var1.<Direction>method23463(field18484).method537().method544() != var9) {
         return super.method11491(var1, var2, var3, var4, var5, var6);
      } else {
         boolean var10 = this.method11504(var3) || this.method11504(var4.getBlockState(var5.method8349(var2.method536())));
         return var1.method23465(field18488, Boolean.valueOf(var10));
      }
   }

   @Override
   public VoxelShape method11502(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      if (!var1.<Boolean>method23463(field18486)) {
         return var1.<Direction>method23463(field18484).method544() != Class113.field415 ? field18494 : field18493;
      } else {
         return VoxelShapes.method27425();
      }
   }

   @Override
   public VoxelShape method11503(BlockState var1, IBlockReader var2, BlockPos var3) {
      if (!var1.<Boolean>method23463(field18488)) {
         return var1.<Direction>method23463(field18484).method544() != Class113.field413 ? field18495 : field18496;
      } else {
         return var1.<Direction>method23463(field18484).method544() != Class113.field413 ? field18497 : field18498;
      }
   }

   @Override
   public boolean method11494(BlockState var1, IBlockReader var2, BlockPos var3, Class1947 var4) {
      switch (Class9845.field45949[var4.ordinal()]) {
         case 1:
            return var1.<Boolean>method23463(field18486);
         case 2:
            return false;
         case 3:
            return var1.<Boolean>method23463(field18486);
         default:
            return false;
      }
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      World var4 = var1.method18360();
      BlockPos var5 = var1.method18345();
      boolean var6 = var4.method6780(var5);
      Direction var7 = var1.method18350();
      Class113 var8 = var7.method544();
      boolean var9 = var8 == Class113.field415
            && (this.method11504(var4.getBlockState(var5.west())) || this.method11504(var4.getBlockState(var5.east())))
         || var8 == Class113.field413 && (this.method11504(var4.getBlockState(var5.north())) || this.method11504(var4.getBlockState(var5.south())));
      return this.method11579()
         .method23465(field18484, var7)
         .method23465(field18486, Boolean.valueOf(var6))
         .method23465(field18487, Boolean.valueOf(var6))
         .method23465(field18488, Boolean.valueOf(var9));
   }

   private boolean method11504(BlockState var1) {
      return var1.getBlock().method11540(BlockTags.field32764);
   }

   @Override
   public ActionResultType method11505(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (!var1.<Boolean>method23463(field18486)) {
         Direction var9 = var4.method3386();
         if (var1.<Direction>method23463(field18484) == var9.method536()) {
            var1 = var1.method23465(field18484, var9);
         }

         var1 = var1.method23465(field18486, Boolean.valueOf(true));
         var2.setBlockState(var3, var1, 10);
      } else {
         var1 = var1.method23465(field18486, Boolean.valueOf(false));
         var2.setBlockState(var3, var1, 10);
      }

      var2.method6869(var4, !var1.<Boolean>method23463(field18486) ? 1014 : 1008, var3, 0);
      return ActionResultType.method9002(var2.isRemote);
   }

   @Override
   public void method11506(BlockState var1, World var2, BlockPos var3, Block var4, BlockPos var5, boolean var6) {
      if (!var2.isRemote) {
         boolean var9 = var2.method6780(var3);
         if (var1.<Boolean>method23463(field18487) != var9) {
            var2.setBlockState(var3, var1.method23465(field18487, Boolean.valueOf(var9)).method23465(field18486, Boolean.valueOf(var9)), 2);
            if (var1.<Boolean>method23463(field18486) != var9) {
               var2.method6869((PlayerEntity)null, !var9 ? 1014 : 1008, var3, 0);
            }
         }
      }
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18484, field18486, field18487, field18488);
   }

   public static boolean method11507(BlockState var0, Direction var1) {
      return var0.<Direction>method23463(field18484).method544() == var1.method537().method544();
   }
}
