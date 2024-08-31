package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class Class3425 extends Block {
   private static String[] field19162;
   public static final Class8551 field19163 = Class8820.field39704;
   public static final Class8551 field19164 = Class8820.field39682;
   public static final Class8551 field19165 = Class8820.field39685;
   public static final Class8551 field19166 = Class3392.field19019;
   public static final Class8551 field19167 = Class3392.field19020;
   public static final Class8551 field19168 = Class3392.field19021;
   public static final Class8551 field19169 = Class3392.field19022;
   private static final Map<Direction, Class8551> field19170 = Class3238.field18685;
   public static final VoxelShape field19171 = Block.method11539(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   public static final VoxelShape field19172 = Block.method11539(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private final Class3459 field19173;

   public Class3425(Class3459 var1, AbstractBlock var2) {
      super(var2);
      this.method11578(
         this.field18612
            .method35393()
            .method23465(field19163, Boolean.valueOf(false))
            .method23465(field19164, Boolean.valueOf(false))
            .method23465(field19165, Boolean.valueOf(false))
            .method23465(field19166, Boolean.valueOf(false))
            .method23465(field19167, Boolean.valueOf(false))
            .method23465(field19168, Boolean.valueOf(false))
            .method23465(field19169, Boolean.valueOf(false))
      );
      this.field19173 = var1;
   }

   @Override
   public VoxelShape method11483(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      return !var1.<Boolean>method23463(field19164) ? field19172 : field19171;
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      World var4 = var1.method18360();
      BlockPos var5 = var1.method18345();
      return this.method11579()
         .method23465(field19166, Boolean.valueOf(this.method12082(var4.getBlockState(var5.north()), Direction.NORTH)))
         .method23465(field19167, Boolean.valueOf(this.method12082(var4.getBlockState(var5.east()), Direction.EAST)))
         .method23465(field19168, Boolean.valueOf(this.method12082(var4.getBlockState(var5.south()), Direction.SOUTH)))
         .method23465(field19169, Boolean.valueOf(this.method12082(var4.getBlockState(var5.west()), Direction.WEST)));
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return !var2.method544().method324()
         ? super.method11491(var1, var2, var3, var4, var5, var6)
         : var1.method23465(field19170.get(var2), Boolean.valueOf(this.method12082(var3, var2)));
   }

   @Override
   public void method11589(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var4.method23448(var1.getBlock())) {
         this.method12080(var2, var3, var1);
      }
   }

   @Override
   public void method11513(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var5 && !var1.method23448(var4.getBlock())) {
         this.method12080(var2, var3, var1.method23465(field19163, Boolean.valueOf(true)));
      }
   }

   @Override
   public void method11574(World var1, BlockPos var2, BlockState var3, PlayerEntity var4) {
      if (!var1.isRemote && !var4.method3090().isEmpty() && var4.method3090().getItem() == Items.field37956) {
         var1.setBlockState(var2, var3.method23465(field19165, Boolean.valueOf(true)), 4);
      }

      super.method11574(var1, var2, var3, var4);
   }

   private void method12080(World var1, BlockPos var2, BlockState var3) {
      for (Direction var9 : new Direction[]{Direction.SOUTH, Direction.WEST}) {
         for (int var10 = 1; var10 < 42; var10++) {
            BlockPos var11 = var2.method8350(var9, var10);
            BlockState var12 = var1.getBlockState(var11);
            if (var12.method23448(this.field19173)) {
               if (var12.<Direction>method23463(Class3459.field19281) == var9.method536()) {
                  this.field19173.method12134(var1, var11, var12, false, true, var10, var3);
               }
               break;
            }

            if (!var12.method23448(this)) {
               break;
            }
         }
      }
   }

   @Override
   public void method11523(BlockState var1, World var2, BlockPos var3, Entity var4) {
      if (!var2.isRemote && !var1.<Boolean>method23463(field19163)) {
         this.method12081(var2, var3);
      }
   }

   @Override
   public void method11522(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (var2.getBlockState(var3).<Boolean>method23463(field19163)) {
         this.method12081(var2, var3);
      }
   }

   private void method12081(World var1, BlockPos var2) {
      BlockState var5 = var1.getBlockState(var2);
      boolean var6 = var5.<Boolean>method23463(field19163);
      boolean var7 = false;
      List<Entity> var8 = var1.method7181(null, var5.method23412(var1, var2).method19514().method19668(var2));
      if (!var8.isEmpty()) {
         for (Entity var10 : var8) {
            if (!var10.method3371()) {
               var7 = true;
               break;
            }
         }
      }

      if (var7 != var6) {
         var5 = var5.method23465(field19163, Boolean.valueOf(var7));
         var1.setBlockState(var2, var5, 3);
         this.method12080(var1, var2, var5);
      }

      if (var7) {
         var1.method6860().method20726(new BlockPos(var2), this, 10);
      }
   }

   public boolean method12082(BlockState var1, Direction var2) {
      Block var5 = var1.getBlock();
      return var5 != this.field19173 ? var5 == this : var1.<Direction>method23463(Class3459.field19281) == var2.method536();
   }

   @Override
   public BlockState method11500(BlockState var1, Class80 var2) {
      switch (Class7246.field31110[var2.ordinal()]) {
         case 1:
            return var1.method23465(field19166, var1.<Boolean>method23463(field19168))
               .method23465(field19167, var1.<Boolean>method23463(field19169))
               .method23465(field19168, var1.<Boolean>method23463(field19166))
               .method23465(field19169, var1.<Boolean>method23463(field19167));
         case 2:
            return var1.method23465(field19166, var1.<Boolean>method23463(field19167))
               .method23465(field19167, var1.<Boolean>method23463(field19168))
               .method23465(field19168, var1.<Boolean>method23463(field19169))
               .method23465(field19169, var1.<Boolean>method23463(field19166));
         case 3:
            return var1.method23465(field19166, var1.<Boolean>method23463(field19169))
               .method23465(field19167, var1.<Boolean>method23463(field19166))
               .method23465(field19168, var1.<Boolean>method23463(field19167))
               .method23465(field19169, var1.<Boolean>method23463(field19168));
         default:
            return var1;
      }
   }

   @Override
   public BlockState method11501(BlockState var1, Class2089 var2) {
      switch (Class7246.field31111[var2.ordinal()]) {
         case 1:
            return var1.method23465(field19166, var1.<Boolean>method23463(field19168)).method23465(field19168, var1.<Boolean>method23463(field19166));
         case 2:
            return var1.method23465(field19167, var1.<Boolean>method23463(field19169)).method23465(field19169, var1.<Boolean>method23463(field19167));
         default:
            return super.method11501(var1, var2);
      }
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field19163, field19164, field19165, field19166, field19167, field19169, field19168);
   }
}
