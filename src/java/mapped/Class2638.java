package mapped;

public class Class2638 extends Class2628 {
   private static String[] field16960;
   private final Class1070 field16961;

   public Class2638(Class1070 var1, double var2) {
      super(var1, var2, 8, 2);
      this.field16961 = var1;
   }

   @Override
   public BlockPos method10836() {
      return this.field16933;
   }

   @Override
   public boolean method10806() {
      return !this.field16961.method3264() && this.method10840(this.field16961.field5024, this.field16933);
   }

   @Override
   public boolean method10803() {
      return !this.field16961.method3264() && super.method10803();
   }

   @Override
   public boolean method10837() {
      return this.field16931 % 20 == 0;
   }

   @Override
   public boolean method10840(Class1662 var1, BlockPos var2) {
      return var1.method6738(var2).method23448(Blocks.LAVA) && var1.method6738(var2.method8311()).method23440(var1, var2, Class1947.field12614);
   }
}
