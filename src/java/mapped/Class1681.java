package mapped;

public interface Class1681 {
   boolean method6726(BlockPos var1, BlockState var2, int var3, int var4);

   default boolean method6725(BlockPos var1, BlockState var2, int var3) {
      return this.method6726(var1, var2, var3, 512);
   }

   boolean method6728(BlockPos var1, boolean var2);

   default boolean method7179(BlockPos var1, boolean var2) {
      return this.method7180(var1, var2, (Entity)null);
   }

   default boolean method7180(BlockPos var1, boolean var2, Entity var3) {
      return this.method6729(var1, var2, var3, 512);
   }

   boolean method6729(BlockPos var1, boolean var2, Entity var3, int var4);

   default boolean method6916(Entity var1) {
      return false;
   }
}
