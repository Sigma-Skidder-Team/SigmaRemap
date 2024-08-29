package mapped;

public class Class2629 extends Class2628 {
   private static String[] field16938;
   private final Class1037 field16939;

   public Class2629(Class1037 var1, double var2) {
      super(var1, var2, 8, 2);
      this.field16939 = var1;
   }

   @Override
   public boolean method10803() {
      return super.method10803()
         && !this.field16939.world.method6740()
         && this.field16939.method3250()
         && this.field16939.getPosY() >= (double)(this.field16939.world.method6776() - 3);
   }

   @Override
   public boolean method10806() {
      return super.method10806();
   }

   @Override
   public boolean method10840(Class1662 var1, BlockPos var2) {
      BlockPos var5 = var2.method8311();
      return var1.method7007(var5) && var1.method7007(var5.method8311()) ? var1.getBlockState(var2).method23419(var1, var2, this.field16939) : false;
   }

   @Override
   public void method10804() {
      this.field16939.method4649(false);
      Class1037.method4650(this.field16939, this.field16939.field5757);
      super.method10804();
   }

   @Override
   public void method10807() {
      super.method10807();
   }
}
