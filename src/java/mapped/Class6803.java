package mapped;

import java.util.function.Function;

public class Class6803<T> implements Class6802<T> {
   private static String[] field29615;
   private final Function<BlockPos, Class6802<T>> field29616;

   public Class6803(Function<BlockPos, Class6802<T>> var1) {
      this.field29616 = var1;
   }

   @Override
   public boolean method20718(BlockPos var1, T var2) {
      return this.field29616.apply(var1).method20718(var1, (T)var2);
   }

   @Override
   public void method20719(BlockPos var1, T var2, int var3, Class2199 var4) {
      this.field29616.apply(var1).method20719(var1, (T)var2, var3, var4);
   }

   @Override
   public boolean method20720(BlockPos var1, T var2) {
      return false;
   }
}
