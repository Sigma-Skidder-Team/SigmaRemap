package mapped;

public class Class2609 extends Class2608 {
   private static String[] field16859;
   public final FoxEntity field16863;

   public Class2609(FoxEntity var1, int var2, int var3) {
      super(var1, var3);
      this.field16863 = var1;
   }

   @Override
   public void method10804() {
      FoxEntity.method5167(this.field16863);
      super.method10804();
   }

   @Override
   public boolean method10803() {
      return super.method10803() && this.method10816();
   }

   @Override
   public boolean method10806() {
      return super.method10806() && this.method10816();
   }

   private boolean method10816() {
      return !this.field16863.isSleeping() && !this.field16863.method5129() && !FoxEntity.method5168(this.field16863) && this.field16863.method4232() == null;
   }
}
