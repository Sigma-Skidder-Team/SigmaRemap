package mapped;

public class Class2656 extends Class2647 {
   private static String[] field16989;
   public final Class1030 field17009;

   public Class2656(Class1030 var1, Class1030 var2) {
      super(var2, 1.0, false);
      this.field17009 = var1;
   }

   @Override
   public double method10859(Class880 var1) {
      if (!(this.field16990.getRidingEntity() instanceof Class1029)) {
         return super.method10859(var1);
      } else {
         float var4 = this.field16990.getRidingEntity().method3429() - 0.1F;
         return (double)(var4 * 2.0F * var4 * 2.0F + var1.method3429());
      }
   }
}
