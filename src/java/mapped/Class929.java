package mapped;

public class Class929 extends Class927 implements Class930 {
   private static String[] field5260;
   private final Class7380 field5266;
   private final Class1660 field5267;
   private final BlockPos field5268;
   private boolean field5269;

   public Class929(Class7380 var1, Class1660 var2, BlockPos var3, Class8848 var4) {
      super(var4);
      this.field5266 = var1;
      this.field5267 = var2;
      this.field5268 = var3;
   }

   @Override
   public int method3630() {
      return 1;
   }

   @Override
   public int[] method3653(Direction var1) {
      return var1 != Direction.field672 ? new int[0] : new int[]{0};
   }

   @Override
   public boolean method3654(int var1, Class8848 var2, Direction var3) {
      return false;
   }

   @Override
   public boolean method3655(int var1, Class8848 var2, Direction var3) {
      return !this.field5269 && var3 == Direction.field672 && var2.method32107() == Class8514.field37934;
   }

   @Override
   public void method3622() {
      Class3475.method12171(this.field5266, this.field5267, this.field5268);
      this.field5269 = true;
   }
}
