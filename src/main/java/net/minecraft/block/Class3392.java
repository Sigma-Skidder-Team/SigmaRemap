package net.minecraft.block;

import com.google.common.collect.Maps;
import mapped.VoxelShapes;
import net.minecraft.util.Util;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

import java.util.Map;

public class Class3392 extends Block {
   private static String[] field19017;
   private static final Direction[] field19018 = Direction.values();
   public static final BooleanProperty field19019 = BlockStateProperties.NORTH;
   public static final BooleanProperty field19020 = BlockStateProperties.EAST;
   public static final BooleanProperty field19021 = BlockStateProperties.SOUTH;
   public static final BooleanProperty field19022 = BlockStateProperties.WEST;
   public static final BooleanProperty field19023 = BlockStateProperties.UP;
   public static final BooleanProperty field19024 = BlockStateProperties.DOWN;
   public static final Map<Direction, BooleanProperty> field19025 = Util.<Map<Direction, BooleanProperty>>make(Maps.newEnumMap(Direction.class), var0 -> {
      var0.put(Direction.NORTH, field19019);
      var0.put(Direction.EAST, field19020);
      var0.put(Direction.SOUTH, field19021);
      var0.put(Direction.WEST, field19022);
      var0.put(Direction.UP, field19023);
      var0.put(Direction.DOWN, field19024);
   });
   public final VoxelShape[] field19026;

   public Class3392(float var1, Properties var2) {
      super(var2);
      this.field19026 = this.method12001(var1);
   }

   private VoxelShape[] method12001(float var1) {
      float var4 = 0.5F - var1;
      float var5 = 0.5F + var1;
      VoxelShape var6 = Block.makeCuboidShape(
         (double)(var4 * 16.0F), (double)(var4 * 16.0F), (double)(var4 * 16.0F), (double)(var5 * 16.0F), (double)(var5 * 16.0F), (double)(var5 * 16.0F)
      );
      VoxelShape[] var7 = new VoxelShape[field19018.length];

      for (int var8 = 0; var8 < field19018.length; var8++) {
         Direction var9 = field19018[var8];
         var7[var8] = VoxelShapes.create(
            0.5 + Math.min((double)(-var1), (double)var9.getXOffset() * 0.5),
            0.5 + Math.min((double)(-var1), (double)var9.getYOffset() * 0.5),
            0.5 + Math.min((double)(-var1), (double)var9.getZOffset() * 0.5),
            0.5 + Math.max((double)var1, (double)var9.getXOffset() * 0.5),
            0.5 + Math.max((double)var1, (double)var9.getYOffset() * 0.5),
            0.5 + Math.max((double)var1, (double)var9.getZOffset() * 0.5)
         );
      }

      VoxelShape[] var12 = new VoxelShape[64];

      for (int var13 = 0; var13 < 64; var13++) {
         VoxelShape var10 = var6;

         for (int var11 = 0; var11 < field19018.length; var11++) {
            if ((var13 & 1 << var11) != 0) {
               var10 = VoxelShapes.or(var10, var7[var11]);
            }
         }

         var12[var13] = var10;
      }

      return var12;
   }

   @Override
   public boolean propagatesSkylightDown(BlockState var1, IBlockReader var2, BlockPos var3) {
      return false;
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return this.field19026[this.method12002(var1)];
   }

   public int method12002(BlockState var1) {
      int var4 = 0;

      for (int var5 = 0; var5 < field19018.length; var5++) {
         if (var1.<Boolean>get(field19025.get(field19018[var5]))) {
            var4 |= 1 << var5;
         }
      }

      return var4;
   }
}
