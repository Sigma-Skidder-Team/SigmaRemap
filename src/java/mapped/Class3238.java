package mapped;

import com.google.common.collect.UnmodifiableIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.Util;
import net.minecraft.util.Direction;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

import java.util.Map;

public class Class3238 extends Block implements Class3207 {
   private static String[] field18679;
   public static final Class8551 field18680 = Class3392.field19019;
   public static final Class8551 field18681 = Class3392.field19020;
   public static final Class8551 field18682 = Class3392.field19021;
   public static final Class8551 field18683 = Class3392.field19022;
   public static final Class8551 field18684 = Class8820.field39710;
   public static final Map<Direction, Class8551> field18685 = Class3392.field19025
      .entrySet()
      .stream()
      .filter(var0 -> var0.getKey().getAxis().method324())
      .collect(Util.<Direction, Class8551>method38484());
   public final VoxelShape[] field18686;
   public final VoxelShape[] field18687;
   private final Object2IntMap<BlockState> field18688 = new Object2IntOpenHashMap();

   public Class3238(float var1, float var2, float var3, float var4, float var5, AbstractBlock var6) {
      super(var6);
      this.field18686 = this.method11639(var1, var2, var5, 0.0F, var5);
      this.field18687 = this.method11639(var1, var2, var3, 0.0F, var4);
      UnmodifiableIterator var9 = this.field18612.getValidStates().iterator();

      while (var9.hasNext()) {
         BlockState var10 = (BlockState)var9.next();
         this.method11641(var10);
      }
   }

   public VoxelShape[] method11639(float var1, float var2, float var3, float var4, float var5) {
      float var8 = 8.0F - var1;
      float var9 = 8.0F + var1;
      float var10 = 8.0F - var2;
      float var11 = 8.0F + var2;
      VoxelShape var12 = Block.method11539((double)var8, 0.0, (double)var8, (double)var9, (double)var3, (double)var9);
      VoxelShape var13 = Block.method11539((double)var10, (double)var4, 0.0, (double)var11, (double)var5, (double)var11);
      VoxelShape var14 = Block.method11539((double)var10, (double)var4, (double)var10, (double)var11, (double)var5, 16.0);
      VoxelShape var15 = Block.method11539(0.0, (double)var4, (double)var10, (double)var11, (double)var5, (double)var11);
      VoxelShape var16 = Block.method11539((double)var10, (double)var4, (double)var10, 16.0, (double)var5, (double)var11);
      VoxelShape var17 = VoxelShapes.method27431(var13, var16);
      VoxelShape var18 = VoxelShapes.method27431(var14, var15);
      VoxelShape[] var19 = new VoxelShape[]{
         VoxelShapes.method27425(),
         var14,
         var15,
         var18,
         var13,
         VoxelShapes.method27431(var14, var13),
         VoxelShapes.method27431(var15, var13),
         VoxelShapes.method27431(var18, var13),
         var16,
         VoxelShapes.method27431(var14, var16),
         VoxelShapes.method27431(var15, var16),
         VoxelShapes.method27431(var18, var16),
         var17,
         VoxelShapes.method27431(var14, var17),
         VoxelShapes.method27431(var15, var17),
         VoxelShapes.method27431(var18, var17)
      };

      for (int var20 = 0; var20 < 16; var20++) {
         var19[var20] = VoxelShapes.method27431(var12, var19[var20]);
      }

      return var19;
   }

   @Override
   public boolean method11493(BlockState var1, IBlockReader var2, BlockPos var3) {
      return !var1.<Boolean>method23463(field18684);
   }

   @Override
   public VoxelShape method11483(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return this.field18687[this.method11641(var1)];
   }

   @Override
   public VoxelShape method11502(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return this.field18686[this.method11641(var1)];
   }

   private static int method11640(Direction var0) {
      return 1 << var0.method534();
   }

   public int method11641(BlockState var1) {
      return this.field18688.computeIntIfAbsent(var1, var0 -> {
         int var3 = 0;
         if (var0.<Boolean>method23463(field18680)) {
            var3 |= method11640(Direction.NORTH);
         }

         if (var0.<Boolean>method23463(field18681)) {
            var3 |= method11640(Direction.EAST);
         }

         if (var0.<Boolean>method23463(field18682)) {
            var3 |= method11640(Direction.SOUTH);
         }

         if (var0.<Boolean>method23463(field18683)) {
            var3 |= method11640(Direction.WEST);
         }

         return var3;
      });
   }

   @Override
   public FluidState method11498(BlockState var1) {
      return !var1.<Boolean>method23463(field18684) ? super.method11498(var1) : Class9479.field44066.method25078(false);
   }

   @Override
   public boolean method11494(BlockState var1, IBlockReader var2, BlockPos var3, Class1947 var4) {
      return false;
   }

   @Override
   public BlockState method11500(BlockState var1, Rotation var2) {
      switch (Class8947.field40455[var2.ordinal()]) {
         case 1:
            return var1.method23465(field18680, var1.<Boolean>method23463(field18682))
               .method23465(field18681, var1.<Boolean>method23463(field18683))
               .method23465(field18682, var1.<Boolean>method23463(field18680))
               .method23465(field18683, var1.<Boolean>method23463(field18681));
         case 2:
            return var1.method23465(field18680, var1.<Boolean>method23463(field18681))
               .method23465(field18681, var1.<Boolean>method23463(field18682))
               .method23465(field18682, var1.<Boolean>method23463(field18683))
               .method23465(field18683, var1.<Boolean>method23463(field18680));
         case 3:
            return var1.method23465(field18680, var1.<Boolean>method23463(field18683))
               .method23465(field18681, var1.<Boolean>method23463(field18680))
               .method23465(field18682, var1.<Boolean>method23463(field18681))
               .method23465(field18683, var1.<Boolean>method23463(field18682));
         default:
            return var1;
      }
   }

   @Override
   public BlockState method11501(BlockState var1, Class2089 var2) {
      switch (Class8947.field40456[var2.ordinal()]) {
         case 1:
            return var1.method23465(field18680, var1.<Boolean>method23463(field18682)).method23465(field18682, var1.<Boolean>method23463(field18680));
         case 2:
            return var1.method23465(field18681, var1.<Boolean>method23463(field18683)).method23465(field18683, var1.<Boolean>method23463(field18681));
         default:
            return super.method11501(var1, var2);
      }
   }
}
