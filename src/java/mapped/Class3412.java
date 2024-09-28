package mapped;

import javax.annotation.Nullable;

import net.minecraft.block.HorizontalBlock;
import net.minecraft.state.DirectionProperty;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class Class3412 extends Block {
   private static final ITextComponent field19096 = new TranslationTextComponent("container.stonecutter");
   public static final DirectionProperty field19097 = HorizontalBlock.HORIZONTAL_FACING;
   public static final VoxelShape field19098 = Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   public Class3412(Properties var1) {
      super(var1);
      this.method11578(this.field18612.method35393().with(field19097, Direction.NORTH));
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      return this.method11579().with(field19097, var1.method18350().getOpposite());
   }

   @Override
   public ActionResultType method11505(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (!var2.isRemote) {
         var4.method2766(var1.method23445(var2, var3));
         var4.method2911(Stats.field40171);
         return ActionResultType.field14819;
      } else {
         return ActionResultType.SUCCESS;
      }
   }

   @Nullable
   @Override
   public Class949 method11528(BlockState var1, World var2, BlockPos var3) {
      return new Class953((var2x, var3x, var4) -> new Class5811(var2x, var3x, IWorldPosCallable.method31714(var2, var3)), field19096);
   }

   @Override
   public VoxelShape method11483(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field19098;
   }

   @Override
   public boolean method11534(BlockState var1) {
      return true;
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.MODEL;
   }

   @Override
   public BlockState rotate(BlockState var1, Rotation var2) {
      return var1.with(field19097, var2.rotate(var1.<Direction>get(field19097)));
   }

   @Override
   public BlockState mirror(BlockState var1, Mirror var2) {
      return var1.rotate(var2.toRotation(var1.<Direction>get(field19097)));
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field19097);
   }

   @Override
   public boolean method11494(BlockState var1, IBlockReader var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}
