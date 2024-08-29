package mapped;

import javax.annotation.Nullable;
import java.util.function.Function;

public class Class4527 {
   private static String[] field21839;

   public static int[][] method14422(Direction var0) {
      Direction var3 = var0.method537();
      Direction var4 = var3.method536();
      Direction var5 = var0.method536();
      return new int[][]{
         {var3.method539(), var3.method541()},
         {var4.method539(), var4.method541()},
         {var5.method539() + var3.method539(), var5.method541() + var3.method541()},
         {var5.method539() + var4.method539(), var5.method541() + var4.method541()},
         {var0.method539() + var3.method539(), var0.method541() + var3.method541()},
         {var0.method539() + var4.method539(), var0.method541() + var4.method541()},
         {var5.method539(), var5.method541()},
         {var0.method539(), var0.method541()}
      };
   }

   public static boolean method14423(double var0) {
      return !Double.isInfinite(var0) && var0 < 1.0;
   }

   public static boolean method14424(Class1668 var0, Class880 var1, AxisAlignedBB var2) {
      return var0.method7055(var1, var2).allMatch(VoxelShape::method19516);
   }

   @Nullable
   public static Vector3d method14425(Class1668 var0, double var1, double var3, double var5, Class880 var7, Pose var8) {
      if (method14423(var3)) {
         Vector3d var11 = new Vector3d(var1, var3, var5);
         if (method14424(var0, var7, var7.method3172(var8).method19669(var11))) {
            return var11;
         }
      }

      return null;
   }

   public static VoxelShape method14426(Class1665 var0, BlockPos var1) {
      BlockState var4 = var0.getBlockState(var1);
      return !var4.method23446(BlockTags.field32804) && (!(var4.getBlock() instanceof Class3206) || !var4.<Boolean>method23463(Class3206.field18594))
         ? var4.method23414(var0, var1)
         : VoxelShapes.method27425();
   }

   public static double method14427(BlockPos var0, int var1, Function<BlockPos, VoxelShape> var2) {
      Mutable var5 = var0.method8354();
      int var6 = 0;

      while (var6 < var1) {
         VoxelShape var7 = (VoxelShape)var2.apply(var5);
         if (!var7.method19516()) {
            return (double)(var0.getY() + var6) + var7.method19512(Class113.field414);
         }

         var6++;
         var5.method8379(Direction.field673);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static Vector3d method14428(EntityType<?> var0, Class1668 var1, BlockPos var2, boolean var3) {
      if (var3 && var0.method33220(var1.getBlockState(var2))) {
         return null;
      } else {
         double var6 = var1.method7038(method14426(var1, var2), () -> method14426(var1, var2.down()));
         if (method14423(var6)) {
            if (var3 && var6 <= 0.0 && var0.method33220(var1.getBlockState(var2.down()))) {
               return null;
            } else {
               Vector3d var8 = Vector3d.method11331(var2, var6);
               return !var1.method7055((Entity)null, var0.getSize().method32097(var8)).allMatch(VoxelShape::method19516) ? null : var8;
            }
         } else {
            return null;
         }
      }
   }
}
