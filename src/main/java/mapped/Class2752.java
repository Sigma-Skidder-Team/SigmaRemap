package mapped;

public class Class2752 extends Class2747 {
   private static String[] field17280;
   public final PolarBearEntity field17290;

   public Class2752(PolarBearEntity var1) {
      super(var1, 2.0);
      this.field17290 = var1;
   }

   @Override
   public boolean method10803() {
      return !this.field17290.isChild() && !this.field17290.isBurning() ? false : super.method10803();
   }
}
