package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.PushReaction;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

public abstract class Class3429 extends Block {
   public static final VoxelShape field19187 = Block.method11539(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final VoxelShape field19188 = Block.method11539(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private final boolean field19189;

   public static boolean method12086(World var0, BlockPos var1) {
      return method12087(var0.getBlockState(var1));
   }

   public static boolean method12087(BlockState var0) {
      return var0.isIn(BlockTags.field32766) && var0.getBlock() instanceof Class3429;
   }

   public Class3429(boolean var1, AbstractBlock var2) {
      super(var2);
      this.field19189 = var1;
   }

   public boolean method12088() {
      return this.field19189;
   }

   @Override
   public VoxelShape method11483(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      Class96 var7 = !var1.isIn(this) ? null : var1.<Class96>method23463(this.method12093());
      return var7 != null && var7.method275() ? field19188 : field19187;
   }

   @Override
   public boolean method11492(BlockState var1, IWorldReader var2, BlockPos var3) {
      return method11547(var2, var3.down());
   }

   @Override
   public void method11589(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var4.isIn(var1.getBlock())) {
         this.method12089(var1, var2, var3, var5);
      }
   }

   public BlockState method12089(BlockState var1, World var2, BlockPos var3, boolean var4) {
      var1 = this.method12092(var2, var3, var1, true);
      if (this.field19189) {
         var1.method23423(var2, var3, this, var3, var4);
      }

      return var1;
   }

   @Override
   public void method11506(BlockState var1, World var2, BlockPos var3, Block var4, BlockPos var5, boolean var6) {
      if (!var2.isRemote && var2.getBlockState(var3).isIn(this)) {
         Class96 var9 = var1.<Class96>method23463(this.method12093());
         if (!method12090(var3, var2, var9)) {
            this.method12091(var1, var2, var3, var4);
         } else {
            method11554(var1, var2, var3);
            var2.removeBlock(var3, var6);
         }
      }
   }

   private static boolean method12090(BlockPos var0, World var1, Class96 var2) {
      if (!method11547(var1, var0.down())) {
         return true;
      } else {
         switch (Class4683.field22260[var2.ordinal()]) {
            case 1:
               return !method11547(var1, var0.east());
            case 2:
               return !method11547(var1, var0.west());
            case 3:
               return !method11547(var1, var0.north());
            case 4:
               return !method11547(var1, var0.south());
            default:
               return false;
         }
      }
   }

   public void method12091(BlockState var1, World var2, BlockPos var3, Block var4) {
   }

   public BlockState method12092(World var1, BlockPos var2, BlockState var3, boolean var4) {
      if (!var1.isRemote) {
         Class96 var7 = var3.<Class96>method23463(this.method12093());
         return new Class9435(var1, var2, var3).method36244(var1.method6780(var2), var4, var7).method36245();
      } else {
         return var3;
      }
   }

   @Override
   public PushReaction method11689(BlockState var1) {
      return PushReaction.field15862;
   }

   @Override
   public void method11513(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var5) {
         super.method11513(var1, var2, var3, var4, var5);
         if (var1.<Class96>method23463(this.method12093()).method275()) {
            var2.notifyNeighborsOfStateChange(var3.up(), this);
         }

         if (this.field19189) {
            var2.notifyNeighborsOfStateChange(var3, this);
            var2.notifyNeighborsOfStateChange(var3.down(), this);
         }
      }
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      BlockState var4 = super.method11579();
      Direction var5 = var1.method18350();
      boolean var6 = var5 == Direction.EAST || var5 == Direction.WEST;
      return var4.method23465(this.method12093(), !var6 ? Class96.field247 : Class96.field248);
   }

   public abstract Class8550<Class96> method12093();
}
