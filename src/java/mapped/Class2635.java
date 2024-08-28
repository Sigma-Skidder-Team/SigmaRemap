package mapped;

public class Class2635 extends Class2628 {
   private static String[] field16953;
   private final Class1088 field16954;

   public Class2635(Class1088 var1, double var2) {
      super(var1, !var1.method3005() ? var2 : 2.0, 24);
      this.field16954 = var1;
      this.field16937 = -1;
   }

   @Override
   public boolean method10806() {
      return !this.field16954.method3250() && this.field16931 <= 1200 && this.method10840(this.field16954.field5024, this.field16933);
   }

   @Override
   public boolean method10803() {
      if (this.field16954.method3005() && !this.field16954.method3250()) {
         return super.method10803();
      } else {
         return !Class1088.method5058(this.field16954) && !this.field16954.method3250() && !this.field16954.method5045() ? super.method10803() : false;
      }
   }

   @Override
   public boolean method10837() {
      return this.field16931 % 160 == 0;
   }

   @Override
   public boolean method10840(Class1662 var1, BlockPos var2) {
      return var1.method6738(var2).method23448(Blocks.WATER);
   }
}
