package mapped;

public class Class2769 extends Class2595 {
   private static String[] field17346;
   private final PandaEntity field17347;

   public Class2769(PandaEntity var1) {
      this.field17347 = var1;
   }

   @Override
   public boolean method10803() {
      if (this.field17347.isChild() && this.field17347.method5230()) {
         return this.field17347.method5213() && PandaEntity.method5232(this.field17347).nextInt(500) == 1
            ? true
            : PandaEntity.method5233(this.field17347).nextInt(6000) == 1;
      } else {
         return false;
      }
   }

   @Override
   public boolean method10806() {
      return false;
   }

   @Override
   public void startExecuting() {
      this.field17347.method5197(true);
   }
}
