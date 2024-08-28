package mapped;

public class Class6994 extends Class6991 {
   private static String[] field30267;

   public Class6994(Class1070 var1, Class1655 var2) {
      super(var1, var2);
   }

   @Override
   public Class9597 method21644(int var1) {
      this.field30257 = new Class6762();
      return new Class9597(this.field30257, var1);
   }

   @Override
   public boolean method21680(Class2163 var1) {
      return var1 != Class2163.field14190 && var1 != Class2163.field14196 && var1 != Class2163.field14195 ? super.method21680(var1) : true;
   }

   @Override
   public boolean method21672(BlockPos var1) {
      return this.field30244.method6738(var1).method23448(Blocks.LAVA) || super.method21672(var1);
   }
}
