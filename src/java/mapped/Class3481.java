package mapped;

public class Class3481 extends Class3480 {
   private static String[] field19333;
   private static final Class6408[] field19336 = new Class6408[]{
      Block.method11539(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      Block.method11539(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      Block.method11539(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      Block.method11539(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      Block.method11539(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      Block.method11539(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      Block.method11539(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      Block.method11539(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   public Class3481(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public Class3303 method12183() {
      return Items.field38053;
   }

   @Override
   public Class6408 method11483(BlockState var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field19336[var1.<Integer>method23463(this.method12175())];
   }
}
