package mapped;

public class Class2655 extends ZombieAttackGoal {
   private static String[] field16989;
   private final DrownedEntity field17008;

   public Class2655(DrownedEntity var1, double var2, boolean var4) {
      super(var1, var2, var4);
      this.field17008 = var1;
   }

   @Override
   public boolean method10803() {
      return super.method10803() && this.field17008.method4646(this.field17008.method4232());
   }

   @Override
   public boolean method10806() {
      return super.method10806() && this.field17008.method4646(this.field17008.method4232());
   }
}
