package mapped;

public class StingGoal extends MeleeAttackGoal {
   private static String[] field16989;
   public final BeeEntity field17003;

   public StingGoal(BeeEntity var1, CreatureEntity var2, double var3, boolean var5) {
      super(var2, var3, var5);
      this.field17003 = var1;
   }

   @Override
   public boolean method10803() {
      return super.method10803() && this.field17003.method4369() && !this.field17003.method4440();
   }

   @Override
   public boolean method10806() {
      return super.method10806() && this.field17003.method4369() && !this.field17003.method4440();
   }
}
