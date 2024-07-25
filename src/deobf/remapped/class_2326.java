package remapped;

import java.util.function.Function;

public class class_2326<T> implements class_3065<T> {
   private static String[] field_11630;
   private final Function<BlockPos, class_3065<T>> field_11631;

   public class_2326(Function<BlockPos, class_3065<T>> var1) {
      this.field_11631 = var1;
   }

   @Override
   public boolean method_14013(BlockPos var1, T var2) {
      return this.field_11631.apply(var1).method_14013(var1, (T)var2);
   }

   @Override
   public void method_14012(BlockPos var1, T var2, int var3, class_1716 var4) {
      this.field_11631.apply(var1).method_14012(var1, (T)var2, var3, var4);
   }

   @Override
   public boolean method_14010(BlockPos var1, T var2) {
      return false;
   }
}
