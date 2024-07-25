package remapped;

public interface class_1678 {
   boolean method_7514(BlockPos var1, class_2522 var2, int var3, int var4);

   default boolean method_7513(BlockPos var1, class_2522 var2, int var3) {
      return this.method_7514(var1, var2, var3, 512);
   }

   boolean method_7508(BlockPos var1, boolean var2);

   default boolean method_7510(BlockPos var1, boolean var2) {
      return this.method_7511(var1, var2, (Entity)null);
   }

   default boolean method_7511(BlockPos var1, boolean var2, Entity var3) {
      return this.method_7512(var1, var2, var3, 512);
   }

   boolean method_7512(BlockPos var1, boolean var2, Entity var3, int var4);

   default boolean method_7509(Entity var1) {
      return false;
   }
}
