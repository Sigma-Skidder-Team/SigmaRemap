package mapped;

import java.util.Random;
import javax.annotation.Nullable;

import net.minecraft.block.ContainerBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class Class3363 extends ContainerBlock {
   private static String[] field18929;
   public static final VoxelShape field18930 = Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);

   public Class3363(Properties var1) {
      super(var1);
   }

   @Override
   public boolean isTransparent(BlockState var1) {
      return true;
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field18930;
   }

   @Override
   public void animateTick(BlockState var1, World var2, BlockPos var3, Random var4) {
      super.animateTick(var1, var2, var3, var4);

      for (int var7 = -2; var7 <= 2; var7++) {
         for (int var8 = -2; var8 <= 2; var8++) {
            if (var7 > -2 && var7 < 2 && var8 == -1) {
               var8 = 2;
            }

            if (var4.nextInt(16) == 0) {
               for (int var9 = 0; var9 <= 1; var9++) {
                  BlockPos var10 = var3.add(var7, var9, var8);
                  if (var2.getBlockState(var10).isIn(Blocks.BOOKSHELF)) {
                     if (!var2.method7007(var3.add(var7 / 2, 0, var8 / 2))) {
                        break;
                     }

                     var2.addParticle(
                        ParticleTypes.field34066,
                        (double)var3.getX() + 0.5,
                        (double)var3.getY() + 2.0,
                        (double)var3.getZ() + 0.5,
                        (double)((float)var7 + var4.nextFloat()) - 0.5,
                        (double)((float)var9 - var4.nextFloat() - 1.0F),
                        (double)((float)var8 + var4.nextFloat()) - 0.5
                     );
                  }
               }
            }
         }
      }
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.MODEL;
   }

   @Override
   public TileEntity method11646(IBlockReader var1) {
      return new Class934();
   }

   @Override
   public ActionResultType onBlockActivated(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (!var2.isRemote) {
         var4.method2766(var1.method23445(var2, var3));
         return ActionResultType.field14819;
      } else {
         return ActionResultType.SUCCESS;
      }
   }

   @Nullable
   @Override
   public Class949 method11528(BlockState var1, World var2, BlockPos var3) {
      TileEntity var6 = var2.getTileEntity(var3);
      if (!(var6 instanceof Class934)) {
         return null;
      } else {
         ITextComponent var7 = ((INameable)var6).getDisplayName();
         return new Class953((var2x, var3x, var4) -> new Class5822(var2x, var3x, IWorldPosCallable.method31714(var2, var3)), var7);
      }
   }

   @Override
   public void method11563(World var1, BlockPos var2, BlockState var3, LivingEntity var4, ItemStack var5) {
      if (var5.method32152()) {
         TileEntity var8 = var1.getTileEntity(var2);
         if (var8 instanceof Class934) {
            ((Class934)var8).method3698(var5.method32149());
         }
      }
   }

   @Override
   public boolean allowsMovement(BlockState var1, IBlockReader var2, BlockPos var3, PathType var4) {
      return false;
   }
}
