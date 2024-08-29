package mapped;

public enum Class2156 {
   field14140 {
      @Override
      public boolean method8876(BlockState var1, Class1665 var2, BlockPos var3, Direction var4) {
         return Block.method11549(var1.method23416(var2, var3), var4);
      }
   },
   field14141 {
      private final int field14144 = 1;
      private final Class6408 field14145 = Block.method11539(7.0, 0.0, 7.0, 9.0, 10.0, 9.0);

      @Override
      public boolean method8876(BlockState blockState, Class1665 class1665, BlockPos var3, Direction var4) {
         return !Class8022.method27435(blockState.method23416(class1665, var3).method19526(var4), this.field14145, Class9477.field44039);
      }
   },
   field14142 {
      private final int field14146 = 2;
      private final Class6408 field14147 = Class8022.method27433(Class8022.method27426(), Block.method11539(2.0, 0.0, 2.0, 14.0, 16.0, 14.0), Class9477.field44041);

      @Override
      public boolean method8876(BlockState blockState, Class1665 class1665, BlockPos var3, Direction var4) {
         return !Class8022.method27435(blockState.method23416(class1665, var3).method19526(var4), this.field14147, Class9477.field44039);
      }
   };

   private static final Class2156[] field14143 = new Class2156[]{field14140, field14141, field14142};

   private Class2156() {
   }

   public abstract boolean method8876(BlockState var1, Class1665 var2, BlockPos var3, Direction var4);
}
