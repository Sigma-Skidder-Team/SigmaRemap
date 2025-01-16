package mapped;

public class Class2604 extends Class2603 {
   private static String[] field16848;
   public final FoxEntity field16850;

   public Class2604(FoxEntity var1) {
      super(var1);
      this.field16850 = var1;
   }

   @Override
   public void method10804() {
      super.method10804();
      FoxEntity.method5167(this.field16850);
   }

   @Override
   public boolean method10803() {
      return this.field16850.isInWater() && this.field16850.method3427(FluidTags.field40469) > 0.25 || this.field16850.isInLava();
   }
}
