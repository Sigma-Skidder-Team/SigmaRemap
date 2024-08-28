package mapped;

public class Class2657 extends Class2647 {
   private static String[] field16989;

   public Class2657(Class1101 var1) {
      super(var1, 1.0, true);
   }

   @Override
   public boolean method10803() {
      return super.method10803() && !this.field16990.method3329();
   }

   @Override
   public boolean method10806() {
      float var3 = this.field16990.method3267();
      if (var3 >= 0.5F && this.field16990.method3013().nextInt(100) == 0) {
         this.field16990.method4233((Class880)null);
         return false;
      } else {
         return super.method10806();
      }
   }

   @Override
   public double method10859(Class880 var1) {
      return (double)(4.0F + var1.method3429());
   }
}
