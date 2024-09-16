package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;

import javax.annotation.Nullable;

public class Class3200 extends Class3198 {
   private static String[] field18499;
   public static final Class8552<Class103> field18500 = Class8820.field39724;

   public Class3200(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public boolean method11492(BlockState var1, IWorldReader var2, BlockPos var3) {
      return method11508(var2, var3, method11509(var1).method536());
   }

   public static boolean method11508(IWorldReader var0, BlockPos var1, net.minecraft.util.Direction var2) {
      BlockPos var5 = var1.method8349(var2);
      return var0.getBlockState(var5).method23454(var0, var5, var2.method536());
   }

   @Nullable
   @Override
   public BlockState method11495(Class5909 var1) {
      for (net.minecraft.util.Direction var7 : var1.method18349()) {
         BlockState var8;
         if (var7.getAxis() != Direction.field414) {
            var8 = this.method11579().method23465(field18500, Class103.field314).method23465(field18484, var7.method536());
         } else {
            var8 = this.method11579()
               .method23465(field18500, var7 != net.minecraft.util.Direction.field673 ? Class103.field313 : Class103.field315)
               .method23465(field18484, var1.method18350());
         }

         if (var8.method23443(var1.method18360(), var1.method18345())) {
            return var8;
         }
      }

      return null;
   }

   @Override
   public BlockState method11491(BlockState var1, net.minecraft.util.Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return method11509(var1).method536() == var2 && !var1.method23443(var4, var5)
         ? Blocks.AIR.method11579()
         : super.method11491(var1, var2, var3, var4, var5, var6);
   }

   public static net.minecraft.util.Direction method11509(BlockState var0) {
      switch (Class7785.field33410[var0.<Class103>method23463(field18500).ordinal()]) {
         case 1:
            return net.minecraft.util.Direction.DOWN;
         case 2:
            return net.minecraft.util.Direction.field673;
         default:
            return var0.<net.minecraft.util.Direction>method23463(field18484);
      }
   }
}
