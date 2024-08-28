package mapped;

public class Class2599 extends Class2598 {
   private static String[] field16836;
   private final Class1037 field16837;

   public Class2599(Class1022 var1, double var2, int var4, float var5) {
      super(var1, var2, var4, var5);
      this.field16837 = (Class1037)var1;
   }

   @Override
   public boolean method10803() {
      return super.method10803() && this.field16837.method3090().method32107() == Class8514.field38144;
   }

   @Override
   public void method10804() {
      super.method10804();
      this.field16837.method4304(true);
      this.field16837.method3154(Hand.field182);
   }

   @Override
   public void method10807() {
      super.method10807();
      this.field16837.method3162();
      this.field16837.method4304(false);
   }
}
