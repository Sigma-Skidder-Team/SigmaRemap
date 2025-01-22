package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.JigsawTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.jigsaw.JigsawOrientation;

import javax.annotation.Nullable;

public class JigsawBlock extends Block implements ITileEntityProvider {
   public static final EnumProperty<JigsawOrientation> field18712 = BlockStateProperties.ORIENTATION;

   public JigsawBlock(Properties var1) {
      super(var1);
      this.setDefaultState(this.stateContainer.getBaseState().with(field18712, JigsawOrientation.field657));
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field18712);
   }

   @Override
   public BlockState rotate(BlockState var1, Rotation var2) {
      return var1.with(field18712, var2.getOrientation().method510(var1.<JigsawOrientation>get(field18712)));
   }

   @Override
   public BlockState mirror(BlockState var1, Mirror var2) {
      return var1.with(field18712, var2.method8751().method510(var1.<JigsawOrientation>get(field18712)));
   }

   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      Direction var4 = var1.getFace();
      Direction var5;
      if (var4.getAxis() != Direction.Axis.Y) {
         var5 = Direction.UP;
      } else {
         var5 = var1.getPlacementHorizontalFacing().getOpposite();
      }

      return this.getDefaultState().with(field18712, JigsawOrientation.method526(var4, var5));
   }

   @Nullable
   @Override
   public TileEntity method11646(IBlockReader var1) {
      return new JigsawTileEntity();
   }

   @Override
   public ActionResultType onBlockActivated(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      TileEntity var9 = var2.getTileEntity(var3);
      if (var9 instanceof JigsawTileEntity && var4.canUseCommandBlock()) {
         var4.method2892((JigsawTileEntity)var9);
         return ActionResultType.method9002(var2.isRemote);
      } else {
         return ActionResultType.field14820;
      }
   }

   public static boolean method11674(Class8266 var0, Class8266 var1) {
      Direction var4 = method11675(var0.field35531);
      Direction var5 = method11675(var1.field35531);
      Direction var6 = method11676(var0.field35531);
      Direction var7 = method11676(var1.field35531);
      JigsawTileEntity.OrientationType var8 = JigsawTileEntity.OrientationType.method269(var0.field35532.getString("joint")).orElseGet(() -> !var4.getAxis().isHorizontal() ? JigsawTileEntity.OrientationType.ROLLABLE : JigsawTileEntity.OrientationType.ALIGNED);
      boolean var9 = var8 == JigsawTileEntity.OrientationType.ROLLABLE;
      return var4 == var5.getOpposite() && (var9 || var6 == var7) && var0.field35532.getString("target").equals(var1.field35532.getString("name"));
   }

   public static Direction method11675(BlockState var0) {
      return var0.<JigsawOrientation>get(field18712).method527();
   }

   public static Direction method11676(BlockState var0) {
      return var0.<JigsawOrientation>get(field18712).method528();
   }
}
