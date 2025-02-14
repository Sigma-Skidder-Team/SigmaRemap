package mapped;

public class Class2765 extends FollowParentGoal {
   private static String[] field17332;
   private final FoxEntity field17337;
   public final FoxEntity field17338;

   public Class2765(FoxEntity var1, FoxEntity var2, double var3) {
      super(var2, var3);
      this.field17338 = var1;
      this.field17337 = var2;
   }

   @Override
   public boolean method10803() {
      return !FoxEntity.method5168(this.field17337) && super.method10803();
   }

   @Override
   public boolean method10806() {
      return !FoxEntity.method5168(this.field17337) && super.method10806();
   }

   @Override
   public void startExecuting() {
      FoxEntity.method5167(this.field17337);
      super.startExecuting();
   }
}
